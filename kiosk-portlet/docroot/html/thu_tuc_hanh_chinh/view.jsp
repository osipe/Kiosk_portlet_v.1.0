<%@page import="com.alpha.portlet.danh_muc.service.LinhVucLocalServiceUtil"%>
<%@page import="com.alpha.portlet.danh_muc.model.LinhVuc"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/html/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<portlet:renderURL var="searchURL"
	windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
	<portlet:param name="mvcPath" value="/html/thu_tuc_hanh_chinh/data.jsp" />
</portlet:renderURL>
<aui:form name="frm">
	<table class="info table-pa5 aui-w100">
			<tr>
				<td>
					<div class="input-group">
						<div class="has-keyboard">
							<input class="form-control input-search" style="position: relative;z-index: 2;float: left;width: 30% !important;margin-bottom: 0;height: 2em;" id="<portlet:namespace />ten" name="<portlet:namespace />ten" label="Tên" placeholder="Nhập nội dung tìm kiếm"/>
						<span class="input-group-btn">
	                        <button style="height: 2.3em;" id="<portlet:namespace />search" class="btn btn-success" type="button" onclick="search();"  data-toggle="tooltip" data-placement="top" title="Click vào đây để tiến hành tìm kiếm!">Tìm kiếm!</button>
	                    </span>
                	</div>
                	 <div class="keyboard animated slideOutDown">
				</td>
			</tr>
		</table>
 <div id="<portlet:namespace />contentDataTable" name="<portlet:namespace />contentDataTable"></div>
</aui:form>
<aui:script use="aui-base,aui-io-plugin-deprecated,aui-loading-mask-deprecated,aui-modal"> 
$(document).ready(function () {
	  $('.has-keyboard').append('<i class="fa fa-keyboard-o toggle_keyboard"></i>');
	  $('.keyboard').append('<span class="close_keyboard">Đóng <i class="fa fa-angle-down" style="line-height:20px;"></i></span>').addClass('animated');
	  $('#<portlet:namespace />ten').focusin(function(){
			$('.keyboard').css({display:'block',opacity:'1','z-index':'1500'}).addClass('slideInUp').removeClass('slideOutDown');
			$('input[type=text]').focus();
	  });
	  $('#<portlet:namespace />ten').focusout(function(){
		  $('.keyboard').addClass('slideOutDown').removeClass('slideInUp').css({'z-index':'-99','oppacity':'0'});
	  })
	  $('.close_keyboard').click(function () {
		$('.keyboard').addClass('slideOutDown').removeClass('slideInUp').css({'z-index':'-99','oppacity':'0'});
	  });
	  $('.input-search').keypress(function (e) {
          if ((e.which && e.which == 13) || (e.keyCode && e.keyCode == 13)) {
              $('#<portlet:namespace />search').click();
              return false;
          }
      });
	});
	//Jquery plugin: keyboard
$('body').keyboard({
  'keyboard': 'qwerty',
  'plugin': 'form'
});
AUI().ready([ 'aui-base', 'aui-node', 'aui-modal', 'aui-component', 'aui-io-request', 'liferay-portlet-url', 'aui-io-plugin-deprecated', 'liferay-portlet-base'], function(A) {
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
	search();
	//Trả về trang chủ
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
	//end trả về trang chủ
});
</aui:script>