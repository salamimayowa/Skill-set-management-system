package com.elbow.security.user;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee_skills")
public class EmployeeSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    private int proficiencyLevel; // Example: 1-10
}