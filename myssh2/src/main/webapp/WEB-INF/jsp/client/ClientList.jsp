  <%@ page language="java" contentType="text/html; charset=UTF-8"
      pageEncoding="UTF-8"%>
  <%@ taglib uri="/struts-tags" prefix="s" %>
  

<form id="pagerForm" method="post" action="ClientList.action">
	<input type="hidden" name="status" value="${param.status}">
	<input type="hidden" name="keywords" value="${param.keywords}" />
	<input type="hidden" name="pageNum" value="1" />
	<input type="hidden" name="numPerPage" value="<s:property value="numPerPage"/>" />
	<input type="hidden" name="orderField" value="${param.orderField}" />
</form>


<div class="pageHeader">
	<s:form onsubmit="return navTabSearch(this);"  action="ClientList.action" onreset="$(this).find('select.combox').comboxReset()">
	<div class="searchBar">
		<!--<ul class="searchContent">
			<li>
				<label>Client Name:</label>
				<input type="text"/>
			</li>
			<li>
			<select class="combox" name="province">
				<option value="">City</option>
				<option value="Gatieau">Gatieau</option>
			</select>
			</li>
		</ul>
		-->
		<table class="searchContent">
			<tr>
				<td>
					Client Name:<s:textfield name="CondClientName" class="date"/>
					</td>
				<td>
				<script type="text/javascript">
// 			  var osel=document.getElementById("selectType"); //得到select的ID

//  for (i = 0; i < osel.length; i++) { 
//  if(osel[i].value==<s:property value="ConClinetType"/>){
//  osel[i].selected=true;
//  }
//  }
 	
				</script>
					Customer Type:
					<s:select  
            list="listType"
            name="ConClinetType"
            listKey="proCode"
            listValue="proNameEn"
            emptyOption="false"
            headerKey="" headerValue="==Select Type=="
               
                        />
				</td>
				<td>
					Create Date: <input type="text" class="date" readonly="true" /> 
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
				<th width="80">Clinet Code</th>
				<th width="120">Name</th>
				<th>subsidiary</th>
				<th width="100">Type</th>
				<th width="150">Adress</th>
				<th width="80" align="center">telnum</th>
				<th width="80">Bank</th>
				<th width="80">isActive Date</th>
			</tr>
		</thead>
		<tbody>
		<s:iterator value="#myClientList" status="bcs">
			<tr target="cliid" rel="1">
				 <td><s:property value="cliCode"></s:property></td>
				 <td><s:property value="cliName"></s:property></td>
				 <td><s:property value="cliSubsidiary"></s:property></td>
				 <td><s:property value="proNameEn"></s:property></td>
				<td><s:property value="cliAddressstree"></s:property></td>
				<td><s:property value="cliTelnum"></s:property></td>
				<td><s:property value="cliBank"></s:property></td>
				<td><s:property value="cliIsActive"></s:property></td>
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
