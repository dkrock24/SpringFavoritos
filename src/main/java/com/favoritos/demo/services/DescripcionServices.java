package com.favoritos.demo.services;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.favoritos.demo.entities.Descripcion;

public interface DescripcionServices extends CrudRepository<Descripcion, Integer>{
	
	int findActives();
	int findInactives();
	int findProcess();	
	List<Descripcion> demo(@Param("disco") int id);
	
}
