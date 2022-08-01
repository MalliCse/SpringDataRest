package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

import com.example.demo.model.Student

@RepositoryRestResource(path = 'studentsapi')
interface StudentRepository extends JpaRepository<Student,Integer> {
	
	
	@RestResource(exported=false)
	void deleteByRollno(int rollno);
	
}
