package com.favoritos.demo.rest;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.favoritos.demo.entities.Admin;
import com.favoritos.demo.entities.Descripcion;
import com.favoritos.demo.entities.Disco;
import com.favoritos.demo.entities.Genero;
import com.favoritos.demo.services.AdminServices;
import com.favoritos.demo.services.DescripcionServices;
import com.favoritos.demo.services.DiscoServices;
import com.favoritos.demo.services.GeneroServices;

@RestController
@RequestMapping("/cursos")
public class CursoResource {

	@Autowired
	AdminServices admin;
	
	@Autowired
	DiscoServices disco;

	@RequestMapping(value = "/web/{disco}", method = RequestMethod.GET, produces = {
			"application/json; charset=utf-8" })
	public List<Admin> getCursos(@PathVariable int disco) {

		List<Admin> d = (List<Admin>) admin.findAll();

		// return new List<Descripcion>(d, HttpStatus.OK);
		return d;
	}

	@RequestMapping(value = "/getString", method = RequestMethod.GET)
	public ResponseEntity<List<Disco>> getWithRequestParam() throws IOException {

		List<Disco> d = (List<Disco>) disco.findAll();

		return new ResponseEntity<List<Disco>>(d, HttpStatus.OK);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<List<Admin>> listAllUsers() {
        List<Admin> users = (List<Admin>) admin.findAll();
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Admin>>(users, HttpStatus.OK);
    }
}
