package com.example.azure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentRepo extends JpaRepository<Student, Integer> {
	

}
