package com.example.sms.service.impl;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import com.example.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() { return studentRepository.findAll(); }
    public Student saveStudent(Student student) { return studentRepository.save(student); }
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }
    public Student updateStudent(Student student) { return studentRepository.save(student); }
    public void deleteStudentById(Long id) { studentRepository.deleteById(id); }
    public List<Student> searchStudents(String keyword) {
        if (keyword == null || keyword.isBlank()) return studentRepository.findAll();
        return studentRepository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCaseOrCourseContainingIgnoreCase(keyword, keyword, keyword);
    }
}
