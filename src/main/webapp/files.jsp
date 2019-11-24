<%@ page import="java.util.List" %>
<%@ page import="java.io.File" %><%--
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
    File[] fileList;
    fileList = (File[]) request.getAttribute ("files");
    if (fileList == null)
        return;
    for (File file : fileList) {
%>
<p><%=file%>
</p>
<%
    }
%>
</body>
</html>
