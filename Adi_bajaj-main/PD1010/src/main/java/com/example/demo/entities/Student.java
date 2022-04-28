package com.example.demo.entities;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {

			@Id
			private int userid;
			private String status;
			private String emailid;
			private int rollno;
			private String num[];
			private String alphabets[];
			public Student() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Student(int userid, String emailid, int rollno, String[] num, String[] alphabets) {
				super();
				this.userid = userid;
				this.emailid = emailid;
				this.rollno = rollno;
				this.num = num;
				this.alphabets = alphabets;
			}
			public Student(int userid, String status, String emailid, int rollno, String[] num, String[] alphabets) {
				super();
				this.userid = userid;
				this.status = status;
				this.emailid = emailid;
				this.rollno = rollno;
				this.num = num;
				this.alphabets = alphabets;
			}
			public int getUserid() {
				return userid;
			}
			public void setUserid(int userid) {
				this.userid = userid;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			public String getEmailid() {
				return emailid;
			}
			public void setEmailid(String emailid) {
				this.emailid = emailid;
			}
			public int getRollno() {
				return rollno;
			}
			public void setRollno(int rollno) {
				this.rollno = rollno;
			}
			public String[] getNum() {
				return num;
			}
			public void setNum(String[] num) {
				this.num = num;
			}
			public String[] getAlphabets() {
				return alphabets;
			}
			public void setAlphabets(String[] alphabets) {
				this.alphabets = alphabets;
			}
			@Override
			public String toString() {
				return "Student [userid=" + userid + ", status=" + status + ", emailid=" + emailid + ", rollno="
						+ rollno + ", num=" + Arrays.toString(num) + ", alphabets=" + Arrays.toString(alphabets) + "]";
			}
			
			
			
			
	
}
