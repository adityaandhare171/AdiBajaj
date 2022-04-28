package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Stud;
import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;


@RestController
public class HomeControllers {

	@Autowired
	StudentService sr;

	
	@PostMapping("/bfhl")
	public List<Student> savecategory(@RequestBody Student [] c1)
	{
		return sr.getStudent(c1);
	}
	
}

