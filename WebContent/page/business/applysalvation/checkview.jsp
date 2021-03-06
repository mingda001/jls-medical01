<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="page/css/table-style.css" type="text/css"></link>
<title>符合医前审批人员列表</title>
</head>
<script type="text/javascript">
	function handle(id, type,q) {
		var url = "approveaspinit?aspApproveDTO.aspapproveId=" + id
				+ "&aspApproveDTO.memberId=" + type+ "&aspApproveDTO.memberType=" + q;
		var f = "dialogWidth=700px;dialogHeight=500px;status=no;help=no;scroll=auto";
		window.showModalDialog(url, window, f);
		window.location.reload();
	}
</script>
<body>
<br />
<s:form
	action="page/business/applysalvation/queryapplysalperson.action?cur_page="
	method="post" theme="simple">
	<!--<p align="center">请输入家庭编号： <s:textfield name="aspApproveDTO.familyno"></s:textfield>
	</p>
	-->
	查询条件：<s:select name="term" list="#{'':'全部','name':'姓名','ssn':'社会保障号'}"
		listKey="key" listValue="value">
	</s:select>
	查询值：<s:textfield name="value"></s:textfield>&nbsp;&nbsp;&nbsp;&nbsp;
	<s:submit value="查询"></s:submit>
</s:form>
<table align="center" width="90%" class="t1" border="0" cellpadding="0"
	cellspacing="0">
	<tr>
		<th>家庭编号</th>
		<th>姓名</th>
		<th>身份证号</th>
		<th>社会保险号</th>
		<th>操作</th>
	</tr>
	<s:iterator value="persons">
		<s:url id="acm" action="approveaspinit">
			<s:param name="aspApproveDTO.memberId">
				<s:property value="memberId" />
			</s:param>
			<s:param name="aspApproveDTO.chronicapproveId">
			-1
			</s:param>
			<s:param
				name="aspApproveDTO.memberType">
			<s:property value="memberType" />
			</s:param>
		</s:url>
		<tr>
			<td><s:property value="familyno" /></td>
			<td><s:property value="membername" /></td>
			<td><s:property value="paperid" /></td>
			<td><s:property value="ssn" /></td>
			<td>
				<s:if test="isybsqdb==2">
					<a href="javascript:void(0)"
						onclick="handle('-1','<s:property value="memberId" />','<s:property value="memberType" />')">填写</a>
				</s:if>
				<s:else>
				没有因病申请标识
				</s:else>
			</td>
		</tr>
	</s:iterator>
</table>
<p align="center">
<s:property value="toolsmenu" escape="false"/>
</p>
</body>
</html>