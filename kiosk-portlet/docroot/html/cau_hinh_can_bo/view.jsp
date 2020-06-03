<%@page import="com.alpha.portlet.util.JSONReaderUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.alpha.portlet.util.CauHinhCanBoUtil"%>
<%@page import="com.alpha.portlet.dto.CauHinhCanBoDTO"%>
<%@page import="com.alpha.portlet.dmdc.service.PhanQuyenLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.alpha.portlet.dto.UserDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/html/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	long cauHinhId = 0;
	List<UserDTO> userDTOs = new ArrayList<UserDTO>();
	int count = 0;
	long companyId = PhanQuyenLocalServiceUtil.getCompanyId();
	CauHinhCanBoDTO cauHinhDTO = CauHinhCanBoUtil.getCauHinhCanBo(companyId);
	if(cauHinhDTO != null){
		cauHinhId = cauHinhDTO.getCauHinhId();
		JSONArray jsArr = cauHinhDTO.getJsArray();
		if(jsArr != null && jsArr.length() > 0){
			userDTOs = JSONReaderUtil.convertJSONArrayToListUserDTO(jsArr);
			count = userDTOs.size();
		}
	}
%>	
	
<portlet:renderURL var="addURL"
	windowState="<%=LiferayWindowState.POP_UP.toString()%>">
	<portlet:param name="mvcPath" value="/html/cau_hinh_can_bo/add.jsp" />
</portlet:renderURL>
<aui:form name="frm">
<button type="button" class="btn btn-labeled btn-danger" onclick="openDialog()">
	<span class="btn-label"><i class="icon-plus-sign"></i> Cấu hình</span>
</button>
<h3>Danh sách cán bộ được đánh giá</h3>
<liferay-ui:search-container var="searchContainer" emptyResultsMessage="there-are-no-results" delta="10" deltaConfigurable="false" >
<liferay-ui:search-container-results total="<%=count%>" results="<%=userDTOs%>"/>
<liferay-ui:search-container-row className="com.alpha.portlet.dto.UserDTO" escapedModel="<%= true %>" modelVar="item" rowVar="entry" keyProperty="userId">
	<liferay-ui:search-container-column-text name="STT" align="center" cssClass="aui-w5" value="<%=String.valueOf(searchContainer.getStart() + index + 1)%>"/>
	<liferay-ui:search-container-column-text name="Cán bộ" align="center" property="fullname"/>
	<liferay-ui:search-container-column-text name="Phòng ban" align="center" property="orgName"/>
	<liferay-ui:search-container-column-text name="Vai trò" align="center" property="roleName"/>
</liferay-ui:search-container-row>
<liferay-ui:search-iterator searchContainer="${searchContainer}" />
</liferay-ui:search-container>	
</aui:form>
<aui:script use="aui-base,aui-io-plugin-deprecated,aui-loading-mask-deprecated">
AUI().ready(['aui-base'], function(A) {
	var loadingMask = new A.LoadingMask(
		{
			target: A.getBody()
		}
	);
	Liferay.provide(window,'openDialog', function(){
		Liferay.Util.openWindow({
			dialog : {
				centered : true,
				height : 600,
				modal : true,
				width : 1000
			},
			id : '<portlet:namespace />dialogAdd',
			title : 'Cấu hình',
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
	Liferay.provide(window,'refreshPage', function(){
		window.location.reload();
	});
});
</aui:script>