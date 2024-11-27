package com.elbow.security.UserRepository;

import com.elbow.security.user.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
