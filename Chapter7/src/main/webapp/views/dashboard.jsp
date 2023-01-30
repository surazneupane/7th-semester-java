<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="layouts/header.jsp" %>
<h3> Dashboard</h3>

<h5>Welcome, <% out.print(session.getAttribute("loggedInUserName")); %></h5>
<h5> Your id is <% out.print(session.getAttribute("loggedInUserId")); %></h5>

<%
    Cookie cookie[] = request.getCookies();
    for (Cookie cookie1 : cookie) {
        if (cookie1.getName().equals("email")) {
            out.print("I found a cookie with name email and the value is:" + cookie1.getValue());
        }
    }
%>

<%--<% for (int i = 0; i < 5; i++) { %>--%>
<%--<h3> Tribhuwan University </h3>--%>
<%--<br>--%>
<%--<%} %>--%>

<%--declaring a variable--%>
<%--<%! int i = 0;%>--%>
<%--<% for (i = 0; i < 5; i++) { %>--%>
<%--<h3> Tribhuwan University </h3>--%>
<%--<br>--%>
<%--<%} %>--%>

<form method="POST" action="/dashboard">
    <button type="submit">Logout</button>
</form>


<%--accessing database with jsp--%>
<sql:setDataSource driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost/javaservlet"
                   user="root"
                   password="password" var="dbConnection"/>


<%--executing prepeared statement--%>
<sql:update var="count" dataSource="${dbConnection}">
    UPDATE users SET email = ? WHERE id = ?;
    <sql:param value="test123@gmail.com"/>
    <sql:param value="2"/>
</sql:update>

<%--prepared statement end--%>


<sql:query var="results" dataSource="${dbConnection}">
    SELECT * FROM users;
</sql:query>


<table border="1">
    <thead>
    <th>Id</th>
    <th>Name</th>
    <th>Email</th>
    </thead>

    <tbody>
    <c:forEach items="${results.rows}" var="row">
        <tr>
                <%--            --%>
                <%--            <td>${row.id}</td>--%>
                <%--            <td>${row.name}</td>--%>
                <%--            <td>${row.email}</td>--%>
            <td><c:out value="${row.id}"/></td>
            <td><c:out value="${row.name}"/></td>
            <td><c:out value="${row.email}"/></td>

        </tr>
    </c:forEach>

    </tbody>

</table>


<%@ include file="layouts/footer.jsp" %>
