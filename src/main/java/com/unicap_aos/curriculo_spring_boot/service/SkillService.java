package com.unicap_aos.curriculo_spring_boot.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unicap_aos.curriculo_spring_boot.entities.Skill;
import com.unicap_aos.curriculo_spring_boot.repository.SkillRepository;

@Service
public class SkillService {
    @Autowired
    private SkillRepository repository;

    public Skill createSkill(Skill skill) {
        return repository.save(skill);
    }

    public List<Skill> getAllSkills() {
        return repository.findAll();
    }

    public Optional<Skill> getSkillById(Long id) {
        return repository.findById(id);
    }

    public String deleteSkillById(Long id) {
        try {
            repository.deleteById(id);
            return "Deletado!";
        } catch (Exception e) {
            return "Erro";
        }
    }
}
