package com.hb.inventaire.enums;

public enum Bois {
    AULNE("aulne"),
    FRENE("frêne"),
    OLIVIER("olivier"),
    CHENE("chêne"),
    PALISSANDRE("pallissandre"),
    CERISIER("cerisier");
    
    String libelle;
    
    Bois(String libelle) {
    	this.libelle = libelle;
    }

    public String toString() {
        return this.libelle;
    }

}
