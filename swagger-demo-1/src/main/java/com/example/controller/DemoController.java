package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.EmpEntity;
import com.example.service.EmpService;

@RestController
public class DemoController {
	@Autowired
	EmpService empService;

	@GetMapping(path = "wel")
	public String welcome() {
		return "This is demo";
	}

	@PostMapping(path = "/save")
	public EmpEntity saveEmp(@RequestBody EmpEntity emp) {
		return empService.saveEmp(emp);
	}

}
