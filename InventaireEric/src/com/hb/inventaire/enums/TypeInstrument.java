package com.hb.inventaire.enums;

public enum TypeInstrument {
	GUITARE("guitare"),
	MANDOLINE("mandoline"),
	BANJO("banjo"),
	VIOLON("violon"),
	HAUTBOIS("hautbois"),
	BATTERIE("batterie");
	
	String libelle;
	
	TypeInstrument(String libelle) {
		this.libelle = libelle;
	}

	public String toString() {
		return libelle;
	}
}
