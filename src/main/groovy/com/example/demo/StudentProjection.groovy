package com.example.demo

import org.springframework.data.rest.core.config.Projection
import com.example.demo.model.Student

@Projection(name='studentprojection',types= Student)
interface StudentProjection {
	//int getRollno();
}
