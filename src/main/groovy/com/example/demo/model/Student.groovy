package com.example.demo.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int rollno
	@Column
	String name
	int getRollno() {
		return rollno
	}
	void setRollno(int rollno) {
		this.rollno = rollno
	}
	String getName() {
		return name
	}
	void setName(String name) {
		this.name = name
	}
	Student() {
		super()
	}
	Student(int rollno, String name) {
		super()
		this.rollno = rollno
		this.name = name
	}
}
