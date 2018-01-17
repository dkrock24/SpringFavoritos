package com.favoritos.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the favoritos database table.
 * 
 */
@Entity
@Table(name="favoritos")
@NamedQuery(name="Favorito.findAll", query="SELECT f FROM Favorito f")
public class Favorito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_favoritos")
	private int idFavoritos;

	private String descripcion;

	@Column(name="nombre_web")
	private String nombreWeb;

	@Column(name="url_web")
	private String urlWeb;

	public Favorito() {
	}

	public int getIdFavoritos() {
		return this.idFavoritos;
	}

	public void setIdFavoritos(int idFavoritos) {
		this.idFavoritos = idFavoritos;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombreWeb() {
		return this.nombreWeb;
	}

	public void setNombreWeb(String nombreWeb) {
		this.nombreWeb = nombreWeb;
	}

	public String getUrlWeb() {
		return this.urlWeb;
	}

	public void setUrlWeb(String urlWeb) {
		this.urlWeb = urlWeb;
	}

}