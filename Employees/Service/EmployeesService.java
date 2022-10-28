package com.example.Employees.Service;

import com.example.Employees.Model.Employees;

import java.util.List;

public interface EmployeesService {

    Employees saveEmployees(Employees employees);

    List<Employees> getAllEmployees();

    Employees getEmployeesById(int id);

    Employees updateEmployees(Employees employees,int id);

    void deleteEmployees(int id);
}
