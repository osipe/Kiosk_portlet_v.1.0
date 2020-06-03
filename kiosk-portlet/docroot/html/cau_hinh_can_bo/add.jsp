<%@page import="com.alpha.portlet.util.JSONReaderUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.alpha.portlet.util.CauHinhCanBoUtil"%>
<%@page import="com.alpha.portlet.dto.CauHinhCanBoDTO"%>
<%@page import="com.alpha.portlet.util.DanhMucCoBanComparator"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.alpha.portlet.dmdc.service.PhanQuyenLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.alpha.portlet.dto.UserDTO"%>
<%@page import="com.alpha.portlet.dmdc.model.CauHinh"%>
<%@page import="com.alpha.portlet.constants.Constants"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@include file="/html/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	long cauHinhId = 0;
	List<UserDTO> userDTOSelects = PhanQuyenLocalServiceUtil.findUserDTOByO_R_F(/* organizationId */0, /* roleId */0, /* fullName */null, 
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, new DanhMucCoBanComparator("u.userid", true));
	List<UserDTO> userDTOs = new ArrayList<UserDTO>();
	long companyId = PhanQuyenLocalServiceUtil.getCompanyId();
	CauHinhCanBoDTO cauHinhDTO = CauHinhCanBoUtil.getCauHinhCanBo(companyId);
	if(cauHinhDTO != null){
		cauHinhId = cauHinhDTO.getCauHinhId();
		JSONArray jsArr = cauHinhDTO.getJsArray();
		if(jsArr != null && jsArr.length() > 0){
			userDTOs = JSONReaderUtil.convertJSONArrayToListUserDTO(jsArr);
		}
	} 
%>
<aui:form name="frmAdd">
	<h3>Danh sách cán bộ được đánh giá</h3>
	<table id="<portlet:namespace />canBoDT" style="padding:0% 0% 1% 0%" class="table-border-all aui-w100">
		<thead>
				<tr>
					<th class="aui-w5" style="border: 1px solid #ddd;">
						<a id="<portlet:namespace />createCB" href="javascript:void(0)"><i class="icon-plus"></i></a>
					</th>
				    <th >Cán bộ<span style="color : #ffc107;">*</span></th>
				    <th >Phòng ban<span style="color : #ffc107;"></span></th>
				    <th >Vai trò<span style="color : #ffc107;"></span></th>
				 </tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="<%=userDTOs.size() > 0%>">
					<%
						int index = 0;
						for(UserDTO userDTO : userDTOs){
							index++;
							
					%>
							<tr class="result-row" id="<%=index %>">
								<td  style="border: 1px solid #ddd;" class="aui-w3">
									<a href="javascript:void(0)" onclick="deleteRowByIndex(this);"><i class="icon-trash"></i></a>
								</td>
								<td style="border: 1px solid #ddd;">
								
									<aui:select id='<%="slCanBo_" + index%>' name='<%="slCanBo_" + index%>' label=" " onChange='<%="changeUserDTO(" + index + ");"%>'>
										<% 
											for(UserDTO item : userDTOSelects){
												long value = item.getUserId();
												String label = item.getFullname();
												boolean select = item.getUserId() == userDTO.getUserId();
										%>
									 	  	<aui:option value="<%= value%>" label="<%= label%>" selected="<%= select%>" />
										<% }%>
									</aui:select>
								</td>
								<td  class="aui-w25" style="border: 1px solid #ddd;">
									<div align="center"><p id='<portlet:namespace /><%="orgName_" + index%>' ><%= userDTO.getOrgName()%></p></div>
								</td>
								<td  class="aui-w25" style="border: 1px solid #ddd;">
									<div align="center"><p id='<portlet:namespace /><%="roleName_" + index%>'><%= userDTO.getRoleName()%></p></div>
								</td>
							</tr>
					<%
						}
							
					%>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="4" class="empty text-center">Không có dữ liệu</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
	<button id="<portlet:namespace />luu" type="button" class="btn btn-labeled btn-default" onclick="save(true);">
		<span class="btn-label"><i class="glyphicon glyphicon-floppy-disk"></i></span><%=cauHinhId == 0 ? "Lưu" : "Cập nhật" %>
	</button>
