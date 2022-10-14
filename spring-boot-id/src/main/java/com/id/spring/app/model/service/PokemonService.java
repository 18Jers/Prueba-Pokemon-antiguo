package com.id.spring.app.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.id.spring.app.model.Pokemon;

//component o service
@Component
//para no problemas por futuras alteraciones
public class PokemonService implements IPokemonService{

	@Override
	public List<Pokemon> quienEsEsePokemon2022() {
		
		//instancia
		Pokemon pokemoncito = new Pokemon();
		Pokemon pokemoncito2 = new Pokemon();
		Pokemon pokemoncito3 = new Pokemon();
		
		List<Pokemon> listaPokemones = new ArrayList<>();
		
		//llamas pokemon
		pokemoncito.setNombre("Pikachu 2022");
		pokemoncito.setTipo("Eléctrico");
		pokemoncito.setHabilidad("Bola bolteo");
		pokemoncito.setNivelPoder("7000");
		
		pokemoncito2.setNombre("Raichu 2023");
		pokemoncito2.setTipo("Eléctrico");
		pokemoncito2.setHabilidad("Red electrica");
		pokemoncito2.setNivelPoder("1000");
		
		pokemoncito3.setNombre("Piplop");
		pokemoncito3.setTipo("Agua");
		pokemoncito3.setHabilidad("Remolino de agua");
		pokemoncito3.setNivelPoder("5456");
		
		listaPokemones.add(pokemoncito);
		listaPokemones.add(pokemoncito2);
		listaPokemones.add(pokemoncito3);
		
		//List<Pokemon> listaPokemones = Arrays.asList(pokemoncito,pokemoncito2);
		
		//recuperas pokemon
		return listaPokemones;
	}

}
