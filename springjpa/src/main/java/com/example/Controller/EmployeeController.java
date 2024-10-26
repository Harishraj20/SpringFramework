package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Model.Employee;
import com.example.Service.EmployeeService;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("sortedEmployees")
    public ModelAndView getSortedEmployees() {
        ModelAndView mv = new ModelAndView("sort");
        List<Employee> emps = service.fetchAll();
        mv.addObject("employees", emps);
        return mv;
    }

    @PostMapping("addEmployees")
    public String addEmployee(
            @RequestParam("empId") int id,
            @RequestParam("empname") String name,
            @RequestParam("empage") int age,
            @RequestParam("emprole") String role,
            @RequestParam("empsalary") int salary) {
        Employee emp = new Employee(age, id, name, role, salary);
        service.AddEmployee(emp);

        return "redirect:/sortedEmployees";
    }
    @PostMapping("deleteEmployee")
public String deleteEmployee(@RequestParam("empId") int id) {
    service.deleteEmployeeById(id); 
    return "redirect:/sortedEmployees"; 
}

}
