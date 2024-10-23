<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored =
"false" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <p>Welcome To Employee Management Page</p>
    <form action="addEmployees" method="get">
      <label for="id"></label>
      <input type="text" placeholder="Enter Employee Id" name="empId" />
      <label for="name"></label>
      <input type="text" placeholder="Enter Employee Name" name="empname" />
      <label for="Age"></label>
      <input type="text" placeholder="Enter Employee Age" name="empage" />
      <label for="role"></label>
      <input type="text" placeholder="Enter Employee Role" name="emprole" />
      <label for="id"></label>
      <input type="text" placeholder="Enter Employee Salary" name="empsalary" />
      <input type="submit" />
    </form>
  </body>
</html>
