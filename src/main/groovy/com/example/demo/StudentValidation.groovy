package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.core.annotation.HandleBeforeCreate
import org.springframework.data.rest.core.annotation.HandleBeforeDelete
import org.springframework.data.rest.core.annotation.HandleBeforeSave
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

import com.example.demo.model.Student

@Service
@RepositoryEventHandler(Student)
class StudentValidation{
	@Autowired
	StudentRepository sturepo
	
	@HandleBeforeCreate
	void handleStudentCreate(Student student) {
	  // � you can now deal with Person in a type-safe way
		//student.setName("Aruna")
		Student studentDb=sturepo.findByName(student.getName())
		if(studentDb!=null)
			throw new ResponseStatusException(HttpStatus.CONFLICT,"Details Are Already Available&Not Persisted with Student name ${student.getName()}");
		println("Received Post Request");
	}
	@HandleBeforeDelete
	void handleStudentDelete(Student student) {
	  // � you can now deal with Person in a type-safe way
		println("Received Delete Request");
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Delete Operation Can Not Be Performed");
		
	}
	@HandleBeforeSave
	void handleStudentSave1(Student p) {
	  // � you can now deal with Person in a type-safe way
		println("Received Update Request");
		print p.getName()
	}
}
