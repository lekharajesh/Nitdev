package com.digital.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello/{name}")
	public ResponseEntity<String> greetings(@PathVariable String name){
		return new ResponseEntity<>("Hello "+name+" Welcome to digital world!!!!",HttpStatus.OK);
		
	}
	
}
