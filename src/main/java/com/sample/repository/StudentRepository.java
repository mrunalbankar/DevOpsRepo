package com.sample.repository;

import org.springframework.data.repository.CrudRepository;
import com.sample.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
