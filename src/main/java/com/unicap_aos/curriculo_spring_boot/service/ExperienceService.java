package com.unicap_aos.curriculo_spring_boot.service;

import com.unicap_aos.curriculo_spring_boot.entities.Experience;
import com.unicap_aos.curriculo_spring_boot.repository.ExperienceRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepository repository;

    public Experience createExperience(Experience experience) {
        return repository.save(experience);
    }

    public List<Experience> getAllExperiences() {
        return repository.findAll();
    }

    public Optional<Experience> getExperienceById(Long id) {
        return repository.findById(id);
    }

    public String deleteExperienceById(Long id) {
        try {
            repository.deleteById(id);
            return "Deletado!";
        } catch (Exception e) {
            return "Erro";
        }
    }
}
