package com.example.demo.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="ESCUELA")
public class Escuela {
	@Id
	@Column(name="ID_ESCUELA")
	private Long id;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@OneToMany(mappedBy="escuela")
	private Set<Alumno> alumnos;

}
