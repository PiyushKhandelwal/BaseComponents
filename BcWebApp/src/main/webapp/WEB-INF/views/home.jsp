<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h1>Title : ${title}</h1>
<h1>Message : ${message}</h1>
<c:url value="/logout" var="logoutUrl"/>
<c:if test="${pageContext.request.userPrincipal.name != null}">
    <h2>Welcome : ${pageContext.request.userPrincipal.name}</h2>
    <spring:form action="${logoutUrl}" method="post" >
        <input type="submit" value="Logout"/>
    </spring:form>
</c:if>
</body>
</html>