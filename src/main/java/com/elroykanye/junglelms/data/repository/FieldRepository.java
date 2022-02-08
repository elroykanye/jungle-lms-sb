package com.elroykanye.junglelms.data.repository;

import com.elroykanye.junglelms.data.entity.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends JpaRepository<Field, Long> {
}
