package com.staffiq.controller;


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
    public String check(){
        return "Server is Up....";
    }
    @PostMapping("/add")
    public EmployeeAddResponse addEmployee(@RequestBody EmployeeAddRequest data){
        return service.addEmployee(data);
    }

    @GetMapping("/get-all-employee")
    public List<EmployeeAddResponse> getAllEmployee(){
        return service.getAllEmployee();
    }

}
