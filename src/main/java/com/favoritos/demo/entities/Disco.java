package com.favoritos.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the disco database table.
 * 
 */
@Entity
@NamedQuery(name="Disco.findAll", query="SELECT d FROM Disco d")
public class Disco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_disco")
	private int idDisco;

	@Column(name="numero_disco")
	private int numeroDisco;

	public Disco() {
	}

	public int getIdDisco() {
		return this.idDisco;
	}

	public void setIdDisco(int idDisco) {
		this.idDisco = idDisco;
	}

	public int getNumeroDisco() {
		return this.numeroDisco;
	}

	public void setNumeroDisco(int numeroDisco) {
		this.numeroDisco = numeroDisco;
	}

}