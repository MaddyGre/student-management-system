package com.maddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maddy.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
