package com.ra.crud2rapido.repository;

import com.ra.crud2rapido.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Estudiante, Long> {

}
