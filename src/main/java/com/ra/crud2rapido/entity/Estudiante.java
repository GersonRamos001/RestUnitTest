package com.ra.crud2rapido.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tbl_student")
@AllArgsConstructor
@NoArgsConstructor
	public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;

	private String firstName;

	private String lastName;

	@Column(name = "email_address", unique = true, nullable = false)
	private String email;



}
