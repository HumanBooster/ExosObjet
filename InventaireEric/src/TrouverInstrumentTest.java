import java.util.Iterator;
import java.util.List;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5670d192-883f-4459-ac39-05784e485124")
public class TrouverInstrumentTest {
    @objid ("49e190fb-312a-4b6d-b34f-5913757d83da")
    public static void main(String[] args) {
        // Dresse l’inventaire des Guitares d’Éric
        Inventaire inventaire = new Inventaire();
        
        initialiserInventaire(inventaire);
        
        PrefGuitare prefIrene = new PrefGuitare(Fabricant.FENDER,
                "Stratocaster", Type.ELECTRIQUE, Bois.AULNE, Bois.AULNE, 6);
        
        List<Instrument> resultats = inventaire.chercher(prefIrene);
        
        if (resultats != null) {
    		for (Iterator<Instrument> i = resultats.iterator(); i.hasNext();) {
    			Instrument instrument = i.next();
    			
    			System.out.println("On examine : "+instrument.toString());
            
    			System.out.println("Irène,peut-être aimerez-vous cette "+instrument.getClass().getName()+" : " +
    					instrument.getPreferences().getBoisFond() + " pour le corps,\n " +
    					instrument.getPreferences().getBoisTable()
                    + " pour la table.\n Elle est à vous pour seulement " +
                    instrument.getPrix() + " € !");
    		}
        } else {
            System.out.println("Désolé, Irène, nous n’avons rien pour vous.");
        }
    }

    @objid ("e679b768-9d00-4f1e-9b19-a5736b70cdb5")
    private static void initialiserInventaire(Inventaire inventaire) {
        // Ajoute des guitares dans l’inventaire...
    	inventaire.addInstrument("V95693", 1499.90, new PrefGuitare(Fabricant.FENDER, "Stratocaster", Type.ELECTRIQUE, Bois.AULNE, Bois.AULNE, 6));
    	inventaire.addInstrument("V95683", 1399.90, new PrefMandoline(Fabricant.FENDER, "Stratocaster", Type.ELECTRIQUE, Bois.AULNE, Bois.AULNE, Style.A));
    }

}
