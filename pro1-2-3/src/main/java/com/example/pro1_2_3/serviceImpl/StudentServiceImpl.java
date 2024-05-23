package com.example.pro1_2_3.serviceImpl;
import com.example.pro1_2_3.entity.Student;
import com.example.pro1_2_3.repository.StudentRepository;
import com.example.pro1_2_3.service.StudentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Student> studentPage = studentRepository.findAll(pageable);
        return studentPage.getContent();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Student not found with id: " + id));
    }

    @Override
    public Student addStudent(Student student) {
        // validation logic if needed
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);
        // update studentDetails to student object
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
