package com.elroykanye.junglelms.data.repository;


import com.elroykanye.junglelms.data.entity.CourseMaterialAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialAttachmentRepository extends JpaRepository<CourseMaterialAttachment, Long> {
}
