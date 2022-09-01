package com.example.demo

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource

import com.example.demo.model.Student
import com.example.demo.model.StudentProjection

@RepositoryRestResource(path = 'studentsapi',excerptProjection = StudentProjection.class)
interface StudentRepository extends CrudRepository<Student,Long> {
	
	/*@Override
	@RestResource(exported=false)
	void delete(Student entity);
	
	
	@Override
	@RestResource(exported = false)
	void deleteById(Long id);*/
	
	/*@Override
	@RestResource(exported = false)
	Student findById(Long id)*/
	
	@RestResource(path = "byName")
	Student findByName(@Param("name") String name);
	
}
