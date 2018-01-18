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
		List<Descripcion> d = (List<Descripcion>) descripcionServices.demo(disco);
		
		model.addAttribute("cursos", d);
		model.addAttribute("url", "byDisc");
		model.addAttribute("valor", "numeroDisco");	
		
		
		return "home/SearchByDisc";
	}
	
	@RequestMapping("/name")
	public String Name(Model model) {
		model.addAttribute("url", "name");
		return "home/Name";
	}
	
	@RequestMapping(value = "/byName", method = RequestMethod.POST)
	public String byName( Model model, @ModelAttribute("descripcion") Descripcion descripcion, BindingResult result) {
		
		String curso = descripcion.getNombreCurso();
		System.out.println('%'+curso+'%');
		List<Descripcion> d = (List<Descripcion>) descripcionServices.byName('%'+curso+'%');
		
		model.addAttribute("cursos", d);
		model.addAttribute("url", "byName");
		model.addAttribute("valor", "nombreCurso");	
		
		return "home/SearchByDisc";
	}
	
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String Detail(Model model, @PathVariable int id) {
		
		Descripcion d = descripcionServices.findOne(id);
		
		model.addAttribute("curso", d);
			
		return "home/Details";		
	}
	
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String update(Model model, @PathVariable int id) {
		
		Descripcion d = descripcionServices.findOne(id);
		
		model.addAttribute("curso", d);
			
		return "home/Update";		
	}
	
	@RequestMapping(value = "/saveUpdate", method = RequestMethod.POST)
	public String saveUpdate(Model model, @ModelAttribute("descripcion")Descripcion descripcion, BindingResult result) {
		
		Descripcion d = descripcionServices.findOne(descripcion.getIdDescripcion());
		
		d.setNombreCurso(descripcion.getNombreCurso());		
		
		descripcionServices.save(d);
		
		model.addAttribute("curso", d);
			
		return "home/Update";		
	}
	
	
	
	
	
	
	
}
