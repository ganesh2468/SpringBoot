package com.example.Employees.Service;

import com.example.Employees.Model.Employees;
import com.example.Employees.Repository.EmployeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeesServiceImpl implements EmployeesService{

    @Autowired
    private EmployeesRepo employeesRepo;
    public EmployeesServiceImpl(EmployeesRepo employeesRepo){
        this.employeesRepo=employeesRepo;
    }

    @Override
    public Employees saveEmployees(Employees employees)
    {
        return employeesRepo.save(employees);
    }

    @Override
    public List<Employees> getAllEmployees()
    {
        return employeesRepo.findAll();
    }

    @Override
    public Employees getEmployeesById(int id)
    {
        return employeesRepo.findById(id).orElseThrow();
    }

    @Override
    public Employees updateEmployees(Employees employees,int id)
    {
        Employees existingEmployees=employeesRepo.findById(id).orElseThrow();
        existingEmployees.setFirstName(employees.getFirstName());
        existingEmployees.setLastName(employees.getLastName());
        existingEmployees.setPhoneNumber(employees.getPhoneNumber());
        employeesRepo.save(existingEmployees);
        return existingEmployees;
    }

    @Override
    public void deleteEmployees(int id) {
        employeesRepo.findById(id).orElseThrow();
        employeesRepo.deleteById(id);
    }
}
