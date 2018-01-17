package com.favoritos.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.favoritos.demo.entities.Descripcion;
import com.favoritos.demo.services.DescripcionServices;

@Controller
public class IndexController {
	
	@Autowired
	DescripcionServices descripcionServices;
	

	@RequestMapping("/index")
	public String  All(Model model) {
		
		List<Descripcion> descripcion = (List) descripcionServices.findAll();
		
		double active = (int) descripcionServices.findActives();
		double inactive = (int) descripcionServices.findInactives();
		double process = (int) descripcionServices.findProcess();	
		double total = (int) descripcionServices.count();
		
		model.addAttribute(descripcion);
		model.addAttribute("active", active );
		model.addAttribute("active2", ( active / total )*100 );
		
		model.addAttribute("inactive",inactive);
		model.addAttribute("inactive2", ( inactive / total )*100 );
		
		model.addAttribute("process",process);
		model.addAttribute("process2", ( process / total )*100 );
		
		model.addAttribute("total",total);

		return "/home/index";
	}
	
	@RequestMapping("/disc")
	public String Disc() {
		
		return "home/Disc";
	}
	
	@RequestMapping(value = "/byDisc", method = RequestMethod.POST)
	public String byDisc( Model model, @ModelAttribute("descripcion") Descripcion descripcion, BindingResult result) {
		int disco = descripcion.getNumeroDisco();
		List<Descripcion> d = (List) descripcionServices.demo(disco);
		
		model.addAttribute("cursos", d);
		
		return "home/SearchByDisc";
	}
	
	
	
}
