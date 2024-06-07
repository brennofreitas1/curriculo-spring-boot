package com.unicap_aos.curriculo_spring_boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicap_aos.curriculo_spring_boot.entities.Education;
import com.unicap_aos.curriculo_spring_boot.service.EducationService;

@RestController
@RequestMapping("/education")
public class EducationController {
    @Autowired
    private EducationService service;

    @PostMapping
    public Education save(@RequestBody Education education) {
        return service.createEducation(education);
    }

    @GetMapping
    public List<Education> getAll() {
        return service.getAllEducations();
    }

    @GetMapping("/{id}")
    public Optional<Education> getById(@PathVariable Long id) {
        return service.getEducationById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.deleteEducationById(id);
    }
}
