package com.favoritos.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lenguajesdeprogramacion database table.
 * 
 */
@Entity
@NamedQuery(name="Lenguajesdeprogramacion.findAll", query="SELECT l FROM Lenguajesdeprogramacion l")
public class Lenguajesdeprogramacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idLenguaje;

	private String nombre;

	public Lenguajesdeprogramacion() {
	}

	public int getIdLenguaje() {
		return this.idLenguaje;
	}

	public void setIdLenguaje(int idLenguaje) {
		this.idLenguaje = idLenguaje;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}