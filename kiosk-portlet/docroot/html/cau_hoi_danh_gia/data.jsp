<%@page import="com.alpha.portlet.danh_gia_hai_long.model.CauHoi"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.alpha.portlet.danh_gia_hai_long.service.CauHoiLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>
<%
	String ten = ParamUtil.getString(request, "ten");
	String ma = ParamUtil.getString(request, "ma");
	String moTa = ParamUtil.getString(request, "moTa");
	int hoatDong = ParamUtil.getInteger(request, "hoatDong");
	int doUuTien = ParamUtil.getInteger(request, "doUuTien");
	int boCauHoi = ParamUtil.getInteger(request, "boCauHoi");
%>
<aui:form name="frmDS" method="post">
	<liferay-portlet:renderURL varImpl="iteratorURL" windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
		<portlet:param name="mvcPath" value="/html/bieudoquyhoach/data.jsp" />
		<portlet:param name="ten" value="<%=ten %>" />
		<portlet:param name="ma" value="<%=ma %>" />
		<portlet:param name="moTa" value="<%= moTa %>" />
		<portlet:param name="hoatDong" value="<%= String.valueOf(hoatDong) %>" />
	</liferay-portlet:renderURL>
	<liferay-ui:search-container var="searchContainer" emptyResultsMessage="there-are-no-results" iteratorURL="<%=iteratorURL %>" delta="10" deltaConfigurable="false" >
		<%
			List<CauHoi> items = CauHoiLocalServiceUtil.findBy_C_G_H_B_T_M_M(0, 0, 
					hoatDong, boCauHoi, ten, ma, moTa, 
					true, searchContainer.getStart(), 
					searchContainer.getEnd(), searchContainer.getOrderByComparator());
			int count = CauHoiLocalServiceUtil.countBy_C_G_H_B_T_M_M(0, 0, 
					hoatDong, boCauHoi, ten, ma, moTa, 
					true);
		%>
		<liferay-ui:search-container-results total="<%=count%>" results="<%=items%>"/>
		<liferay-ui:search-container-row className="com.alpha.portlet.danh_gia_hai_long.model.CauHoi" escapedModel="<%= true %>" modelVar="item" rowVar="entry" keyProperty="cauHoiId">
			<portlet:renderURL var="editURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
				<portlet:param name="mvcPath" value="/html/cau_hoi_danh_gia/add.jsp" />
				<portlet:param name="cauHoiId" value="<%=String.valueOf(item.getCauHoiId())%>" />
			</portlet:renderURL>
			<portlet:resourceURL var="hoatDongURL" id="hoatDongURL">
				<portlet:param name="cauHoiId" value="<%=String.valueOf(item.getCauHoiId())%>" />
			</portlet:resourceURL>
				<%
					String editAction = "openDialogEdit('" + editURL + "');";
					String hoatDongAction = "hoatDong('" + hoatDongURL + "');";
			 	%>
			<liferay-ui:search-container-column-text name="STT" align="center" cssClass="aui-w5" value="<%=String.valueOf(searchContainer.getStart() + index + 1)%>"/>
			<liferay-ui:search-container-column-text name="Tên" align="center" property="ten"/>
			<liferay-ui:search-container-column-text name="Mã" align="center" property="ma"/>
			<liferay-ui:search-container-column-text name="Bộ câu hỏi" align="center" property="tenBoCauHoi"/>
			<liferay-ui:search-container-column-text name="Mô tả" align="center" property="moTa"/>
			<liferay-ui:search-container-column-text name="Thao tác" cssClass="aui-w8 text-center">
			 	<a href="javascript:void(0);" onclick="<%=editAction %>" title="Sửa">
			 		<span style="color:#ff3d00e8"><i class="icon-edit"></i></span>
			 	</a>
			 	<a href="javascript:void(0);" onclick="<%=hoatDongAction %>" title='<%=item.getHoatDong() ? "Ngưng hoạt động" : "Hoạt động" %>'>
			 		<span style='<%=item.getHoatDong() ? "color:#ff3d00e8" :  "color:blue"%>'><i class='<%=item.getHoatDong() ? "icon-stop" : "icon-play"%>'></i></span>
			 	</a>
			 </liferay-ui:search-container-column-text>
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
	Liferay.provide(window,'openDialogEdit', function(url){
		Liferay.Util.openWindow({
			dialog : {
				centered : true,
				height : 600,
				modal : true,
				width : 1000
			},
			id : '<portlet:namespace />dialogAdd',
			title : 'Sửa',
			uri : url
		});
	});
	Liferay.provide(window,'hoatDong', function(url){
		loadingMask.show();
  		if(confirm('Bạn có chắc thực hiện thao tác này?')){
  			A.io.request(url, {
               method: 'post',
               on: {
                   success: function() {
                   		if(this.get('responseData')){
                   			var data = JSON.parse(this.get('responseData'));
                   			if(!data.exception){
                   					search();
                   					toastr.success('Thao tác thành công', 'Thông báo!');
                   			}else{
                   					toastr.error('Yêu cầu thực hiện không thành công', 'Cảnh báo!');
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
});	
</aui:script>
	