package com.ram.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.ram.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
