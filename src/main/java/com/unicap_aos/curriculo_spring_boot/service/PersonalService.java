package com.unicap_aos.curriculo_spring_boot.service;

import com.unicap_aos.curriculo_spring_boot.entities.Personal;
import com.unicap_aos.curriculo_spring_boot.repository.PersonalRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalService {

    @Autowired
    private PersonalRepository repository;

    public Personal createPersonal(Personal personal) {
        return repository.save(personal);
    }

    public List<Personal> getAllPersonals() {
        return repository.findAll();
    }

    public Optional<Personal> getPersonalById(Long id) {
        return repository.findById(id);
    }

    public String deletePersonalById(Long id) {
        try {
            repository.deleteById(id);
            return "Deletado!";
        } catch (Exception e) {
            return "Erro";
        }
    }
}
