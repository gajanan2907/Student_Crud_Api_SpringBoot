package com.student;
import com.student.model_entity.Student;
import com.student.repository.StudentRepository;
import com.student.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class StudentCrudApiApplicationTests {


//	@Mock
//	private StudentRepository studentRepository;
//
//	@InjectMocks
//	private StudentServiceImpl studentService;
//
//	@BeforeEach
//	public void setUp() {
//		MockitoAnnotations.openMocks(this);
//	}
//
//	@Test
//	public void testGetAllStudents() {
//		List<Student> studentList = new ArrayList<>();
//		studentList.add(new Student(1L, "John"));
//		studentList.add(new Student(2L, "Jane"));
//
//		when(studentRepository.findAll()).thenReturn(studentList);
//
//		List<Student> result = studentService.getAllStudent();
//
//		assertEquals(2, result.size());
//	}
//
//	@Test
//	public void testGetStudentById() {
//		Student student = new Student(1L, "John");
//
//		when(studentRepository.findById(1L)).thenReturn(Optional.of(student));
//
//		Student result = studentService.getStudentById(1L);
//
//		assertEquals("John", result.getName());
//	}
//
//	@Test
//	public void testGetStudentByIdNotFound() {
//		when(studentRepository.findById(1L)).thenReturn(Optional.empty());
//
//		Student result = studentService.getStudentById(1L);
//
//		assertNull(result);
//	}
//
//	@Test
//	public void testCreateStudent() {
//		Student newStudent = new Student("Alice");
//		Student savedStudent = new Student(1L, "Alice");
//
//		when(studentRepository.save(any(Student.class))).thenReturn(savedStudent);
//
//		Student result = studentService.createStudent(newStudent);
//
//		assertEquals(1L, result.getId());
//		assertEquals("Alice", result.getName());
//	}
//
//	@Test
//	public void testUpdateStudent() {
//		Student updatedStudent = new Student(1L, "UpdatedName");
//
//		when(studentRepository.save(any(Student.class))).thenReturn(updatedStudent);
//
//		Student result = studentService.updateStudent(1L, updatedStudent);
//
//		assertEquals("UpdatedName", result.getName());
//	}
//
//	@Test
//	public void testDeleteStudent() {
//		studentService.deleteStudent(1L);
//
//		verify(studentRepository, times(1)).deleteById(1L);
//	}

	@Test
	void contextLoads() {
	}

}
