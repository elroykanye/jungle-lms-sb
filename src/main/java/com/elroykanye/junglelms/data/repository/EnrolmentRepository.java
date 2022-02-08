package com.elroykanye.junglelms.data.repository;

import com.elroykanye.junglelms.data.entity.Enrolment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolmentRepository extends JpaRepository<Enrolment, Long> {
}
