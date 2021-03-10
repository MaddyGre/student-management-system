package com.maddy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.maddy.entity.Student;
import com.maddy.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	public List<Student> listAll(){
		return repository.findAll();
	}
	
	public void save(Student student) {
		repository.save(student);
	}
	
	public Student get(long studentId) {
		return repository.findById(studentId).get();
	}
	
	public void delete(long studentId) {
		repository.deleteById(studentId);
	}

}
