package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repository.Studentrepository;

@Service
public class StudentService {
	
	@Autowired
	Studentrepository st;

	public List<Student> getStudent(Student [] c1) {
		// TODO Auto-generated method stub

		return st.getStudent(c1);
	}

}
