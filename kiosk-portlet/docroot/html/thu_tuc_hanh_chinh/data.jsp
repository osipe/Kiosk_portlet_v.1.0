<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.alpha.portlet.danh_muc.model.LoaiHoSo"%>
<%@page import="com.alpha.portlet.danh_muc.service.LoaiHoSoLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>
<%
	String ten = ParamUtil.getString(request, "ten");
%>
<aui:form name="frmDS" method="post">
	<liferay-portlet:renderURL varImpl="iteratorURL" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/thu_tuc_hanh_chinh/data.jsp" />
		<portlet:param name="ten" value="<%=ten %>" />
	</liferay-portlet:renderURL>
	<liferay-ui:search-container var="searchContainer" emptyResultsMessage="there-are-no-results" iteratorURL="<%=iteratorURL %>" delta="10" deltaConfigurable="false" >
		<%
			List<LoaiHoSo> items = LoaiHoSoLocalServiceUtil.findBy_C_G_H_T_M_M(0, 0, 
					1, 0, ten, null, 
					null, true, searchContainer.getStart(), searchContainer.getEnd(), searchContainer.getOrderByComparator());
			int count = LoaiHoSoLocalServiceUtil.countBy_C_G_H_T_M_M(0, 0, 1, 0, ten, null, 
					null, true);
		%>
		<liferay-ui:search-container-results total="<%=count%>" results="<%=items%>"/>
		<liferay-ui:search-container-row className="com.alpha.portlet.danh_muc.model.LoaiHoSo" escapedModel="<%= true %>" modelVar="item" rowVar="entry" keyProperty="loaiHoSoId">
			<liferay-ui:search-container-column-text name="STT" align="center" cssClass="aui-w3" value="<%=String.valueOf(searchContainer.getStart() + index + 1)%>"/>
			<liferay-ui:search-container-column-text name="Lĩnh vực" align="center" property="tenLinhVuc" cssClass="aui-w35"/>
			<liferay-ui:search-container-column-text name="Tên thủ tục" align="center" property="ten" href="<%= item.getBaiVietURL() %>"/>
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="${searchContainer}" />
	</liferay-ui:search-container>
</aui:form>
<aui:script use="aui-base,aui-io-plugin-deprecated,aui-loading-mask-deprecated">
AUI().ready(['aui-base'], function(A) {
	Liferay.Data.redirectURL = '${iteratorURL}';
	var recordSearchContainer = A.one('#<portlet:namespace />contentDataTable');
	var loadingMask = new A.LoadingMask(
		{
			target: recordSearchContainer
		}
	);
	var plugin = recordSearchContainer.plug(A.Plugin.IO,{
        autoLoad: false,
        failureMessage : 'Loading...'
    });
	var pageIO = plugin.io;
	recordSearchContainer.all('ul.dropdown-menu.lfr-menu-list.direction-down a').on('click', function(e) {
    	e.preventDefault();
    	e.stopPropagation();
    	console.log(e.currentTarget);
    	return false;
    });
    recordSearchContainer.all('ul.lfr-pagination-buttons.pager a').on('click', function(e) {
    	e.preventDefault();
    	if(e.currentTarget.get('href') != 'javascript:;'){
    		Liferay.Data.redirectURL = e.currentTarget.get('href');
        	pageIO.set('uri', e.currentTarget.get('href'));
        	pageIO.start();
    	}
    });
    recordSearchContainer.all('div.table-sort-liner a').on('click', function(e) {
    	e.preventDefault();
    	Liferay.Data.redirectURL = e.currentTarget.get('href');
    	pageIO.set('uri', e.currentTarget.get('href'));
    	pageIO.start();
    });
});	
</aui:script>
	