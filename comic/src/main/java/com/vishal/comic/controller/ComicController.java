package com.vishal.comic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vishal.comic.entity.Power;
import com.vishal.comic.entity.SuperHero;
import com.vishal.comic.entity.Universe;
import com.vishal.comic.service.PowerService;
import com.vishal.comic.service.SuperHeroService;
import com.vishal.comic.service.UniverseService;

@Controller
public class ComicController {

	
	@Autowired
	UniverseService uinservice;
	@Autowired
	PowerService powservice;
	@Autowired
	SuperHeroService heroservice;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/adduniverse")
	public String addUniverse() {
		return "universe";
	}
	@RequestMapping("/insertuniverse")
	public String insertuniverse( Universe universe) {
		uinservice.adduniverse(universe);
		return "index";
	}
	@RequestMapping("/addsuperhero")
	public String addSuperhero(Model model) {
		List<Universe>universelist=uinservice.getuniverselist();
		model.addAttribute("universe",universelist);
		return "addsuperhero";
	}
	@RequestMapping("/assignsuperhero")
	public String assign(@RequestParam String universeName, SuperHero superhero) {
		heroservice.assign(universeName,superhero);
		return "index";
	}
	@RequestMapping("/addpower")
	public String addpower(Model model) {
		List<SuperHero>superherolist=heroservice.getherolist();
		model.addAttribute("superheros", superherolist);
		return "power";
	}
	@RequestMapping("/assignpower")
	public String assignpower(@RequestParam String superHeroName,Power power) {
		powservice.assignpower(superHeroName,power);
		return "index";
	}
	
	
	 @ExceptionHandler(value=RuntimeException.class)
	   public String RuntimeException()
	   {
		   return "error";
	   }
	
}

