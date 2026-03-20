package com.staffiq.controller;


import com.staffiq.entity.Employee;
import com.staffiq.model.EmployeeAddRequest;
import com.staffiq.model.EmployeeAddResponse;
import com.staffiq.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    @GetMapping("/check")
    public String check() {
        return "Server is Up....";
    }

    @PostMapping("/add")
    public EmployeeAddResponse addEmployee(@RequestBody EmployeeAddRequest data) {
        return service.addEmployee(data);
    }

    @GetMapping("/employees")
    public List<EmployeeAddResponse> getAllEmployee() {
        return service.getAllEmployee();
    }

    @GetMapping("/employees/{id}")
    public EmployeeAddResponse getEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/department/{department}")
    public List<Employee> getEmployeeByDepartment(@PathVariable String department){
        return service.getEmployeeByDepartment(department);
    }

    @PutMapping("/employees/update/{id}")
    public Employee updateEmployee(@RequestBody EmployeeAddRequest request,@PathVariable  Long id){
        return service.updateEmployee(request, id);
    }
}
