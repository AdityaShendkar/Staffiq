package com.staffiq.service;

import com.staffiq.entity.Employee;
import com.staffiq.model.EmployeeAddRequest;
import com.staffiq.model.EmployeeAddResponse;
import com.staffiq.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public EmployeeAddResponse addEmployee(EmployeeAddRequest request) {
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setDepartment(request.getDepartment());
        employee.setSalary(request.getSalary());

        Employee storedEmployee = repository.save(employee);
        return new EmployeeAddResponse(storedEmployee.getId(), storedEmployee.getName());
    }

    public List<EmployeeAddResponse> getAllEmployee() {
        List<Employee> dbEmployees = repository.findAll();
        List<EmployeeAddResponse> employees = new ArrayList<>();
        for (Employee emp : dbEmployees){
            EmployeeAddResponse response = new EmployeeAddResponse();
            response.setId(emp.getId());
            response.setName(emp.getName());
            employees.add(response);
        }
        return employees;
    }
}
