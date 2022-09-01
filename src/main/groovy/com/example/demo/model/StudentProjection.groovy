package com.example.demo.model

import org.springframework.data.rest.core.config.Projection

@Projection(name='studentprojection',types= Student.class)
interface StudentProjection {
	
	Long getId()
	String getName()
}
