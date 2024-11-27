package com.elbow.security.user;


import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "employers")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String contactEmail;

    @OneToMany(mappedBy = "employer", cascade = CascadeType.ALL)
    private Set<Employee> employees;
}