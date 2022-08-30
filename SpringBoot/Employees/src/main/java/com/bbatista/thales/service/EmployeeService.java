package com.bbatista.thales.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bbatista.thales.model.ResponseAll;
import com.bbatista.thales.model.ResponseSingle;

@Service("EmployeeService")
public class EmployeeService {
	
	@Value("${employee.url}")
	private String employeeUrl; //http://dummy.restapiexample.com/api/v1/employees
	
	@Value("${employees.url}")
	private String employeesUrl; //http://dummy.restapiexample.com/api/v1/employee/1
	
	public ResponseEntity<ResponseAll> findAll(){
		RestTemplate restTemplate = new RestTemplate();
		try {
			ResponseAll dataResult = restTemplate.getForObject(employeesUrl, ResponseAll.class);
			return new ResponseEntity<>(dataResult, HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(new ResponseAll(), HttpStatus.INTERNAL_SERVER_ERROR);
		} finally {
			
		}
	}
	
	public ResponseEntity<ResponseSingle> findByID(Integer id){
		RestTemplate restTemplate = new RestTemplate();
		String employeeUrlByIdURL = employeeUrl + '/' + id;
		
		try {
			ResponseSingle dataResult = restTemplate.getForObject(employeeUrlByIdURL, ResponseSingle.class);
			return new ResponseEntity<>(dataResult, HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(new ResponseSingle(), HttpStatus.INTERNAL_SERVER_ERROR);
		} finally {
			
		}
	}
}
