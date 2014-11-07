package com.hb.inventaire;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.hb.inventaire.enums.Bois;
import com.hb.inventaire.enums.Fabricant;
import com.hb.inventaire.enums.Propriete;
import com.hb.inventaire.enums.Style;
import com.hb.inventaire.enums.Type;
import com.hb.inventaire.enums.TypeInstrument;

public class TrouverInstrumentTest {
    public static void main(String[] args) {
        // Dresse l’inventaire des Guitares d’Éric
        Inventaire inventaire = new Inventaire();
        
        initialiserInventaire(inventaire);
        
        Map<Propriete,Object> proprietes = new HashMap<Propriete,Object>();
        proprietes.put(Propriete.FABRICANT, Fabricant.FENDER);
        proprietes.put(Propriete.BOISFOND, Bois.AULNE);
        proprietes.put(Propriete.INSTRUMENT, TypeInstrument.BANJO);
        
        PrefInstrument prefIrene = new PrefInstrument(proprietes);
        
        List<Instrument> resultats = inventaire.chercher(prefIrene);
        
        if (!resultats.isEmpty()) {
    		for (Iterator<Instrument> i = resultats.iterator(); i.hasNext();) {
    			Instrument instrument = i.next();
    			
    			System.out.println("On examine : "+instrument.toString());
            
    			System.out.println("Irène,peut-être aimerez-vous cette "+instrument.getClass().getName()+" : " +
    					"\n Elle est à vous pour seulement " +
                    instrument.getPrix() + " € !");
    		}
        } else {
            System.out.println("Désolé, Irène, nous n’avons rien pour vous.");
        }
    }

    private static void initialiserInventaire(Inventaire inventaire) {
        // Ajoute des guitares dans l’inventaire...
    	
    	Map<Propriete, Object> proprietes;
    	
    	proprietes = new HashMap<Propriete, Object>();
    	proprietes.put(Propriete.INSTRUMENT, TypeInstrument.GUITARE);
    	proprietes.put(Propriete.FABRICANT, Fabricant.GIBSON);
    	proprietes.put(Propriete.MODELE, "CJ");
    	proprietes.put(Propriete.TYPE, Type.ACOUSTIQUE);
    	proprietes.put(Propriete.NBCORDES, 6);
    	proprietes.put(Propriete.BOISTABLE, Bois.CHENE);
    	proprietes.put(Propriete.BOISFOND, Bois.OLIVIER);
    	
    	inventaire.addInstrument("A", 3999.95,
    			new PrefInstrument(proprietes));
    	
    	proprietes = new HashMap<Propriete, Object>();
    	proprietes.put(Propriete.INSTRUMENT, TypeInstrument.MANDOLINE);
    	proprietes.put(Propriete.FABRICANT, Fabricant.FENDER);
    	proprietes.put(Propriete.MODELE, "CJSUPERF");
    	proprietes.put(Propriete.TYPE, Type.ACOUSTIQUE);
    	proprietes.put(Propriete.STYLE, Style.F);
    	proprietes.put(Propriete.BOISTABLE, Bois.CHENE);
    	proprietes.put(Propriete.BOISFOND, Bois.OLIVIER);
    	
    	inventaire.addInstrument("B", 3399.90,
    			new PrefInstrument(proprietes));
    	
    	proprietes = new HashMap<Propriete, Object>();
    	proprietes.put(Propriete.INSTRUMENT, TypeInstrument.MANDOLINE);
    	proprietes.put(Propriete.FABRICANT, Fabricant.FENDER);
    	proprietes.put(Propriete.MODELE, "CJSUPERF");
    	proprietes.put(Propriete.TYPE, Type.ACOUSTIQUE);
    	proprietes.put(Propriete.STYLE, Style.F);
    	proprietes.put(Propriete.BOISTABLE, Bois.CHENE);
    	proprietes.put(Propriete.BOISFOND, Bois.AULNE);
    	
    	inventaire.addInstrument("C", 2399.90,
    			new PrefInstrument(proprietes));

    	proprietes = new HashMap<Propriete, Object>();
    	proprietes.put(Propriete.INSTRUMENT, TypeInstrument.BANJO);
    	proprietes.put(Propriete.FABRICANT, Fabricant.FENDER);
    	proprietes.put(Propriete.MODELE, "BANJOLOL");
    	proprietes.put(Propriete.TYPE, Type.ACOUSTIQUE);
    	proprietes.put(Propriete.NBCORDES, 5);
    	proprietes.put(Propriete.BOISTABLE, Bois.CHENE);
    	proprietes.put(Propriete.BOISFOND, Bois.AULNE);
    	
    	inventaire.addInstrument("D", 1399.90,
    			new PrefInstrument(proprietes));
    	
    }

}
