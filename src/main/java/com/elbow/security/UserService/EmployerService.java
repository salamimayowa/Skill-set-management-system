package com.elbow.security.UserService;

import com.elbow.security.user.Employer;
import com.elbow.security.UserRepository.EmployerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerService {
    private final EmployerRepository employerRepository;

    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    public List<Employer> getAllEmployers() {
        return employerRepository.findAll();
    }

    public Employer saveEmployer(Employer employer) {
        return employerRepository.save(employer);
    }

    public void deleteEmployer(Long id) {
        employerRepository.deleteById(id);
    }
}
