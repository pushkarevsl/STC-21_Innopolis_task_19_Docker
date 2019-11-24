<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: a1
  Date: 24/11/2019
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
    <%
        List<String> fileList = (List<String>) request.getAttribute ("files");
        if (fileList == null)
            return;
        for (String file : fileList) {
    %>
    <p><%=file%>
    </p>
    <%
        }
    %>
</body>
</html>
