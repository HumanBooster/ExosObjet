package com.hb.inventaire.enums;

public enum Type {
	ACOUSTIQUE("acoustique"),
	ELECTRIQUE("électrique"),
	ELECTROACOUSTIQUE("électro-acoustique");
	
	String libelle;

	Type(String libelle) {
		this.libelle = libelle;
	}
	
	public String toString() {
		return libelle;
	}

}
