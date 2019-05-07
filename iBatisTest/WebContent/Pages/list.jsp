<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>iBatisTest</title>
</head>
<body>
<center>
<h3>사원정보목록</h3>

<table border="1" bordercolor="orange"  cellpadding="0" cellspacing="0" width="750">
<tr>
<th>번호</th>
<th>이름</th>
<th>성별</th>
<th>부서</th>
<th>직위</th>
<th>사원번호</th>
<th>보너스</th>
<th>급여</th>
</tr>

<s:iterator value="list">
<tr>
<th><s:property value="no"/></th>
<th><s:property value="name"/></th>
<th><s:property value="sex"/></th>
<th><s:property value="dept"/></th>
<th><s:property value="job"/></th>
<th><s:property value="sawonnum"/></th>
<th><s:property value="comm"/></th>
<th><s:property value="sal"/></th>
</tr>
</s:iterator>
</table>
</center>
</body>
</html>