package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@GetMapping("/hello")
	public Map<String,String> hello() {
		Map<String,String> mp= Map.of("name","munni");
		return mp;
	}
}
