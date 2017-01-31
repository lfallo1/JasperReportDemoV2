package com.lance.jasper.model;

import java.util.List;

import com.lance.jasper.enums.Gender;

public class Superhero {

	private Integer id;
	private String alias;
	private String fullName;
	private Gender gender;
	private Double height;
	private Double weight;
	private Double powerLevel;
	private List<Suit> suits;
	private String description;

	public Superhero(Integer id, String alias, String fullName, Gender gender, Double height, Double weight,
			Double powerLevel, List<Suit> suits, String description) {
		this.id = id;
		this.alias = alias;
		this.fullName = fullName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.powerLevel = powerLevel;
		this.suits = suits;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Suit> getSuits() {
		return suits;
	}

	public void setSuits(List<Suit> suits) {
		this.suits = suits;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(Double powerLevel) {
		this.powerLevel = powerLevel;
	}

}
