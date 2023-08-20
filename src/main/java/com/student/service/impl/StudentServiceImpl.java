package com.student.service.impl;

import com.student.model_entity.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService
{
    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
    }

    @Override
    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id)
    {
        Optional<Student>studentOptional=studentRepository.findById(id);
        return studentOptional.orElse(null);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student student)
    {
        student.setId(id);
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id)
    {
        studentRepository.deleteById(id);
    }


}
