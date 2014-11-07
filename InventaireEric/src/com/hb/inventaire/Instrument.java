package com.hb.inventaire;

public class Instrument {
    private String numSerie;
    private double prix;
    private PrefInstrument preferences;
    
    public Instrument(String numSerie, double prix, PrefInstrument pref) {
    	this.numSerie = numSerie;
    	this.prix = prix;
    	this.preferences = pref;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setPreferences(PrefInstrument preferences) {
        this.preferences = preferences;
    }

    public PrefInstrument getPreferences() {
    	return this.preferences;
    }
    
    public String toString() {
    	return "Instrument de type "+this.getClass().getName()+" \n"
    			+"Prix : "+this.prix+" / numSerie : "+this.numSerie+"\n"
    			+this.getPreferences().toString();
    }

}
