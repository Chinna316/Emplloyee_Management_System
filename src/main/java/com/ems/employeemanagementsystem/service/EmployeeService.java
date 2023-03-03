package com.ems.employeemanagementsystem.service;

import com.ems.employeemanagementsystem.model.Employee;

import java.util.*;

public interface EmployeeService {
    List<Employee> getAllEmployees();


    Employee createEmployee(Employee employee);

    boolean deleteEmployees(Long id);

    Employee getEmployee(Long id);

    Employee updateEmployee(Employee employee, Long id);
}
