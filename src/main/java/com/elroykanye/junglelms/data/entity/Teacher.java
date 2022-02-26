package com.elroykanye.junglelms.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teacherId;

    @Column(name = "teacher_phone")
    private String teacherPhone;

    @Column(name = "service_number", length = 64)
    private String serviceNumber;

}
