package com.dulshan.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.dulshan.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
