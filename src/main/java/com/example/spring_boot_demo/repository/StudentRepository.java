package com.example.spring_boot_demo.repository;

import com.example.spring_boot_demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    List<StudentEntity> findByFirstName(String name);
    List<StudentEntity> findByEmail(String email);
}