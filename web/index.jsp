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


<form action="/main/LoginServlet" method="post">
    Name : <input name="uname" type="text"/><br>
    Password: <input name="pass" type="password"/><br>
    <button type="submit"> Submit</button>
</form>


<form action="/main/LoginServlet" method="get">

    <button type="submit">getDetails</button>
</form>


<form action="/main/SecondServlet" method="get">

    <button type="submit">getDetailsSecondServlet</button>
</form>
</body>
</html>
