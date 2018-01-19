package com.favoritos.demo.services;

import org.springframework.data.repository.CrudRepository;

import com.favoritos.demo.entities.Genero;

public interface GeneroServices extends CrudRepository<Genero, Integer> {

}
