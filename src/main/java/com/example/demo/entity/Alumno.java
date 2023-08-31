package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ALUMNO")
public class Alumno {
	@Id
	@Column(name="ID_ALUMNO")
	private Long id;
	
	@Column(name="NOMBRES")
	private String nombres;
	
	@Column(name="APELLIDOS")
	private String apellidos;
	
	@Column(name="CORREO")
	private String correo;
	
	@ManyToOne
	@JoinColumn(name="escuela_id")
	private Escuela escuela;
}
