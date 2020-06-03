<%@page import="com.alpha.portlet.quy_hoach.service.BieuDoQuyHoachLocalServiceUtil"%>
<%@page import="com.alpha.portlet.quy_hoach.model.BieuDoQuyHoach"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/html/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<BieuDoQuyHoach> bieuDoQuyHoachs = BieuDoQuyHoachLocalServiceUtil.findByHoatDong(true);
%>
<div class="nav-menu nav-menu-style-">
	<ul class="layouts level-1">
		<%for (BieuDoQuyHoach item : bieuDoQuyHoachs) {%>
		<portlet:renderURL var="viewURL"
			windowState="<%=LiferayWindowState.NORMAL.toString()%>">
			<portlet:param name="mvcPath" value="/html/hienthibandoquyhoach/hienthibangdo.jsp" />
			<portlet:param name="bieuDoQuyHoachId" value="<%=String.valueOf(item.getBieuDoQuyHoachId()) %>" />
		</portlet:renderURL>
		<li class="">
			<a  href="<%=viewURL%>"> <%=item.getTen() %></a>
		</li>
		<%} %>
	</ul>
</div>
<aui:script use="aui-base,aui-io-plugin-deprecated,aui-loading-mask-deprecated,aui-modal">
AUI().ready([ 'aui-base', 'aui-node', 'aui-modal', 'aui-component', 'aui-io-request', 'liferay-portlet-url', 'aui-io-plugin-deprecated', 'liferay-portlet-base'], function(A) {
	var idleTime;
	var clock;
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
   							clock.reset();
   							modal.destroy();
   					       	reloadPage();
   					       	
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