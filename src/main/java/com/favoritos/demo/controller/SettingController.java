package com.favoritos.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.favoritos.demo.entities.Disco;
import com.favoritos.demo.services.DiscoServices;
import com.favoritos.demo.services.FormadorServices;

@Controller
public class SettingController {
	
	@Autowired
	DiscoServices discoServices;	
	
	@Autowired
	FormadorServices formadorServices;

	@RequestMapping(value="/setting")
	public String setting(Model model) {
		
		long disco = discoServices.count();
		long formador = formadorServices.count();
		
		model.addAttribute("totoalDisco", disco);
		model.addAttribute("totoalFormador", formador);
		
		return "setting/Index";
	}
}
