package com.hb.inventaire.enums;

public enum Propriete {
	// general
	FABRICANT("fabricant"),
	MODELE("modele"),
	INSTRUMENT("instrument"),
	// cordes
	TYPE("type"),
	BOISTABLE("bois de la table"),
	BOISFOND("bois du fond"),
	BOISARCHET("bois de l'archet"),

	NBCORDES("nombre de cordes"),
	STYLE("style"),
	// vents
	BOISTUBE("bois du tube"),
	FAMILLE("famille");	
	
	String libelle;
	
	Propriete(String libelle) {
		this.libelle = libelle;
	}
	
	public String toString() {
		return this.libelle;
	}
}
