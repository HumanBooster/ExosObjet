package com.hb.inventaire;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hb.inventaire.enums.Propriete;


public class Inventaire {
    private List<Instrument> instruments;

    public Inventaire() {
    	instruments = new ArrayList<Instrument>();
    }

    public void addInstrument(String numSerie, double prix, PrefInstrument preferences) {
        instruments.add(InstrumentFactory.makeInstrument(numSerie, prix, preferences));
    }
    
    public void addInstrument(Instrument instrument) {
    	instruments.add(instrument);
    }

    public Instrument getInstrument(String numSerie) {
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
        	Instrument instrument = i.next();
        
            if (instrument.getNumSerie().equals(numSerie)) {
                return instrument;
            }
        
        }
        return null;
    }

    public List<Instrument> chercher(PrefInstrument preferences) {
    	System.out.println("On cherche un Instrument");
        List<Instrument> resultats = new ArrayList<Instrument>();
        
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
        	Instrument instrument = i.next();
        
            if (instrument.getPreferences().correspond(preferences)) {
            	System.out.println("Trouvé un(e) "+instrument.getPreferences().getPropriete(Propriete.INSTRUMENT));
            	resultats.add(instrument);
            }
                
        }
        return resultats;
    }
   
}
