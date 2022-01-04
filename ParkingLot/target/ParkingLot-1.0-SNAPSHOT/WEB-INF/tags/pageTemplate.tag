<%-- 
    Document   : pageTemplate
    Created on : Jan 4, 2022, 4:09:43 PM
    Author     : Stefan
--%>

<%@tag description="generic page template" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="pageTitle"%>

<%-- any content can be specified here e.g.: --%>
<h2>${message}</h2>

<!DOCTYPE html>
<html>
    <head>
        <title>${pageTitle}</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <jsp:doBody />
    </body>
</html>