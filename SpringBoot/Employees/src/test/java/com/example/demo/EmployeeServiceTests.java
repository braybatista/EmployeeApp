package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bbatista.thales.model.ResponseAll;
import com.bbatista.thales.model.ResponseSingle;
import com.bbatista.thales.service.EmployeeService;

@SpringBootTest
class EmployeeServiceTests {
	
	@Autowired
	EmployeeService employeeService;

	@Test
	void findAll() {
		ResponseEntity<ResponseAll> responseData = employeeService.findAll();
		
		if(responseData.getStatusCode() == HttpStatus.OK) {
			assertThat(responseData.getBody()).isNotNull();
			assertEquals(HttpStatus.CREATED.value(), responseData.getStatusCode());
		} else {
			assertThat(responseData.getBody()).isNull();
			assertEquals(HttpStatus.CREATED.value(), responseData.getStatusCode());
		}
	}
	
	void findByID() {
		
		Integer id = 1;
		
		ResponseEntity<ResponseSingle> responseData = employeeService.findByID(id);
		
		if(responseData.getStatusCode() == HttpStatus.OK) {
			assertThat(responseData.getBody()).isNotNull();
			assertEquals(HttpStatus.CREATED.value(), responseData.getStatusCode());
		} else {
			assertThat(responseData.getBody()).isNull();
		}
		
		id = 80;
		
		responseData = employeeService.findByID(id);
		
		if(responseData.getStatusCode() == HttpStatus.OK) {
			if(responseData.getBody() != null && responseData.getBody().getData() != null) {
				assertThat(responseData.getBody()).isNotNull();
				assertEquals(HttpStatus.CREATED.value(), responseData.getStatusCode());
			} else {
				assertThat(responseData.getBody()).isNull();
			}
		}
	}

}
