package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("addEmployees")

    public ModelAndView addemp(
            @RequestParam("empId") int id,
            @RequestParam("empname") String name,
            @RequestParam("empage") int age,
            @RequestParam("emprole") String role,
            @RequestParam("empsalary") int salary) {

        ModelAndView mv = new ModelAndView("message");
        Employee emp = new Employee(age, id, name, role, salary);
        String msg = service.AddEmployee(emp);

        mv.addObject("message", msg);
        return mv;
    }

}
