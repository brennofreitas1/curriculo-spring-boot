package com.unicap_aos.curriculo_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unicap_aos.curriculo_spring_boot.entities.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
