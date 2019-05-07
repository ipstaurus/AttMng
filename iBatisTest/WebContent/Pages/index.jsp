<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
response.sendRedirect("http://localhost:8080/iBatisTest/Pages/list.action");
%>
<%--
list.action을 인덱스 페이지에서 요청했다. struts.xml의<action에서 list.action을 정의해줬다.

★참고 sendRedirect는 페이지만 이동시킨다. 어떤 값을 가지고 이동할경우 sendRedirect를 사용하게되면
페이지가 봐뀌면서 메모리가 해제되서 값이 모두 소멸됨
--%>
