package com.example.demo

import org.apache.tools.ant.types.selectors.ExtendSelector
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.rest.core.annotation.HandleBeforeCreate
import org.springframework.data.rest.core.annotation.HandleBeforeDelete
import org.springframework.data.rest.core.annotation.HandleBeforeSave
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

import com.example.demo.model.Student

@Service
@RepositoryEventHandler(Student)
class StudentValidation{
	@Autowired
	StudentRepository sturepo
	@HandleBeforeCreate
	void handleStudentCreate(Student student) {
	  // � you can now deal with Person in a type-safe way
		if (student.getName().isEmpty()) {
			throw new NameValidationException('Name Should not be empty')
		}
		println("Received Post Request");
	}
	@HandleBeforeDelete
	void handleStudentDelete(int id) {
	  // � you can now deal with Person in a type-safe way
		println("Received Delete Request");
		
	}
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
