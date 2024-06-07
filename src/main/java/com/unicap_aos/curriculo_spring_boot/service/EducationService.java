package com.unicap_aos.curriculo_spring_boot.service;

import com.unicap_aos.curriculo_spring_boot.entities.Education;
import com.unicap_aos.curriculo_spring_boot.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EducationService {
    @Autowired
    private EducationRepository repository;

    public Education createEducation(Education education) {
        return repository.save(education);
    }

    public List<Education> getAllEducations() {
        return repository.findAll();
    }

    public Optional<Education> getEducationById(Long id) {
        return repository.findById(id);
    }

    public String deleteEducationById(Long id) {
        try {
            repository.deleteById(id);
            return "Deletado!";
        } catch (Exception e) {
            return "Erro";
        }
    }
}