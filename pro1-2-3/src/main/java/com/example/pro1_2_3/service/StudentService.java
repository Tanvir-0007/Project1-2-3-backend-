package com.example.pro1_2_3.service;
import com.example.pro1_2_3.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents(int page, int size);
    Student getStudentById(Long id);
    Student addStudent(Student student);
    Student updateStudent(Long id, Student studentDetails);
    void deleteStudent(Long id);
    List<Student> searchStudentsByName(String name);
}
