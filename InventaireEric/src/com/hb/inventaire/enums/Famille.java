package com.hb.inventaire.enums;

public enum Famille {
	MODERNE("moderne"),
	BAROQUE("baroque"),
	TRADITIONNELLE("traditionnelle");

	String libelle;
	
	Famille(String libelle) {
		this.libelle = libelle;
	}
	
	public String toString() {
		return this.libelle;
	}

}
