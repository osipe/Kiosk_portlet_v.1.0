<%@page import="com.alpha.portlet.quy_hoach.service.BieuDoQuyHoachLocalServiceUtil"%>
<%@page import="com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@include file="/html/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	long bieuDoQuyHoachId = ParamUtil.getLong(request, "bieuDoQuyHoachId");
	BieuDoQuyHoach bieuDoQuyHoach = null;
	if(bieuDoQuyHoachId > 0){
		bieuDoQuyHoach = BieuDoQuyHoachLocalServiceUtil.fetchBieuDoQuyHoach(bieuDoQuyHoachId);
	}
	if(bieuDoQuyHoach == null){
		bieuDoQuyHoach = BieuDoQuyHoachLocalServiceUtil.createBieuDoQuyHoach(0L);
	}
%>
<aui:form name="frmAdd" enctype="multipart/form-data">
	<table class="info table-pa5 aui-w100">
		<tr>
			<td>
				<aui:input class="input-text" name="ten" label="Tên" value="<%=bieuDoQuyHoach.getTen() %>">
					<aui:validator name="required" errorMessage="Tên không được bỏ trống!" />
				</aui:input>
			</td>
			<td>
				<aui:input class="input-text" name="ma" label="Mã" value="<%=bieuDoQuyHoach.getMa() %>">
				</aui:input>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<aui:input name="moTa" type="textarea" label="Mô tả" value="<%=bieuDoQuyHoach.getMoTa() %>">
				</aui:input>
			</td>
		</tr>
		<tr>
			<td>
				<aui:input name="fileData" label="Upload File" type="file">
					<aui:validator name="required" errorMessage="Tên không được bỏ trống!" />
				</aui:input>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<button id="<portlet:namespace />luu" type="button" class="btn btn-labeled btn-default" onclick="save(true);">
					<span class="btn-label"><i class="glyphicon glyphicon-floppy-disk"></i></span><%=bieuDoQuyHoachId == 0 ? "Lưu" : "Cập nhật" %>
				</button>
				<%
					if(bieuDoQuyHoachId == 0){
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
<portlet:resourceURL var="uploadURL" id="uploadURL"></portlet:resourceURL>
<aui:script use="aui-base,aui-io-plugin-deprecated,aui-loading-mask-deprecated,io-upload-iframe">
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
			var file = $('#<portlet:namespace />fileData').prop("files")[0];
			var data = {
				<portlet:namespace />tenFile : file.name
			}
			A.io.request('${addURL}', {
	               method: 'post',
	               enctype: "multipart/form-data",
	               form: {
	                   id: form,
	                   upload: true,
	               },
	               data : data,
	               on: {
	            	   complete: function(response) {
	            		   if(close){
	            			 	Liferay.Util.getOpener().dongPopup();
              					Liferay.Util.getOpener().thongBao();
	            		   }else{
	            			  	refreshData();
	              				toastr.success('Thêm thành công', 'Thông báo!');
	            		   }
	            		   Liferay.Util.getOpener().search();
	                   },
	                   failure : function() {
	                	   toastr.success('Thao tác thất bại', 'lỗi!');
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
	A.one('#<portlet:namespace />fileData').on('change',function(e){
	
	});
});
</aui:script>
