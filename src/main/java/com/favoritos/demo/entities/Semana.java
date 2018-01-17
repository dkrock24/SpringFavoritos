package com.favoritos.demo.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the semana database table.
 * 
 */
@Entity
@NamedQuery(name="Semana.findAll", query="SELECT s FROM Semana s")
public class Semana implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idSemana;

	private int diasSemana;

	private int numerosemana;

	private int salario;

	public Semana() {
	}

	public int getIdSemana() {
		return this.idSemana;
	}

	public void setIdSemana(int idSemana) {
		this.idSemana = idSemana;
	}

	public int getDiasSemana() {
		return this.diasSemana;
	}

	public void setDiasSemana(int diasSemana) {
		this.diasSemana = diasSemana;
	}

	public int getNumerosemana() {
		return this.numerosemana;
	}

	public void setNumerosemana(int numerosemana) {
		this.numerosemana = numerosemana;
	}

	public int getSalario() {
		return this.salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

}