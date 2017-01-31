package com.lance.jasper.model;

public class Suit {

	private String material;
	private String color;
	private Boot boots;
	private Glove gloves;
	private Cape cape;
	private String logo;
	private boolean primary;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boot getBoots() {
		return boots;
	}

	public void setBoots(Boot boots) {
		this.boots = boots;
	}

	public Glove getGloves() {
		return gloves;
	}

	public void setGloves(Glove gloves) {
		this.gloves = gloves;
	}

	public Cape getCape() {
		return cape;
	}

	public void setCape(Cape cape) {
		this.cape = cape;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public boolean isPrimary() {
		return primary;
	}

	public void setPrimary(boolean primary) {
		this.primary = primary;
	}

}
