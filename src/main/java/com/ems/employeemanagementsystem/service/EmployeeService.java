package com.ems.employeemanagementsystem.service;

import com.ems.employeemanagementsystem.model.Employee;
import org.springframework.stereotype.Service;
import java.util.*;

public interface EmployeeService {
    List<Employee> getAllEmployees();


    Employee createEmployee(Employee employee);
}
