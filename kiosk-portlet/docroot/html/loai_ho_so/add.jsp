<%@page import="com.alpha.portlet.danh_muc.service.LinhVucLocalServiceUtil"%>
<%@page import="com.alpha.portlet.danh_muc.model.LoaiHoSo"%>
<%@page import="com.alpha.portlet.danh_muc.model.LinhVuc"%>
<%@page import="com.alpha.portlet.danh_muc.service.LoaiHoSoLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="java.util.List"%>
<%@include file="/html/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	long loaiHoSoId = ParamUtil.getLong(request, "loaiHoSoId");
	List<LinhVuc> linhVucs = LinhVucLocalServiceUtil.findByHoatDong(true);
	long linhVucId = 0;
	LoaiHoSo loaiHoSo = null;
	if(loaiHoSoId > 0){
		loaiHoSo = LoaiHoSoLocalServiceUtil.fetchLoaiHoSo(loaiHoSoId);
		if(loaiHoSo != null){
			linhVucId = loaiHoSo.getLinhVucId();
		}
	}
	if(loaiHoSo == null){
		loaiHoSo = LoaiHoSoLocalServiceUtil.createLoaiHoSo(0L);
		loaiHoSo.setDoUuTien(100);
		loaiHoSo.setHoatDong(true);
	}
%>
<aui:form name="frmAdd">
	<table class="info table-pa5 aui-w100">
		<tr>
			<td>
				<aui:input class="input-text" name="ten" label="Tên" value="<%=loaiHoSo.getTen() %>">
					<aui:validator name="required" errorMessage="Tên không được bỏ trống!" />
				</aui:input>
			</td>
			<td>
				<aui:input class="input-text" name="ma" label="Mã" value="<%=loaiHoSo.getMa() %>">
				</aui:input>
			</td>
		</tr>
		<tr>
			<td>
				<aui:select name="linhVucId" label="Lĩnh vực" cssClass="input-select2">
					<aui:option value="0" label="Chọn" />
					<%
						for(LinhVuc linhVuc : linhVucs){
							long lvId = linhVuc.getLinhVucId();
							String lvTen = linhVuc.getTen();
							boolean selected = false;
							if(linhVucId > 0 && linhVucId == lvId){
								selected = true;
							}
					%>
					
						<aui:option value="<%= lvId%>" label="<%=lvTen %>" 
							selected="<%=  selected%>">
						</aui:option>
					<%
						}
					%>
				</aui:select>
			</td>
			<td>
				<aui:input class="input-text" name="doUuTien" label="Độ ưu tiên" value="<%=loaiHoSo.getDoUuTien() %>">
				</aui:input>
			</td>
		</tr>
		<tr>
			<td>
				<aui:input class="input-text" name="baiVietURL" label="Bài viết URL" value="<%=loaiHoSo.getBaiVietURL() %>">
				</aui:input>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<aui:input name="moTa" type="textarea" label="Mô tả" value="<%=loaiHoSo.getMoTa() %>">
				</aui:input>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<button id="<portlet:namespace />luu" type="button" class="btn btn-labeled btn-default" onclick="save(true);">
					<span class="btn-label"><i class="glyphicon glyphicon-floppy-disk"></i></span><%=loaiHoSoId == 0 ? "Lưu" : "Cập nhật" %>
				</button>
				<%
					if(loaiHoSoId == 0){
				%>
					<button id="<portlet:namespace />luuvanhaptiep" onclick="save(false);" type="button" class="btn btn-labeled btn-primary">
						<span class="btn-label"><i class="glyphicon glyphicon-copy"></i></span>Lưu và nhập tiếp
					</button>
				<%
					} 
				%>
				<button id="<portlet:namespace />dong" onclick="Liferay.Util.getOpener().dongPopup();" type="button"class="btn btn-labeled btn-danger">
					<span class="btn-label"><i class="glyphicon glyphicon-remove-circle"></i></span>Đóng
				</button>
			</td>
		</tr>
	</table>
</aui:form>
<portlet:resourceURL var="addURL" id="addOrUpdateURL"></portlet:resourceURL>
<aui:script use="aui-base,aui-io-plugin-deprecated,aui-loading-mask-deprecated">
AUI().ready(['aui-base'], function(A) {
	var form  = A.one('#<portlet:namespace />frmAdd');
	var loadingMask = new A.LoadingMask(
		{
			target: form
		}
	);
	var formValidator = Liferay.Form.get('<portlet:namespace />frmAdd').formValidator;
	Liferay.provide(window,'save', function(close){
		loadingMask.show();
		formValidator.validate();
		if(!formValidator.hasErrors()){
			var data = {
				<portlet:namespace />loaiHoSoId : '<%=loaiHoSoId %>',
				<portlet:namespace />ten : A.one('#<portlet:namespace />ten').val(),
				<portlet:namespace />ma : A.one('#<portlet:namespace />ma').val(),
				<portlet:namespace />moTa : A.one('#<portlet:namespace />moTa').val(),
				<portlet:namespace />doUuTien : A.one('#<portlet:namespace />doUuTien').val(),
				<portlet:namespace />linhVucId : A.one('#<portlet:namespace />linhVucId').val(),
				<portlet:namespace />baiVietURL : A.one('#<portlet:namespace />baiVietURL').val(),
			}
			A.io.request('${addURL}', {
	               method: 'post',
	               data: data,
	               on: {
	                   success: function() {
	                   		if(this.get('responseData')){
	                   			var data = JSON.parse(this.get('responseData'));
	                   			if(!data.exception){
	                   				refreshData();
	                   				Liferay.Util.getOpener().search();
	                   				if(close){
	                   					Liferay.Util.getOpener().dongPopup();
	                   					Liferay.Util.getOpener().thongBao();
	                   				}else{
	                   					toastr.success('Thêm thành công', 'Thông báo!');
	                   				}
	                   			}else{
	                   					toastr.error('Yêu cầu thực hiện không thành công', 'Lỗi!');
	                   			}
	                   		}
	                   },
	                   failure : function() {
						}
	              }
	        });
        }
        loadingMask.hide();
	});
	Liferay.provide(window,'refreshData', function(){
		form.all('input').each(function(node){
			node.val('');
		});
		form.all('textarea').each(function(node){
			node.val('');
		});
	});
});
</aui:script>