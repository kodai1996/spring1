package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloController {
	@RequestMapping("/hello")
	public String index() {
		return "hello";
	}
}
