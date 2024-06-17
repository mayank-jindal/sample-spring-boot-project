package com.jindal.project.service;

import com.jindal.project.dao.EmployeeDao;
import com.jindal.project.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    EmployeeDao dao;

    @Override
    public Employee saveEmployee(Employee e){
        return dao.save(e);
    }

    @Override
    public List<Employee> fetchAllEmployees(){
        List<Employee> all_employees = dao.findAll();
        return all_employees;
    }

    @Override
    public Employee fetchById(Long id){
        Employee emp = dao.findById(id).orElse(null);
        return emp;
    }

    @Override
    public String deleteById(Long id){
        dao.deleteById(id);
        return "Employee with id "+id+" deleted!";
    }

    @Override
    public Employee updateEmployee(Long id, Employee e){
        Employee emp = dao.findById(id).orElse(null);
        emp.setName(e.getName());
        emp.setDesignation(e.getDesignation());
        emp.setTeam(e.getTeam());
        emp.setEmail(e.getEmail());
        return dao.save(emp);
    }
}
