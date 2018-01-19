package com.favoritos.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.favoritos.demo.entities.Disco;
import com.favoritos.demo.entities.Formador;
import com.favoritos.demo.entities.Genero;
import com.favoritos.demo.services.DiscoServices;
import com.favoritos.demo.services.FormadorServices;
import com.favoritos.demo.services.GeneroServices;

@Controller
public class SettingController {
	
	@Autowired
	DiscoServices discoServices;	
	
	@Autowired
	FormadorServices formadorServices;
	
	@Autowired
	GeneroServices generoServices;

	@RequestMapping(value="/setting")
	public String setting(Model model) {
		
		long disco = discoServices.count();
		long formador = formadorServices.count();
		List<Disco> DiscList = (List<Disco>) discoServices.findAll();
		List<Formador> FormadorList = (List<Formador>) formadorServices.findAll();
		List<Genero> GeneroList = (List<Genero>) generoServices.findAll();
		
		model.addAttribute("totoalDisco", disco);
		model.addAttribute("totoalFormador", formador);
		model.addAttribute("listaDisco", DiscList);
		model.addAttribute("listaFormador", FormadorList);
		model.addAttribute("listaGenero", GeneroList);
		
		return "setting/Index";
	}
}
