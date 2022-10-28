package com.example.Employees.Controllers;


import com.example.Employees.Model.Employees;
import com.example.Employees.Service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
    @Autowired
    private EmployeesService employeesService;

    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @PostMapping
    public ResponseEntity<Employees> saveEmployees(@RequestBody Employees employees) {
        return new ResponseEntity<Employees>(employeesService.saveEmployees(employees), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Employees> getAllEmployees() {
        return employeesService.getAllEmployees();
    }

    @GetMapping("{id}")
    public ResponseEntity<Employees> getEmployeesById(@PathVariable("id") int id) {
        return new ResponseEntity<Employees>(employeesService.getEmployeesById(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Employees> updateEmployees(@PathVariable("id") int id, @RequestBody Employees employees) {
        return new ResponseEntity<Employees>(employeesService.updateEmployees(employees, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployees(@PathVariable("id") int id) {
        employeesService.deleteEmployees(id);
        return new ResponseEntity<String>("Employees Deleted Successfully", HttpStatus.OK);
    }
}