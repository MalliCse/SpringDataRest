package com.example.demo.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

import com.fasterxml.jackson.annotation.JsonIgnore

@Entity
class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id
	@Column
	//@JsonIgnore
	String name
	Long getId() {
		return id
	}
	void setId(Long id) {
		this.id = id
	}
	//@JsonIgnore
	String getName() {
		return name
	}
	void setName(String name) {
		this.name = name
	}
	Student() {
		super()
	}
	Student(Long id, String name) {
		super()
		this.id = id
		this.name = name
	}
}
