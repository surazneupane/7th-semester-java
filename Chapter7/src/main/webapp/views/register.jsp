<%--
  Created by IntelliJ IDEA.
  User: suraj
  Date: 2023-01-12
  Time: 07:33
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="layouts/header.jsp" %>
<h3> Register</h3>

<form method="POST" action="/register">
    <div>
        <label> Name : </label>
        <input type="text" name="name">
    </div>
    <br>
    <div>
        <label> Email : </label>
        <input type="email" name="email">
    </div>
    <br>
    <div>
        <label> Passowrd : </label>
        <input type="password" name="password">
    </div>
    <br>
    <div>
        <button type="submit"> Register</button>
    </div>

</form>

<%@ include file="layouts/footer.jsp" %>
