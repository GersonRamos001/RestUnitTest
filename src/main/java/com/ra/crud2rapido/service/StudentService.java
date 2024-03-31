package com.ra.crud2rapido.service;

import com.ra.crud2rapido.entity.Estudiante;
import com.ra.crud2rapido.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Estudiante> getStudents(){
        return studentRepository.findAll();
    }

    public Optional<Estudiante> getStudent(Long id){
        return  studentRepository.findById(id);
    }

    public Estudiante saveOrUpdate(Estudiante estudiante){
        studentRepository.save(estudiante);
        return estudiante;
    }

    public void delete(Long id){
        studentRepository.deleteById(id);
    }

}
