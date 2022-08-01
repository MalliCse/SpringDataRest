package com.example.demo

import org.springframework.data.rest.core.config.Projection
import com.example.demo.model.Student

@Projection(name='NoName',types= Student)
interface StudentProjection {
	int getRollno();
}
