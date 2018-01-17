package com.favoritos.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the descripcion database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Descripcion.findAll", query="SELECT d FROM Descripcion d"),
	@NamedQuery(name="Descripcion.findActives", query="SELECT count(d) FROM Descripcion d where d.estado=1"),
	@NamedQuery(name="Descripcion.findInactives", query="SELECT count(d) FROM Descripcion d where d.estado=0"),
	@NamedQuery(name="Descripcion.findProcess", query="SELECT count(d) FROM Descripcion d where d.estado=3")
})

public class Descripcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_descripcion")
	private int idDescripcion;

	private String descripcion;

	private int estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_publicacion")
	private Date fechaPublicacion;

	private String formador;

	@Column(name="foto_curso")
	private String fotoCurso;

	private String genero;

	private String idioma;

	@Column(name="nombre_curso")
	private String nombreCurso;

	@Column(name="numero_disco")
	private int numeroDisco;

	@Lob
	private String peso;

	public Descripcion() {
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

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Date getFechaPublicacion() {
		return this.fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
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

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
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