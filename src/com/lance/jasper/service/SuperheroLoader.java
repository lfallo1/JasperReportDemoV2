package com.lance.jasper.service;

import java.util.ArrayList;
import java.util.List;

import com.lance.jasper.model.Superhero;

public class SuperheroLoader {

	public static List<Superhero> load(){
		SuperheroFactory factory = new SuperheroFactory();
		List<Superhero> superheroes = new ArrayList<>();
		superheroes.add(factory.missJustice());
		superheroes.add(factory.wonderGal());
		return superheroes;
	}
	
}
