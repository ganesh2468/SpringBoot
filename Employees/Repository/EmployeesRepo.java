package com.example.Employees.Repository;

import com.example.Employees.Model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepo extends JpaRepository<Employees,Integer> {
}
