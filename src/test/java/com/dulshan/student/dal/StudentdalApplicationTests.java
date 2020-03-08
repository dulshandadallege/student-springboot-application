package com.dulshan.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dulshan.student.dal.entities.Student;
import com.dulshan.student.dal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		
		Student entity = new Student();
		student.setName("John");
		student.setCourse("Java Web Services");
		student.setFee(30d);
		studentRepository.save(entity);
	}

}
