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

  <style>
    table {
      width: 100%;
      border-collapse: collapse;
      margin: 20px 0;
      font-size: 1em;
      text-align: left;
      padding-right: 10px;
      padding-left: 10px;
    }

    th,
    td {
      padding: 10px;
      border: 1px solid #0a0404;
    }

    th {
      background-color: #1f0a50;
      color: #ffffff;
      text-align: center;
    }

    tr:nth-child(even) {
      background-color: #beb3d6;
    }
  </style>
  <body>
    <table border="1">
      <tr>
        <th style="width: 20%">Employee ID</th>
        <th>Employee Name</th>
        <th>Employee Age</th>
        <th>Employee Role</th>
        <th>Employee Salary</th>
      </tr>
      <c:forEach var="employee" items="${employees}">
        <tr>
          <td>${employee.id}</td>
          <td>${employee.name}</td>
          <td>${employee.age}</td>
          <td>${employee.role}</td>
          <td>${employee.salary}</td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
