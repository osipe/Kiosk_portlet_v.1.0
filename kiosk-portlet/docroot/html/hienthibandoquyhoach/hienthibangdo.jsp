<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@page import="org.apache.commons.collections.CollectionUtils"%>
<%@page import="com.alpha.portlet.enums.ResourceCodeKiokEnum"%>
<%@page import="com.alpha.portlet.dmdc.service.FileDinhKemLocalServiceUtil"%>
<%@page import="com.alpha.portlet.dmdc.model.FileDinhKem"%>
<%@page import="java.util.List"%>
<%@page import="com.alpha.portlet.quy_hoach.service.BieuDoQuyHoachLocalServiceUtil"%>
<%@page import="com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/html/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	long bieuDoQuyHoachId  = ParamUtil.getLong(request, "bieuDoQuyHoachId");
	BieuDoQuyHoach bieuDoQuyHoach = BieuDoQuyHoachLocalServiceUtil.fetchBieuDoQuyHoach(bieuDoQuyHoachId);
	String urlFile = "";
	if(bieuDoQuyHoach != null){
		String tenFile = "";
	 	List<FileDinhKem> fileDinhKems = FileDinhKemLocalServiceUtil.findByR_P(ResourceCodeKiokEnum.RESOURCE_CODE_BDQH.getCodeId(), bieuDoQuyHoachId);
		if(CollectionUtils.isNotEmpty(fileDinhKems)){
			FileDinhKem fileDinhKem = fileDinhKems.get(0);
			if(fileDinhKem != null && fileDinhKem.getFileEntryId() > 0){
				try{
					DLFileEntry dLFileEntry = DLFileEntryLocalServiceUtil.fetchDLFileEntry(fileDinhKem.getFileEntryId());
					urlFile = "/documents/" + themeDisplay.getScopeGroupId() + "/" + fileDinhKem.getFileEntryId() + "/" + dLFileEntry.getTitle() + "/" + dLFileEntry.getUuid();
				}catch(Exception e){}
			}
		}
	}
%>
<div class="noSel smooth_zoom_preloader" style="position: relative; overflow: hidden; text-align: left; user-select: none; -webkit-tap-highlight-color: rgba(255, 255, 255, 0); background-color: rgb(255, 255, 255); background-position: center center; background-repeat: no-repeat; width: 1920px; height: 800px; background-image: none;">
	<img id="imageKiosk" src="<%=urlFile %>">
</div>
<aui:script use="aui-base,aui-io-plugin-deprecated,aui-loading-mask-deprecated,aui-modal">
$(document).ready(function() {
	$("#imageKiosk").smoothZoom({
		width:1920,
		height:800,
		button_SIZE:22,
		button_ALIGN:"bottom center",
		zoom_OUT_TO_FIT:"NO",
		button_AUTO_HIDE:"YES",
		button_AUTO_HIDE_DELAY:2,
		responsive:false,
		responsive_maintain_ratio:true,
		max_WIDTH:"",
		max_HEIGHT:""
	});
});
AUI().ready([ 'aui-base', 'aui-node', 'aui-modal', 'aui-component', 'aui-io-request', 'liferay-portlet-url', 'aui-io-plugin-deprecated', 'liferay-portlet-base'], function(A) {
	var idleTime;
	 reloadPage();
	$('html').bind('mousemove click mouseup mousedown keydown keypress keyup submit change mouseenter scroll resize dblclick', function () {
       clearTimeout(idleTime);
       reloadPage();
   });
	function reloadPage() {
		clearTimeout(idleTime);
		var d=A.Node.create('<div class="aui-column aui-w100" style="text-align:center"></div>');
		var f=A.Node.create("<div></div>").appendTo(d);
		var e=A.Node.create('<span><div class="clock"></div></span>');
		var c=A.Node.create('<div class="aui-column aui-w100">Chọn <b>[Hủy bỏ]</b> để <b>Đóng</b> thông báo.<br>Chọn <b>[Trang chủ]</b> để quay về trang chủ.</div>');
		var i=A.Node.create('<div class="aui-column aui-w100"></div>');
		var g=A.Node.create('<span class="aui-button"><span class="aui-button-content"><input class="aui-button-input" id="<portlet:namespace />cancel" type="button" value="Hủy bỏ"/></span></span>').appendTo(i);
		var h=A.Node.create('<span class="aui-button"><span class="aui-button-content"><input class="aui-button-input" id="<portlet:namespace />home" type="button" value="'+Liferay.Language.get("home")+'"/></span></span>').appendTo(i);f.append(e);f.append(c);f.append(i);
		idleTime = setTimeout(function () {
			var modal = new A.Modal(
               {
            	cache : false,
   				bodyContent: d.html(),
   				centered: true,
   				destroyOnClose: true,
   				resizable: false,
   				close: false,
   				title:'',
   				zIndex: 1001,
   				id : '<portlet:namespace />timer',
   				after:{
   					render:function(j){
   						$(document).ready(function() {
   							clock = $('.clock').FlipClock(15, {
   								clockFace:"Counter",
   								autoStart:true,
   								countdown:true,
   						        callbacks: {
   						        	stop: function() {
   						        		modal.destroy();
   						        		goHome();
   						        	}
   						        }
   						    });
   						});
   						A.one('#<portlet:namespace />cancel').on('click',function(){
   							reloadPage();
   							modal.destroy();
   						});
   						A.one('#<portlet:namespace />home').on('click',function(){
   							goHome();
   						});
   					}
   				}
               }
             ).render();
		}, 30000);
	};
	Liferay.provide(window,'goHome', function(){
		window.location.href = window.location.origin;
	});
});
</aui:script>