package com.ems.employeemanagementsystem.controller;

import com.ems.employeemanagementsystem.model.Employee;
import com.ems.employeemanagementsystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/post")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }


    @GetMapping("/get")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEmployees(@PathVariable Long id) {
        boolean deleted = false;
        deleted = employeeService.deleteEmployees(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/update")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
        Employee employee = null;
        employee = employeeService.getEmployee(id);
        return ResponseEntity.ok(employee);
    }


    @PutMapping
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
        employee = employeeService.updateEmployee(employee, id);
        return ResponseEntity.ok(employee);
    }
}



