package com.id.spring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.id.spring.app.model.Pokemon;
import com.id.spring.app.model.service.IPokemonService;
import com.id.spring.app.model.service.PokemonService;

@Controller
@RequestMapping("/app")
public class HomeController {
	
	@Value("${titlePage.param}")
	private String titlePage;
	
	@Value("${hey.param}")
	private String hey;
	
	/**CLASICO JAVA
	//PokemonService pokemonService = new PokemonService();
	//Sobre escribir metodo
	//@Autowired
	//PokemonService pokemonService; //llamando al servicio (PokemonService)
	*/
	
	//Buenas practicas de JAVA
	@Autowired
	private IPokemonService IPService; //interface modificada
	
	
	//llamas en google con...
	@GetMapping("/home")
	public String Home(Model model) {
		
		
		
		//ATRIBUTOS
		//titulo 
		model.addAttribute("titlePage", titlePage);
		//h1 del html
		model.addAttribute("hey", hey);
		//p html - service
		model.addAttribute("ServicePokemon", IPService.quienEsEsePokemon2022());
			
		//retorna lista home
		return "home";
	}
//te lleva al IpokemonService
}
