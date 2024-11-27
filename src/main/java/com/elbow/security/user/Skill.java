package com.elbow.security.user;


import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Data
@Entity
@Table(name = "skills")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String skillName;

    @OneToMany(mappedBy = "skill", cascade = CascadeType.ALL)
    private Set<EmployeeSkill> employees;
}