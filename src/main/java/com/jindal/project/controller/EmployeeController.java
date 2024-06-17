package com.jindal.project.controller;

import com.jindal.project.model.Employee;
import com.jindal.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

@Autowired
    EmployeeService employeeService;

@GetMapping("/demo")
public String demo(){
    System.out.println("Reached demo");
    return "Demo reached!";
}

@GetMapping("/test")
    public Employee test(){
    Employee e = new Employee("Mayank Jindal", "Senior Software Engineer", "Hygiene", "mayank.jindal@oracle.com");
    return employeeService.saveEmployee(e);
}

@GetMapping("/employees")
    public List<Employee> getAllEmployees(){
    return employeeService.fetchAllEmployees();
}

@GetMapping("/employee/{id}")
    public Employee fetchEmployeeById(@PathVariable Long id){
    return employeeService.fetchById(id);
}

@PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee e){
    return employeeService.saveEmployee(e);
}

@PutMapping("/updateEmployee/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee e){
    return employeeService.updateEmployee(id, e);
}

@DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
    return employeeService.deleteById(id);
}

}
