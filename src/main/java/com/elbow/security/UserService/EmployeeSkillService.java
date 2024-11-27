package com.elbow.security.UserService;

import com.elbow.security.user.EmployeeSkill;
import com.elbow.security.UserRepository.EmployeeSkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSkillService {
    private final EmployeeSkillRepository employeeSkillRepository;

    public EmployeeSkillService(EmployeeSkillRepository employeeSkillRepository) {
        this.employeeSkillRepository = employeeSkillRepository;
    }

    public List<EmployeeSkill> getAllEmployeeSkills() {
        return employeeSkillRepository.findAll();
    }

    public EmployeeSkill saveEmployeeSkill(EmployeeSkill employeeSkill) {
        return employeeSkillRepository.save(employeeSkill);
    }

    public EmployeeSkill getEmployeeSkillById(Long id) {
        return employeeSkillRepository.findById(id).orElse(null);
    }

    public void deleteEmployeeSkill(Long id) {
        employeeSkillRepository.deleteById(id);
    }
}
