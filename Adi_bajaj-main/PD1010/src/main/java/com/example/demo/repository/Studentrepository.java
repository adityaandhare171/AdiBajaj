package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer> {
	
	public default  List<Student> getStudent(Student [] s)
	{
		List<Student>lis=null;
		String num[]=new String[s.length];
		String alpha[]=new String[s.length];
		alpha[0]="A";
		num[1]="334";
		alpha[1]="Z";
		num[1]="1";
	
		lis.add(new Student(1,"true","suresh@gmail.com",1010,num,alpha));
		
	return lis;
	}
	


}
