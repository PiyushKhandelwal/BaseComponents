<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <s:url value="resources/css/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
</head>
<body>
<h1>Title : ${title}</h1>
<h1>Message : ${message}</h1>
</body>
</html>