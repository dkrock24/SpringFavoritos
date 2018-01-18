package com.favoritos.demo.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the genero database table.
 * 
 */
@Entity
@NamedQuery(name="Genero.findAll", query="SELECT g FROM Genero g")
public class Genero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String descripcion;

	private String genero;

	//bi-directional many-to-one association to Descripcion
	@OneToMany(mappedBy="generoBean")
	private List<Descripcion> descripcions;

	public Genero() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Descripcion> getDescripcions() {
		return this.descripcions;
	}

	public void setDescripcions(List<Descripcion> descripcions) {
		this.descripcions = descripcions;
	}

	public Descripcion addDescripcion(Descripcion descripcion) {
		getDescripcions().add(descripcion);
		descripcion.setGeneroBean(this);

		return descripcion;
	}

	public Descripcion removeDescripcion(Descripcion descripcion) {
		getDescripcions().remove(descripcion);
		descripcion.setGeneroBean(null);

		return descripcion;
	}

}