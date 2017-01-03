<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>&lt;c:out&gt; Tag Example</title>
</head>
<body>
<div class="container">
    <h1>This is secured!</h1>
    <p>
        Hello a <b><c:out value="${pageContext.request.remoteUser}"/></b>
    </p>
</div>
</body>
</html>