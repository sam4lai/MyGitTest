  <%@ page language="java" contentType="text/html; charset=UTF-8"
      pageEncoding="UTF-8"%>
  <%@ taglib uri="/struts-tags" prefix="s" %>
  

<form id="pagerForm" method="post" action="VehicleList.action">
	<input type="hidden" name="status" value="${param.status}">
	<input type="hidden" name="keywords" value="${param.keywords}" />
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="<s:property value="numPerPage"/>" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
</form>


<div class="pageHeader">
	<s:form onsubmit="return navTabSearch(this);"  action="VehicleList.action" onreset="$(this).find('select.combox').comboxReset()">
	<div class="searchBar">
		<table class="searchContent">
			<tr>
				<td>
					Vehicle Plate:<s:textfield name="CondVehplate" class="text"/>
					</td>
				<td>
				<script type="text/javascript">

 	
				</script>
					Vehicle Type:
					<s:select  
			            list="listType"
			            name="ConVehtype"
			            listKey="proCode"
			            listValue="proNameEn"
			            emptyOption="false"
			            headerKey="" headerValue="==Select Type=="              
                     />
				</td>
				<td>
					Vehicle Owner:<input type="text" readonly="true" /> 
				</td>
			</tr>
		</table>
		<div class="subBar">
			<ul>
				<li><div class="buttonActive"><div class="buttonContent"><button type="submit">Search</button></div></div></li>
				<li><a class="button" href="demo_page6.html" target="dialog" mask="true" title="Search"><span>Advanced Search</span></a></li>
			</ul>
		</div>
	</div>
	</s:form>
</div>
<div class="pageContent">
	<div class="panelBar">
		<ul class="toolBar">
			<li><a class="add" href="demo_page4.html" target="navTab"><span>Add</span></a></li>
			<li><a class="delete" href="demo/common/ajaxDone.html?uid={sid_user}" target="ajaxTodo" title="Are you sure want to delete?"><span>Delete</span></a></li>
			<li><a class="edit" href="demo_page4.html?uid={sid_user}" target="navTab"><span>Modify</span></a></li>
			<li class="line">line</li>
			<li><a class="icon" href="demo/common/dwz-team.xls" target="dwzExport" targetType="navTab" title="Do you want to export those records?"><span>Export EXCEL</span></a></li>
		</ul>
	</div>
	<table class="table" width="100%" layoutH="138">
		<thead>
			<tr>
				<th width="10">Vechile Code</th>
				<th width="120">Vechile Plate</th>
				<th>Vechile Type</th>
				<th width="120">Vechile Owner</th>
			</tr>
		</thead>
		<tbody>
		<s:iterator value="#myVehicleList" status="bcs">
			<tr target="vehid" rel="1">
				 <td><s:property value="vehcode"></s:property></td>
				 <td><s:property value="vehplate"></s:property></td>
				 <td><s:property value="vehtype"></s:property></td>
				 <td><s:property value="vehowner"></s:property></td>

			</tr>
	   </s:iterator>
					</tbody>
	</table>
	<div class="panelBar">
		<div class="pages">
			<span>Show</span>
			<script type="text/javascript">
			//window.onload=function(){ 
//  var osel=document.getElementById("numPerPage_sel"); //得到select的ID

// for (i = 0; i < osel.length; i++) { 
// if(osel[i].value==<s:property value="numPerPage"/>){
// osel[i].selected=true;
// }
// }
 //
// }
			</script>
			<select class="combox" name="numPerPage" id='numPerPage_sel' onchange="navTabPageBreak({numPerPage:this.value})" value="10">
				<option value="3" <s:if test="numPerPage==3">selected="selected"</s:if>>3</option>
				<option value="5" <s:if test="numPerPage==5">selected="selected"</s:if>>5</option>
				<option value="10" <s:if test="numPerPage==10">selected="selected"</s:if>>10</option>
			</select>
			<span> per Page，total: <s:property value="TotalRecord"/>  Records</span>
		</div>

		<div class="pagination" targetType="navTab" totalCount=<s:property value="TotalRecord"/> numPerPage=<s:property value="numPerPage"/> pageNumShown="10" currentPage=<s:property value="pageNum"/>></div>

	</div>
</div>
