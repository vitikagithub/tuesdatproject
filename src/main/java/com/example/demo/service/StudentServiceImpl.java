package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudenetService{
	
	@Autowired
	private StudentRepository studentrepository;
	
	public StudentModel saveStudentModel(StudentModel studentmodel) {
		return studentrepository.save(studentmodel);
	}
	
	public List<StudentModel> getAllCustomerModel(){
		return studentrepository.findAll();
	}

}
