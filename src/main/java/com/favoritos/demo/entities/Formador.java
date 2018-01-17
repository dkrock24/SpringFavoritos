package com.favoritos.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the formador database table.
 * 
 */
@Entity
@NamedQuery(name="Formador.findAll", query="SELECT f FROM Formador f")
public class Formador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_formador")
	private int idFormador;

	private String foto;

	@Column(name="nombre_formador")
	private String nombreFormador;

	public Formador() {
	}

	public int getIdFormador() {
		return this.idFormador;
	}

	public void setIdFormador(int idFormador) {
		this.idFormador = idFormador;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getNombreFormador() {
		return this.nombreFormador;
	}

	public void setNombreFormador(String nombreFormador) {
		this.nombreFormador = nombreFormador;
	}

}