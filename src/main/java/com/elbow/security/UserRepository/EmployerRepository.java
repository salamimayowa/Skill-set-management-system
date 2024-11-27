package com.elbow.security.UserRepository;

import com.elbow.security.user.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
}
