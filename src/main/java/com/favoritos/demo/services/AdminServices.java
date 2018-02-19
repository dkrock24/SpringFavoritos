package com.favoritos.demo.services;

import org.springframework.data.repository.CrudRepository;

import com.favoritos.demo.entities.Admin;

public interface AdminServices extends CrudRepository<Admin, Integer>{

}
