package com.example.pro1_2_3.repository;
import com.example.pro1_2_3.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}