</aui:form>
<portlet:resourceURL var="addURL" id="addOrUpdateURL"></portlet:resourceURL>
<portlet:resourceURL var="findUser" id="findUserSelect"></portlet:resourceURL>
<portlet:resourceURL var="createUserDTO" id="createUserDTOByUserId"></portlet:resourceURL>
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
			var myTable = document.getElementById('<portlet:namespace />canBoDT');
			var myBody = myTable.tBodies; 
			var arrRows = myBody[0].rows;
			var columnUserId = 1;
			
			var users = [];
			var arrayUserId = [];
			for(i = 0; i < arrRows.length; i++){
				var row = arrRows[i];
				var user = {};
				var cell = row.cells[columnUserId];
				var value = 0;
				var arrSelect = cell.getElementsByTagName("select");
	        	if(arrSelect.length > 0){
        			var select = arrSelect[0];
        			var id = select.getAttribute("id");
			        value = document.getElementById(id).value;
	        	}
	        	if(value > 0){
					user["userId"] = value;
					if(!arrayUserId.includes(value) && !A.Object.isEmpty(user)){
						arrayUserId.push(value);
						users.push(user);
		        	}
				}
			}
			if(users.length == 0){
				toastr.warning('Danh sách cán bộ không được rỗng', 'Lỗi!');
			}else{
				var data = {
					<portlet:namespace />cauHinhId : '<%=cauHinhId %>',
					<portlet:namespace />users :  A.JSON.stringify(users),
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
		Liferay.Util.getOpener().refreshPage();
	});
	var tableNode = form.one('#<portlet:namespace />canBoDT');
	if(tableNode){
		var nodeAdd = tableNode.getElementsByTagName('thead').one('#<portlet:namespace />createCB');
		if(nodeAdd){
			nodeAdd.on('click',function(){
				createCanBo();
			});
		}
	}
	
	Liferay.provide(window,'createCanBo', function(){
		var thead = tableNode.getElementsByTagName('thead');
		var tbody = tableNode.getElementsByTagName('tbody');
		var array = tbody.all('tr').attr('id');
		var isEmpty = tbody.all('tr' + ">td.empty");
		if (isEmpty && isEmpty.size() == 1) {
			tbody.empty();
		}
		var len = array.length > 0 ? array.max() + 1 : 1;
		var tr = A.Node.create('<tr id="'+ len +'" class="result-row"/>');
		
		var td0 = A.Node.create('<td style="border: 1px solid #ddd;" class="aui-w3"/>');
		var spanDel = A.Node.create('<span/>');
		var nodeDel = A.Node.create('<a id="<portlet:namespace />delete_' + len + '" href="javascript:void(0)"><i class="icon-trash"></i></a>');
		nodeDel.on('click', function(event){
			deleteRow(event);
		});
		spanDel.append(nodeDel);
		td0.append(spanDel);
		td0.append('<input name="<portlet:namespace />canBoId_'+len+'" id="<portlet:namespace />canBoId_'+len+'" class="input-text" style="display: none;" value="0">')
		
		//
		A.io.request('${findUser}', {
            method: 'post',
            on: {
                success: function() {
                		if(this.get('responseData')){
                			var data = JSON.parse(this.get('responseData'));
                			if(!data.exception){
                				data = data.users;
                				if(data.length > 0){
	               					var td1 = A.Node.create('<td style="border: 1px solid #ddd;" />');
	               					var tagSelectTmp = '<select name="<portlet:namespace />slCanBo_'+len+'" id="<portlet:namespace />slCanBo_'+len+'" onchange="changeUserDTO(' + len + ');">';
	               					
	                				var td2 = A.Node.create('<td style="border: 1px solid #ddd;" class="aui-w25"/>');
	                				var tagPhongBan;
	                				
	                				var td3 = A.Node.create('<td style="border: 1px solid #ddd;" class="aui-w25"/>');
	                				var tagVaiTro;
	                				var opt = '<option value="0" >Chọn</option>';
	                				data.forEach(function(obj){
	                					opt = opt + '<option value="' + obj.userId + '" >'+ obj.fullname +'</option>';
	                					
	                					tagPhongBan = '<div align="center"><p id="<portlet:namespace />orgName_' + len + '"> </p></div>';
	                					tagVaiTro = '<div align="center"><p id="<portlet:namespace />roleName_' + len + '"> </p></div>';
	                				});
	                				tagSelectTmp = tagSelectTmp + opt + '</select>';
	                				
	                				var tagSelect = A.Node.create(tagSelectTmp);
	                				td1.append(tagSelect);
	                				
	                				td2.append(A.Node.create(tagPhongBan));
	                				td3.append(A.Node.create(tagVaiTro));
	                				
	                				tr.append(td0);
	                				tr.append(td1);
	                				tr.append(td2);
	                				tr.append(td3);
	                				tbody.append(tr);
                				}
                			}else{
                					toastr.error('Yêu cầu thực hiện không thành công', 'Lỗi!');
                			}
                		}
                },
                failure : function() {
                	toastr.error('Yêu cầu thực hiện không thành công', 'Lỗi!');
                }
           }
     	});
	});
	Liferay.provide(window,'deleteRow', function(event){
		var currentNode = event.currentTarget;
		var check = confirm('Bạn có chắc thực hiện thao tác này ?');
		if (currentNode && check) {
			var table = currentNode.ancestor('table');
			var tbody = table.getElementsByTagName('tbody');
			var row = currentNode.ancestor('tr');
			row.remove();
			if (tbody.all('tr').size() == 0) {
				tbody.append('<tr><td colspan="4" style="border: 1px solid #ddd;" class="empty text-center">Không có dữ liệu</td></tr>');
			}
		}
	});
	Liferay.provide(window,'deleteRowByIndex', function(row){
		var i = row.parentNode.parentNode.rowIndex;
		document.getElementById("<portlet:namespace />canBoDT").deleteRow(i);
	});
	Liferay.provide(window,'changeUserDTO', function(index){
		var value = document.getElementById("<portlet:namespace />slCanBo_" + index).value;
		var data = {
			<portlet:namespace />userId : value, 
		}
		if(value > 0){
			A.io.request('${createUserDTO}', {
				method: 'post',
	            data: data,
	            on: {
	                success: function() {
	                		if(this.get('responseData')){
	                			var data = JSON.parse(this.get('responseData'));
	                			if(!data.exception){
	                				document.getElementById("<portlet:namespace />orgName_" + index).innerHTML = data.organizationName;
	                				document.getElementById("<portlet:namespace />roleName_" + index).innerHTML = data.roleName;
	                			}else{
	                				toastr.error('Yêu cầu thực hiện không thành công', 'Lỗi!');
	                			}
	                		}
	                },
	                failure : function() {}
	           }
	     	});
		}else{
			document.getElementById("<portlet:namespace />orgName_" + index).innerHTML = '';
			document.getElementById("<portlet:namespace />roleName_" + index).innerHTML = '';
		}
	});
});
</aui:script>