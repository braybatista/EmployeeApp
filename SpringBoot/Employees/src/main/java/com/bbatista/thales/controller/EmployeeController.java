package com.bbatista.thales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbatista.thales.model.ResponseAll;
import com.bbatista.thales.model.ResponseSingle;
import com.bbatista.thales.service.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeServiceInst;
	
	@GetMapping(value="/employees")
	public ResponseEntity<ResponseAll> findAll(){
		return employeeServiceInst.findAll();
	}
	
	@GetMapping(value="/employees/{empId}")
	public ResponseEntity<ResponseSingle> findByID(@PathVariable(value = "empId")Integer id){	
		return employeeServiceInst.findByID(id);
	}

}
