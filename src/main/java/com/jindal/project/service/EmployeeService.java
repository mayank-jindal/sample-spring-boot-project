package com.jindal.project.service;

import com.jindal.project.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(Employee e);
    public List<Employee> fetchAllEmployees();
    public Employee fetchById(Long id);
    public String deleteById(Long id);
    public Employee updateEmployee(Long id, Employee e);
}
