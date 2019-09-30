package com.ram.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ram.student.dal.entities.Student;
import com.ram.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("ff");
		student.setFee(30d);
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {
		Optional<Student> studentOptional = studentRepository.findById(1l);
		if (studentOptional.isPresent()) {
			Student student = studentOptional.get();
			System.out.println(student);
		}
	}

	@Test
	public void testUpdateStudentById() {
		Optional<Student> studentOptional = studentRepository.findById(1l);
		if (studentOptional.isPresent()) {
			Student student = studentOptional.get();
			student.setFee(90d);
			studentRepository.save(student);
		}
	}
	@Test
	public void testDeleteStudentById() {
		Student student=new Student();
		student.setId(10l);
		studentRepository.delete(student);
	}
}
