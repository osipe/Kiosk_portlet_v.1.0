<%@page import="java.util.ResourceBundle"%>
<%@page import="com.alpha.portlet.enums.MucDoHaiLongEnum"%>
<%@page import="org.apache.commons.collections.CollectionUtils"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.alpha.portlet.danh_gia_hai_long.service.CauHoiLocalServiceUtil"%>
<%@page import="com.alpha.portlet.danh_gia_hai_long.model.CauHoi"%>
<%@page import="com.alpha.portlet.danh_gia_hai_long.model.TraLoi"%>
<%@page import="com.alpha.portlet.danh_gia_hai_long.service.TraLoiLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@include file="/html/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	long cauHoiId = ParamUtil.getLong(request, "cauHoiId");
	CauHoi cauHoi = null;
	List<TraLoi> traLois = new ArrayList<TraLoi>();
			
	if(cauHoiId > 0){
		cauHoi = CauHoiLocalServiceUtil.fetchCauHoi(cauHoiId);
		traLois = new ArrayList<TraLoi>(TraLoiLocalServiceUtil.findByCauHoiId(cauHoiId));
	}
	if(cauHoi == null){
		cauHoi = CauHoiLocalServiceUtil.createCauHoi(0L);
		cauHoi.setDoUuTien(100);
	}
