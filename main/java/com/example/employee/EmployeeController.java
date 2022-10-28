package com.example.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController {
    @GetMapping("/employee/{id}/{location}/{salary}")
    public Employee employee_one(@PathVariable("id") int id, @PathVariable("location") String location,@PathVariable("salary") int salary)
    {
        return new Employee(id, location, salary);
    }
    @GetMapping("/employee/api")
    public Employee employee_two(@RequestParam(name="id") int id, @RequestParam(name="location") String location, @RequestParam(name="salary") int salary)
    {
        return new Employee(id, location, salary);
    }
}
