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
    <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <c:url value="/login" var="loginUrl"/>
    <c:if test="${param.error != null}">
        <div class="alert alert-danger" role="alert">
            <s:message code="alert.invalidUsernameAndPassword"/>
        </div>
    </c:if>
    <c:if test="${param.logout != null}">
        <div class="alert alert-info" role="alert">
            <s:message code="alert.logoutmessage"/>
        </div>
    </c:if>
    <spring:form action="${loginUrl}" method="post" cssClass="form-signin">
        <h2 class="form-signin-heading"><s:message code="login.header"/> </h2>
        <label for="username" class="sr-only"><s:message code="label.username"/> </label>
        <input type="text" name="username" id="username" class="form-control" placeholder="<s:message code="label.username"/>"/>
        <label for="password" class="sr-only"><s:message code="lable.password"/></label>
        <input id="password" class="form-control" placeholder="<s:message code="lable.password"/>" name="password" type="password">
        <div class="checkbox">
            <label>
                <input type="checkbox" name="rememberme"> <s:message code="label.rememberme"/>
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit"><s:message code="label.signin"/> </button>
    </spring:form>
</div>
</body>
</html>