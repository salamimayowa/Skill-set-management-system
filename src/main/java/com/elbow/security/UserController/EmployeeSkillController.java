package com.elbow.security.UserController;

import com.elbow.security.user.EmployeeSkill;
import com.elbow.security.UserService.EmployeeSkillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee-skills")
public class EmployeeSkillController {
    private final EmployeeSkillService employeeSkillService;

    public EmployeeSkillController(EmployeeSkillService employeeSkillService) {
        this.employeeSkillService = employeeSkillService;
    }

    @GetMapping
    public List<EmployeeSkill> getAllEmployeeSkills() {
        return employeeSkillService.getAllEmployeeSkills();
    }

    @PostMapping
    public EmployeeSkill createEmployeeSkill(@RequestBody EmployeeSkill employeeSkill) {
        return employeeSkillService.saveEmployeeSkill(employeeSkill);
    }

    @GetMapping("/{id}")
    public EmployeeSkill getEmployeeSkillById(@PathVariable Long id) {
        return employeeSkillService.getEmployeeSkillById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployeeSkill(@PathVariable Long id) {
        employeeSkillService.deleteEmployeeSkill(id);
        return ResponseEntity.noContent().build();
    }
}
