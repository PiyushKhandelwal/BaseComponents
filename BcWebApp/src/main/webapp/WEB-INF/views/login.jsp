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
            Invalid username and password.
        </div>
    </c:if>
    <c:if test="${param.logout != null}">
        <div class="alert alert-info" role="alert">
            You have been logged out.
        </div>
    </c:if>
    <spring:form action="${loginUrl}" method="post" cssClass="form-signin">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="username" class="sr-only">Username</label>
        <input type="text" name="username" id="username" class="form-control" placeholder="Username"/>
        <label for="password" class="sr-only">Password</label>
        <input id="password" class="form-control" placeholder="Password" name="password" type="password">
        <div class="checkbox">
            <label>
                <input type="checkbox" name="rememberme"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </spring:form>
</div>
</body>
</html>