package com.favoritos.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the otradescripcion database table.
 * 
 */
@Entity
@NamedQuery(name="Otradescripcion.findAll", query="SELECT o FROM Otradescripcion o")
public class Otradescripcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_descripcion")
	private int idDescripcion;

	private String descripcion;

	private int estudiado;

	private String formador;

	@Column(name="foto_curso")
	private String fotoCurso;

	@Column(name="nombre_curso")
	private String nombreCurso;

	@Column(name="numero_disco")
	private int numeroDisco;

	@Lob
	private String peso;

	public Otradescripcion() {
	}

	public int getIdDescripcion() {
		return this.idDescripcion;
	}

	public void setIdDescripcion(int idDescripcion) {
		this.idDescripcion = idDescripcion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstudiado() {
		return this.estudiado;
	}

	public void setEstudiado(int estudiado) {
		this.estudiado = estudiado;
	}

	public String getFormador() {
		return this.formador;
	}

	public void setFormador(String formador) {
		this.formador = formador;
	}

	public String getFotoCurso() {
		return this.fotoCurso;
	}

	public void setFotoCurso(String fotoCurso) {
		this.fotoCurso = fotoCurso;
	}

	public String getNombreCurso() {
		return this.nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getNumeroDisco() {
		return this.numeroDisco;
	}

	public void setNumeroDisco(int numeroDisco) {
		this.numeroDisco = numeroDisco;
	}

	public String getPeso() {
		return this.peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

}