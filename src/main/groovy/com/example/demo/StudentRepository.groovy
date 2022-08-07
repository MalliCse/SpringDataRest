package com.example.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

import com.example.demo.model.Student

@RepositoryRestResource(path = 'studentsapi',excerptProjection = StudentProjection.class)
interface StudentRepository extends JpaRepository<Student,Long> {
	
	@Override
	@RestResource(exported=false)
	void delete(Student entity);
	
	
	/*@RestResource(exported=false)
	void deleteById(Long id);*/
	
	
	Student findByName(@Param("name") String name);
	
}
