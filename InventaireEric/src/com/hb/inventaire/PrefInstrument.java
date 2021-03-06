package com.hb.inventaire;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.hb.inventaire.enums.Propriete;

public class PrefInstrument {
	
	Map<Propriete,Object> proprietes;
    
    public PrefInstrument(Map<Propriete,Object> proprietes) {
    	if (proprietes==null) {
    		this.proprietes = new HashMap<Propriete,Object>();
    	} else {
    		this.proprietes = new HashMap<Propriete,Object>(proprietes);
    	}
    }

    public Object getPropriete(Propriete prop) {
        return proprietes.get(prop);
    }

    public Map<Propriete,Object> getProprietes() {
    	return proprietes;
    }

    public boolean correspond(PrefInstrument prefInstrument) {
        if (this == prefInstrument) {
            return true;
        }
        
        for (Iterator<Propriete> i = prefInstrument.getProprietes().keySet().iterator();
        		i.hasNext(); ) {
        	Propriete prop = i.next();
        	
        	// test nullpointer
        	
        	if (!proprietes.get(prop).equals(prefInstrument.getPropriete(prop)))
        		return false;
        	
        } 
        return true;

    }
    
    public String toString() {
    	String string = "";
    	
        for (Iterator<Propriete> i = this.getProprietes().keySet().iterator();
        		i.hasNext(); ) {
        	Propriete prop = i.next();
        	
        	string += prop+": "+proprietes.get(prop)+"\n";
        } 
    	return string;
    }

}
