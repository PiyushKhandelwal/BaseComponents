<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>BaseComponents</title>
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"/>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet"/>
</head>
<body>
    <c:url value="/logout" var="logoutUrl"/>
    <div class="jumbotron">
        <h1>Base Components</h1>
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <p>Welcome ${pageContext.request.userPrincipal.name}.&nbsp;
            ${message}</p>
            <spring:form action="${logoutUrl}" method="post" >
                <p><input type="submit" class="btn btn-primary btn-lg" role="button" value="Logout"/></p>
            </spring:form>
        </c:if>
    </div>
</body>
</html>