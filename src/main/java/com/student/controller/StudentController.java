package com.student.controller;

import com.student.model_entity.Student;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController
{   @Autowired
    private StudentRepository studentRepository;
    @GetMapping
    public List<Student>getAllStudents()
    {
        return studentRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id)
    {
        return studentRepository.findById(id);
    }
    @PostMapping
    public Student createStudent(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student)
    {
        student.setId(id);
        return studentRepository.save(student);
    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id)
    {
        studentRepository.deleteById(id);
    }

}
