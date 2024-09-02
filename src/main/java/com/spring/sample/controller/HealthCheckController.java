package com.spring.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HealthCheckController {

	
	@GetMapping("/healthcheck")
	public String healthCheck() {
		return "healthCheck";
	}
}
