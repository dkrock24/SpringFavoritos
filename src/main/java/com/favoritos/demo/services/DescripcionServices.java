package com.favoritos.demo.services;

import org.springframework.data.repository.CrudRepository;

import com.favoritos.demo.entities.Descripcion;

public interface DescripcionServices extends CrudRepository<Descripcion, Integer>{
	
	public int findActives();
	public int findInactives();
	public int findProcess();
	
}
