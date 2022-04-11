package com.example.azure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureApplication {
	
	@Autowired
	private StudentRepo repository;
	
	@GetMapping("/")
	public String home()
	{
		return "Welcome";
	}
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student s)
	{
		return repository.save(s);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return repository.findAll();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}
