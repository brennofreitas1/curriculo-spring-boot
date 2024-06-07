package com.unicap_aos.curriculo_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.unicap_aos.curriculo_spring_boot.entities.Personal;
import com.unicap_aos.curriculo_spring_boot.service.PersonalService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    private PersonalService service;

    @PostMapping
    public Personal create(@RequestBody Personal personal) {
        return service.createPersonal(personal);
    }

    @GetMapping
    public List<Personal> getAll() {
        return service.getAllPersonals();
    }

    @GetMapping("/{id}")
    public Optional<Personal> getById(@PathVariable Long id) {
        return service.getPersonalById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePersonalById(id);
    }
}
