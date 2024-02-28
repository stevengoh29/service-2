package com.example.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service2Application {

	@GetMapping("/")
	public ResponseEntity<?> doTest () {
		return new ResponseEntity<>("Hello World from service-2", HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(Service2Application.class, args);
	}

}
