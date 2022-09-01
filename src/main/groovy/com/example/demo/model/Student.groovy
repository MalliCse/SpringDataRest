package com.example.demo.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern

@Entity
class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id
	@Column
	//@JsonIgnore
	@NotNull(message="Name Should Not Be Null")
	@Pattern(regexp = "^[a-zA-Z]*",message = "Name Should Not have Special Characters and Integers")
	String name
	@Column
	@NotNull(message="Contact Should Not Be Empty")
	Long contact;
	@Column
	String address;
	
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

	public Long getContact() {
		return this.contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(Long id, String name, Long contact, String address) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}
	Student() {
		super()
	}
	
}
