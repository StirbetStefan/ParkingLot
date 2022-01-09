<%-- 
    Document   : users
    Created on : Jan 5, 2022, 1:06:05 PM
    Author     : Stefan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="u" uri="http://java.sun.com/jsp/jstl/core"%>

<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>
    <form method="POST" action="${pageContext.request.contextPath}/Users">
    <u:if test="${pageContext.request.isUserInRole('AdminRole')}">
        <a class="btn btn-primary " href="${pageContext.request.contextPath}/AddUser" role="button">Add User</a>
        <button class="btn btn-secondary" type="submit">Invoice</button>
    </u:if>
        <div class="row">
            <div class="col-md-1"></div>
            <div class="col-md-3">
                Username
            </div>
            <div class="col-md-3">
                Email
            </div>
            <div class="col-md-3">
                Position
            </div>
        </div>
    <u:forEach var="user" items="${users}" varStatus="status">
        
        <div class="row">
        <div class="col-md-1">
            <input type="checkbox" name="user_ids" value="${user.id}" />
        </div>
            <div class="col-md-3">
                ${user.username}
            </div>
            <div class="col-md-3">
                ${user.email}
            </div>
            <div class="col-md-3">
                ${user.position}
            </div>
        </div>

    </u:forEach>
    </form>
    Invoice for:
    <u:forEach var="username" items="${invoices}" varStatus="status">
        ${username}
    </u:forEach>
</t:pageTemplate>
