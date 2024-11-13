package com.docker.DockerApp.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcokerController {
	
	
	
	@GetMapping("/")
	public Map<String, Object> getDockerData(){
		Map<String, Object> data = new HashMap<>();
		data.put("message", "This is my java spring boot docker images message");
		data.put("language", Arrays.asList("java","pythod","javascript"));
		data.put("code", 2345);
		return data;
	}

}
