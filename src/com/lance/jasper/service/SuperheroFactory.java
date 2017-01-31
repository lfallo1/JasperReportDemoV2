package com.lance.jasper.service;

import java.util.ArrayList;
import java.util.List;

import com.lance.jasper.enums.Gender;
import com.lance.jasper.enums.HeelStyle;
import com.lance.jasper.enums.Length;
import com.lance.jasper.model.Boot;
import com.lance.jasper.model.Cape;
import com.lance.jasper.model.Glove;
import com.lance.jasper.model.Suit;
import com.lance.jasper.model.Superhero;

public class SuperheroFactory {

	public Superhero wonderGal(){
		Boot boots = new Boot();
		boots.setHeelStyle(HeelStyle.MEDIUM);
		boots.setHeight(Length.LONG);
		boots.setMaterial("leather");
		boots.setColor("red");
		
		Glove gloves = new Glove();
		gloves.setColor("red");
		gloves.setLength(Length.LONG);
		gloves.setMaterial("silk");
		
		Cape cape = new Cape();
		cape.setColor("royal blue");
		cape.setLength(Length.SHORT);
		cape.setMaterial("satin");
		
		Suit suit = new Suit();
		suit.setBoots(boots);
		suit.setGloves(gloves);
		suit.setCape(cape);
		suit.setColor("metallic blue");
		suit.setLogo("american flag");
		suit.setMaterial("metallic spandex");
		suit.setPrimary(true);
		
		List<Suit> suits = new ArrayList<>();
		suits.add(suit);
		return new Superhero(1, "Wonder Gal", "Kara Croft", Gender.FEMALE, 63.0, 134.0, 14076.0, suits, "One tough superheroine.  For years, she has bravely been a spandex-clad defender of justice.");
	}
	
	public Superhero missJustice(){
		Boot boots = new Boot();
		boots.setHeelStyle(HeelStyle.FLAT);
		boots.setHeight(Length.MEDIUM);
		boots.setMaterial("leather");
		boots.setColor("royal blue");
		
		Glove gloves = new Glove();
		gloves.setColor("royal blue");
		gloves.setLength(Length.LONG);
		gloves.setMaterial("leather");
		
		Cape cape = new Cape();
		cape.setColor("royal blue");
		cape.setLength(Length.LONG);
		cape.setMaterial("satin");
		
		Suit suit = new Suit();
		suit.setBoots(boots);
		suit.setGloves(gloves);
		suit.setCape(cape);
		suit.setColor("metallic silver");
		suit.setLogo("star");
		suit.setMaterial("metallic spandex");
		suit.setPrimary(true);
		
		Suit suit2 = new Suit();
		suit2.setBoots(boots);
		suit2.setGloves(gloves);
		suit2.setCape(cape);
		suit2.setColor("metallic gold");
		suit2.setLogo("star");
		suit2.setMaterial("metallic silk");
		suit.setPrimary(true);
		
		List<Suit> suits = new ArrayList<>();
		suits.add(suit);
		suits.add(suit2);
		return new Superhero(1, "Miss Justice", "Lara Fox", Gender.FEMALE, 62.0, 120.0, 25000.0, suits, "Considered the champion of justice, she is the proud, almighty defender of all.");
	}
	
}
