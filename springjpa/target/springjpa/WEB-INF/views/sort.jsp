<%@ page contentType="text/html;charset=UTF-8" language="java"
isELIgnored="false" %> <%@ page import="com.example.Model.Employee" %> <%@
taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Employee List</title>
  </head>
  <body>
    <table border="1">
      <tr>
        <th style="width: 20%">Employee ID</th>
        <th>Employee Name</th>
        <th>Employee Age</th>
        <th>Employee Role</th>
        <th>Employee Salary</th>
        <th>Actions</th>
      </tr>
      <c:forEach var="employee" items="${employees}">
        <tr>
          <td>${employee.id}</td>
          <td>${employee.name}</td>
          <td>${employee.age}</td>
          <td>${employee.role}</td>
          <td>${employee.salary}</td>
          <td>
            <form action="deleteEmployee" method="post" style="display:inline;">
                <input type="hidden" name="empId" value="${employee.id}" />
                <input type="submit" value="Delete" onclick="return confirm('Are you sure you want to delete this employee; ${employee.id}?');" />
            </form>
        </td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
