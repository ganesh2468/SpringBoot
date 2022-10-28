package com.example.employee;
public class Employee {
    private int id;
    private String location;
    private int salary;
    public Employee(int id,String location,int salary){
        this.id=id;
        this.location=location;
        this.salary=salary;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location)
    {
        this.location=location;
    }
    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
}