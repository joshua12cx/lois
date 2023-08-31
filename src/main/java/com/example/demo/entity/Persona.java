package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="PERSONA")

public class Persona {
	@Id
	@Column(name="ID_PERSONA")
	private Long id;
	
	@Column(name="NOMBRES")
	private String nombres;
	
	@Column(name="APELLIDOS")
	private String apellidos;
	
	@Column(name="CORREO")
	private String correo;
	
	@OneToOne
	private Documento documento;
	
}