%>
<aui:form name="frmAdd">
	<table class="info table-pa5 aui-w100">
		<tr>
			<td>
				<aui:input class="input-text" name="ten" label="Tên" value="<%=cauHoi.getTen() %>">
					<aui:validator name="required" errorMessage="Tên không được bỏ trống!" />
				</aui:input>
			</td>
			<td>
				<aui:input class="input-text" name="ma" label="Mã" value="<%=cauHoi.getMa() %>">
				</aui:input>
			</td>
		</tr>
		<tr>
			<td>
				<aui:input class="input-text" name="doUuTien" label="Độ ưu tiên" value="<%=cauHoi.getDoUuTien() %>">
				</aui:input>
			</td>
			<td>
				<aui:select class="input-text" name="boCauHoi" label="Bộ câu hỏi" value="<%=cauHoi.getBoCauHoi() %>">
					<aui:option value="1" label="Đánh giá cán bộ" selected="true"/>
					<aui:option value="2" label="Đánh giá thủ tục"/>
				</aui:select>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<aui:input name="moTa" type="textarea" label="Mô tả" value="<%=cauHoi.getMoTa() %>">
				</aui:input>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<table id="<portlet:namespace />traLoiDT"  class="aui-w100" style="margin-bottom: 2em;border: 1px solid #ddd;">
					<thead>
							<tr>
								<th class="aui-w5" style="border: 1px solid #ddd;">
									<a id="<portlet:namespace />createTL" href="javascript:void(0)"><i class="icon-plus"></i></a>
								</th>
							    <th style="border: 1px solid #ddd;">Nội dung<span style="color : #ffc107;">*</span></th>
							    <th style="border: 1px solid #ddd;" class="aui-w10">Mức độ hài lòng <span style="color : #ffc107;">*</span></th>
							    <th style="border: 1px solid #ddd;" class="aui-w8">Điểm <span style="color : #ffc107;">*</span></th>
							 </tr>
					</thead>
					<tbody>
						<c:choose>
							<c:when test="<%=traLois.size() > 0%>">
								<%
									int index = 0;
									for(TraLoi traLoi : traLois){
										index++;
										
								%>
										<tr class="result-row" id="<%=index %>">
											<td style="border: 1px solid #ddd;" class="aui-w3">
												<a href="javascript:void(0)" onclick="deleteRowByIndex(this);"><i class="icon-trash"></i></a>
												<aui:input style="display: none;" class="input-text" name='<%="traLoiId_" + index%>' label=" " value="<%=traLoi.getTraLoiId()%>"> </aui:input> 
											</td>
											<td style="border: 1px solid #ddd;">
												<input class="input-text" id='<%="<portlet:namespace />noiDung_" + index%>' name='<%="<portlet:namespace />noiDung_" + index%>' label=" " value="<%=traLoi.getNoiDung()%>"/>
											</td>
											<td class="aui-w15" style="border: 1px solid #ddd;">
												<select id='<%="<portlet:namespace />mucDoHaiLong_" + index%>' name='<%="<portlet:namespace />mucDoHaiLong_" + index%>' label=" " >
													<% 
														for(MucDoHaiLongEnum en : MucDoHaiLongEnum.values()){
															String label = ResourceBundle.getBundle("content.Language").getString(en.getName());
															int value = en.getIndex();
													%>
													 	 <option value="<%= value%>" label="<%= label%>" selected="<%= traLoi.getMucDoHaiLong() == en.getIndex()%>" />
													<% }%>
												</select>
											</td>
											<td class="aui-w8" style="border: 1px solid #ddd;">
												<select id='<%="<portlet:namespace />diem_" + index%>' name='<%="<portlet:namespace />diem_" + index%>' label=" ">
												<%
													for(int i = 1; i <= 10; i++){
												%>		
														<option value='<%= i%>' selected='<%= i == traLoi.getDiem()%>' label='<%= i%>'/>
												<%
													}
												%>
												</select>
											</td>
										</tr>
								<%
									}
										
								%>
							</c:when>
							<c:otherwise>
								<tr>
									<td colspan="4" style="border: 1px solid #ddd;" class="empty text-center">Không có dữ liệu</td>
								</tr>
						</c:otherwise>
						</c:choose>
					</tbody>
				</table>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<button id="<portlet:namespace />luu" type="button" class="btn btn-labeled btn-default" onclick="save(true);">
					<span class="btn-label"><i class="glyphicon glyphicon-floppy-disk"></i></span><%=cauHoiId == 0 ? "Lưu" : "Cập nhật" %>
				</button>
				<%
					if(cauHoiId == 0){
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
	var tableNode = form.one('#<portlet:namespace />traLoiDT');
	Liferay.provide(window,'save', function(close){
		loadingMask.show();
		formValidator.validate();
		if(!formValidator.hasErrors()){
			var tbody = tableNode.getElementsByTagName('tbody');
			var array = tbody.all('tr').attr('id');
			var length = array.length;
			//new
			  var myTable = document.getElementById('<portlet:namespace />traLoiDT');
			  var myBody = myTable.tBodies; 
			  var arrRows = myBody[0].rows;
			  var columnNoiDung = 1;
			  var columnMucDoHaiLong = 2;
			  var columnDiem = 3;
			  var columnTraLoiId = 4;
			  
			  var traLois = [];
			  for(i = 0; i < arrRows.length; i++){
			  	var row = arrRows[i];
				var traLoi = {};
			  	for(j = 0; j < row.cells.length; j++){
			  		var cell = row.cells[j];
			  		var value = "";
			  		var arrInput = cell.getElementsByTagName("input");
			  		if(arrInput.length > 0){
				    	var input = arrInput[0];
				    	try {
				    		value = input.value;
			    		} catch(err) {
			    			continue;
			    		}
			        }else{
			        	var arrSelect = row.cells[j].getElementsByTagName("select");
			        	if(arrSelect.length > 0){
		        			var select = arrSelect[0];
		        			var id = select.getAttribute("id");
					        value = document.getElementById(id).value;
			        	}
			        } 
			  		switch(j) {
				  	  case columnNoiDung:
				  		traLoi["noiDung"] = value;
				  	    break;
				  	  case columnMucDoHaiLong:
				  		traLoi["mucDoHaiLong"] = value;
				  	    break;
			  		  case columnDiem:
			  			traLoi["diem"] = value;
				  	    break;
			  		  case columnTraLoiId:
			  			traLoi["traLoiId"] = value;
				  	    break;				  	    
				  	  default:
				  	}
			    }
			  	if (!A.Object.isEmpty(traLoi) && traLoi.noiDung && traLoi.mucDoHaiLong && traLoi.diem) {
			  		traLois.push(traLoi);
				}
			  }
			//end new
			if(traLois.length == 0){
				toastr.warning('Danh sách trả lời không được rỗng', 'Lỗi!');
			}else{
				var data = {
					<portlet:namespace />cauHoiId : '<%=cauHoiId %>',
					<portlet:namespace />ten : document.getElementById('<portlet:namespace />ten').value,
					<portlet:namespace />ma : document.getElementById('<portlet:namespace />ma').value,
					<portlet:namespace />moTa : document.getElementById('<portlet:namespace />moTa').value,
					<portlet:namespace />boCauHoi : document.getElementById('<portlet:namespace />boCauHoi').value,
					<portlet:namespace />doUuTien : document.getElementById('<portlet:namespace />doUuTien').value,
					<portlet:namespace />traLois :  A.JSON.stringify(traLois),
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
		var bodyRef = document.getElementById('<portlet:namespace />traLoiDT').getElementsByTagName('tbody')[0];
		bodyRef.innerHTML = '';
		var inputDoUuTien = form.one('#<portlet:namespace />doUuTien');
		inputDoUuTien.val(100);
	});
	if(tableNode){
		var nodeAdd = tableNode.getElementsByTagName('thead').one('#<portlet:namespace />createTL');
		if(nodeAdd){
			nodeAdd.on('click',function(){
				createTraLoi();
			});
		}
	}
	Liferay.provide(window,'createTraLoi', function(){
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
		td0.append('<input name="<portlet:namespace />traLoiId_'+len+'" id="<portlet:namespace />traLoiId_'+len+'" class="input-text" style="display: none;" value="0">')

		var td1 = A.Node.create('<td style="border: 1px solid #ddd;" />');
		var noiDung =  A.Node.create('<input name="<portlet:namespace />noiDung_'+len+'" id="<portlet:namespace />noiDung_'+len+'" class="input-text"></input>');
		td1.append(noiDung);
		
		var td2 = A.Node.create('<td style="border: 1px solid #ddd;" class="aui-w15"/>');
		var mucDoHaiLong = A.Node.create('<select name="<portlet:namespace />mucDoHaiLong_'+len+'" id="<portlet:namespace />mucDoHaiLong_'+len+'"><option value="1" selected="true">Hài lòng</option><option value="2">Không hài lòng</option></select>');
		td2.append(mucDoHaiLong);
		
		var td3 = A.Node.create('<td style="border: 1px solid #ddd;" class="aui-w8"/>');
		var diem = A.Node.create('<select name="<portlet:namespace />diem_'+len+'" id="<portlet:namespace />diem_'+len+'"><option value="1" selected="true">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option><option value="5">5</option><option value="6">6</option><option value="7">7</option><option value="8">8</option><option value="9">9</option><option value="10">10</option></select>');
		td3.append(diem);
		tr.append(td0);
		tr.append(td1);
		tr.append(td2);
		tr.append(td3);
		tbody.append(tr);
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
		console.log(i);
		document.getElementById("<portlet:namespace />traLoiDT").deleteRow(i);
	});
});
</aui:script>