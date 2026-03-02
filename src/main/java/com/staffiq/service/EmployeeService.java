package com.staffiq.service;

import com.staffiq.entity.Employee;
import com.staffiq.model.EmployeeAddRequest;
import com.staffiq.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void addEmployee(EmployeeAddRequest request){
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setDepartment(request.getDepartment());
        employee.setSalary(request.getSalary());

        repository.save(employee);
    }
}
