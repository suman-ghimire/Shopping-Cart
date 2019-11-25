<%--
  Created by IntelliJ IDEA.
  User: sumanghimire
  Date: 11/23/19
  Time: 4:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css"/>
<spring:url var="images" value="/resources/images"/>
<spring:url var="js" value="/resources/js"/>


<%--used for navigation of pages--%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>


<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping - ${title}</title>
    <script>
        window.menubar = '${title}';
    </script>
    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.css" rel="stylesheet">

    <!-- Bootstrap Readable Theme CSS -->
    <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">
    <%--    <link rel="stylesheet" type="text/css" href="${css}/myapp.css" />--%>
    <%--    <link rel="stylesheet" type="text/css" href="${css}/readable.min.css" />--%>

</head>

<body>

<div class="wrapper">
    <!-- Navigation -->
    <%@include file="./shared/navbar.jsp" %>

    <div class="content">
        <!-- Page Content -->
        <c:if test="${userClickHome == true}">
            <%@include file="home.jsp" %>
        </c:if>

        <c:if test="${userClickAbout == true}">
            <%@include file="about.jsp" %>
        </c:if>

        <c:if test="${userClickContact == true}">
            <%@include file="contact.jsp" %>
        </c:if>

        <c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
            <%@include file="listProducts.jsp" %>
        </c:if>


    </div>

    <!-- Footer -->
    <%@include file="./shared/footer.jsp" %>

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.js"></script>
    <script src="${js}/bootstrap.bundle.js"></script>

    <%--Self coded JS file--%>
    <script src="${js}/myapp.js"></script>

</div>

</body>

</html>






