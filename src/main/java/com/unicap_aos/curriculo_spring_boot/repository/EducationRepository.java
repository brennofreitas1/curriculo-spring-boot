package com.unicap_aos.curriculo_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.unicap_aos.curriculo_spring_boot.entities.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {
}
