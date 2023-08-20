package com.student.service;

import com.student.model_entity.Student;

import java.util.List;

public interface StudentService
{
 List<Student>getAllStudent();
 Student getStudentById(Long id);
 Student createStudent(Student student);
 Student updateStudent(Long id , Student student);
 void deleteStudent(Long id);

}
