package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.core.annotation.HandleBeforeCreate
import org.springframework.data.rest.core.annotation.HandleBeforeDelete
import org.springframework.data.rest.core.annotation.HandleBeforeSave
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.stereotype.Component

import com.example.demo.model.Student

@Component
@RepositoryEventHandler(Student)
class StudentValidation {
	@Autowired
	StudentRepository sturepo
	@HandleBeforeCreate
	void handleStudentCreate(Student p) {
	  // � you can now deal with Person in a type-safe way
		if (p.name().empty()) {
			throw new NameValidationException('Name Should not be empty')
		}
	}
	/*@HandleBeforeDelete
	void handleStudentDelete(Student p) {
	  // � you can now deal with Person in a type-safe way
		if (p.rollno() > 0) {
			throw new NullPointerException('Delete Operation Can Not Be Done')
		}
	}*/
	/*@HandleBeforeSave
	ResponseEntity<String> handleStudentSave1(Student p) {
	  // � you can now deal with Person in a type-safe way
		print p.getName()
		if(p.getName().equals("Malli"))
		  return new ResponseEntity<String>("Name Should Be Malli", HttpStatus.BAD_REQUEST);
		else
			return new ResponseEntity<String>("Details Are Saved", HttpStatus.CREATED);
	}*/
}
