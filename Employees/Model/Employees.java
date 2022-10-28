package com.example.Employees.Model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Employees Details")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private int phoneNumber;
}
