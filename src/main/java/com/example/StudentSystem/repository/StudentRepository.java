package com.example.StudentSystem.repository;

import com.example.StudentSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
//    all crud database methods
}
