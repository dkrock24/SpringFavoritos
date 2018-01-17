package com.favoritos.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.favoritos.demo.entities.Descripcion;
import com.favoritos.demo.services.DescripcionServices;

@Controller
public class IndexController {
	
	@Autowired
	DescripcionServices descripcionServices;
	

	@RequestMapping("/index")
	public String  All(Model model) {
		
		List<Descripcion> descripcion = (List) descripcionServices.findAll();
		
		int active = (int) descripcionServices.findActives();
		int inactive = (int) descripcionServices.findInactives();
		int process = (int) descripcionServices.findProcess();	
		
		
		model.addAttribute(descripcion);
		model.addAttribute("active",active);
		model.addAttribute("inactive",inactive);
		model.addAttribute("process",process);

		return "/home/index";
	}
}
