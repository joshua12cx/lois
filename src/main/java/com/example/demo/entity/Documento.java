package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="DOCUMENTO")

public class Documento {
	@Id
	@Column(name="ID_DOCUMENTO")
	private Long id;
	@Column(name="NUMERO")
	private int numero;
	

}
