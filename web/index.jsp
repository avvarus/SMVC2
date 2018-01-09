<%--
  Created by IntelliJ IDEA.
  User: Avvarus
  Date: 1/8/18
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BankApp</title>
</head>
<body>
<h1> Welcome to H1b Bank Application</h1>


<%--<!-Declarations->--%>

<%--hi hello --%>
<%!
    int add(int abc, int xyz) {
        return abc * xyz;
    }
%>
<%
    int a = 10;
    int b = 20;
    int k = add(a, b);
    out.println(add(a, b));
%>
<br>
<br>

Value is <%=k%>


<form action="/main/LoginServlet" method="post">
    Name : <input name="uname" type="text"/><br>
    Password: <input name="pass" type="password"/><br>
    <button type="submit"> Submit</button>
</form>


<form action="/main/LoginServlet" method="get">
    <button type="submit">getDetails</button>
</form>


<form action="/main/SecondServlet" method="post">
    Employer <input type="radio" value="Employer" name="typeEmp">
    Employee <input type="radio" value="Employee" name="typeEmp">

    <button type="submit">getDetailsSecondServlet</button>
</form>


</body>
</html>
