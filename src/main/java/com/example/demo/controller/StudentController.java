package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/Student")
public class StudentController {
		@Autowired
		private StudentServiceImpl studentserviceimpl;
		
		@PostMapping("/addstudent")
		public StudentModel addstudentModel(@RequestBody StudentModel studentmodel) {
			return studentserviceimpl.saveStudentModel(studentmodel);
		}
		
		@GetMapping("/getstudent")
		public List<StudentModel>getAllStudentModel(){
			return studentserviceimpl.getAllCustomerModel();
		}
	}



