package com.elbow.security.UserRepository;

import com.elbow.security.user.EmployeeSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeSkillRepository extends JpaRepository<EmployeeSkill, Long> {
}
