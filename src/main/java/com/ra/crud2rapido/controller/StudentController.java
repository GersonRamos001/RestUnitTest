package com.ra.crud2rapido.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ra.crud2rapido.entity.Estudiante;
import com.ra.crud2rapido.service.StudentService;

@RestController

@RequestMapping(path = "api/v1/students")
public class StudentController {
	@Autowired
	StudentService studentService;

	@GetMapping
	public List<Estudiante> getAll() {
		return studentService.getStudents();
	}

	@PostMapping
	public Estudiante saveUpdate(@RequestBody Estudiante estudiante) {
		studentService.saveOrUpdate(estudiante);
		return estudiante;
	}

	@DeleteMapping("/{studentId}")
	public void delete(@PathVariable("studentId") Long id) {
		studentService.delete(id);
	}

	@GetMapping("/{studentId}")
	public Optional<Estudiante> getById(@PathVariable("studentId") Long id) {
		return studentService.getStudent(id);
	}

}
