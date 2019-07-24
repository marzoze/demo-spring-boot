/**
 * 
 */
package com.example.demo.controller;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fatchurrahman
 *
 */
@RestController
@RequestMapping("/api")
public class MainController implements Serializable {
	
	@GetMapping(value = "/hallo")
	ResponseEntity<String> hallo() {
		return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body("Hallo");
	}
	
	@GetMapping(value = "/demo")
	public String hai() {
		return "test-demo";
	}

}
