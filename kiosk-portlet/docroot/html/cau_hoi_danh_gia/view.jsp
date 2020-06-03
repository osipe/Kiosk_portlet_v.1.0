<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/html/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<portlet:renderURL var="addURL"
	windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/html/cau_hoi_danh_gia/add.jsp" />
</portlet:renderURL>
<portlet:renderURL var="searchURL"
	windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/cau_hoi_danh_gia/data.jsp" />
</portlet:renderURL>
<aui:form name="frm">
<button type="button" class="btn btn-labeled btn-danger" onclick="openDialog()">
	<span class="btn-label"><i class="icon-plus-sign"></i> Thêm</span>
</button>
 <fieldset class="fieldset-border" >
 	<legend class="legend-border">Thông tin tìm kiếm</legend>
	<table class="info table-pa5 aui-w100">
			<tr>
				<td>
					<aui:input class="input-text" name="ten" label="Tên">
					</aui:input>
				</td>
				<td>
					<aui:input class="input-text"  name="ma"  label="Mã">
					</aui:input>
				</td>
			</tr>
			<tr>
				<td>
					<aui:select class="input-text" name="boCauHoi" label="Bộ câu hỏi">
						<aui:option value="0" label="Tất cả" selected="true"/>
					 	 <aui:option value="1" label="Đánh giá cán bộ"  />
						 <aui:option value="2" label="Đánh giá thủ tục" />
					</aui:select>
				</td>
				<td>
					<aui:select name="hoatDong" label="Hoạt động">
						 <aui:option value="0" label="Tất cả" />
					 	 <aui:option value="1" label="Hoạt động" selected="true" />
						 <aui:option value="2" label="Ngưng hoạt động" />
					</aui:select>
				</td>
			</tr>
			<tr>
				<td  colspan="2">
					<button  type="button" class="btn-search-file btn" id="idSeachBtn" onclick="search();">Tìm kiếm</button>
				</td>
			</tr>
		</table>
 </fieldset>
 <div id="<portlet:namespace />contentDataTable" name="<portlet:namespace />contentDataTable"></div>
</aui:form>
<aui:script use="aui-base,aui-io-plugin-deprecated,aui-loading-mask-deprecated">
AUI().ready(['aui-base'], function(A) {
	var contentDataTable = A.one('#<portlet:namespace />contentDataTable');
	var loadingMask = new A.LoadingMask(
		{
			target: A.getBody()
		}
	);
	Liferay.provide(window,'search', function(){
		loadingMask.show();
		var data = {
        	'<portlet:namespace/>ten' : A.one('#<portlet:namespace />ten').val(),
        	'<portlet:namespace/>ma' : A.one('#<portlet:namespace />ma').val(),
        	'<portlet:namespace/>hoatDong' : A.one('#<portlet:namespace />hoatDong').val(),
        	'<portlet:namespace/>boCauHoi' : A.one('#<portlet:namespace />boCauHoi').val(),
        }
		contentDataTable.plug(A.Plugin.IO,{
            autoLoad: false,
            uri : '${searchURL}',
			data : data,
			after: {
				success: function() {
					loadingMask.hide();
				}
			}
        });
        var contentIO = contentDataTable.io;
        if(contentIO){
			contentIO.start();
        }
	});
	Liferay.provide(window,'openDialog', function(){
		Liferay.Util.openWindow({
			dialog : {
				centered : true,
				height : 600,
				modal : true,
				width : 1000
			},
			id : '<portlet:namespace />dialogAdd',
			title : 'Thêm',
			uri : '${addURL}'
		});
	});
	Liferay.provide(window,'dongPopup', function(){
		var dialog = Liferay.Util.Window.getById('<portlet:namespace />dialogAdd');
		if(dialog){
			dialog.destroy();
		}
	});
	Liferay.provide(window,'thongBao', function(){
		toastr.success('Thêm thành công', 'Thông báo!');
	});
	search();
});
</aui:script>