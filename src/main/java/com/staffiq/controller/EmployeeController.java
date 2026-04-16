package com.staffiq.controller;


import com.staffiq.entity.Employee;
import com.staffiq.model.EmployeeAddRequest;
import com.staffiq.model.EmployeeAddResponse;
import com.staffiq.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

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
    public EmployeeAddResponse addEmployee(@Valid @RequestBody EmployeeAddRequest data) {
        return service.addEmployee(data);
    }

    @GetMapping("/employees")
    public Page<EmployeeAddResponse> getAllEmployee(
            @PageableDefault(page = 0, size = 5, sort = "id") Pageable pageable) {
        return service.getAllEmployee(pageable);
    }

    @GetMapping("/id/{id}")
    public EmployeeAddResponse getEmployeeById(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/department/{department}")
    public Page<Employee> getEmployeeByDepartment(
            @PathVariable String department,
            Pageable pageable) {
        return service.getEmployeeByDepartment(department, pageable);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@RequestBody EmployeeAddRequest request, @PathVariable Long id) {
        return service.updateEmployee(request, id);
    }

    @DeleteMapping("/delete/{id}")
    public Map<String, String> deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);

        return Map.of("status", "Employee has been deleted");
    }

    @DeleteMapping("/delete/all")
    public Map<String, String> deleteAllEmployees() {
        service.deleteAllEmployees();

        return Map.of("status", "All Employees has been deleted");
    }
}
