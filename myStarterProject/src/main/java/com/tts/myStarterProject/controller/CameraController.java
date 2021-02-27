package com.tts.myStarterProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CameraController {
	@GetMapping(value = "/")
	public String index() {
		return "My very own project";
	}
	
}
