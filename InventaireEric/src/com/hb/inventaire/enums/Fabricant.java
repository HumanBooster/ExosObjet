package com.hb.inventaire.enums;

public enum Fabricant {
    FENDER("Fender"),
    GIBSON("Gibson");
    
    String libelle;
    
    Fabricant(String libelle) {
    	this.libelle = libelle;
    }

    public String toString() {
        return this.libelle;
    }

}
