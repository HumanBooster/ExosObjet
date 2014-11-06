import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("873f5c84-c214-4988-b181-667fda1e3907")
public class Inventaire {
    @objid ("5283c993-f632-4172-b552-79a70bbde490")
    private List<Instrument> instruments;

    @objid ("36abb9ad-f220-4336-a620-70306095e28f")
    public Inventaire() {
    	instruments = new ArrayList<Instrument>();
    }

    @objid ("820b0092-e6be-4d85-b6b3-735fd1d39cf1")
    public void addInstrument(String numSerie, double prix, PrefInstrument preferences) {
        
    	Instrument instrument = null;
    	if (preferences instanceof PrefGuitare) {
            instrument = new Guitare(numSerie, prix, (PrefGuitare) preferences);
    	} else if (preferences instanceof PrefMandoline) {
    		instrument = new Mandoline(numSerie, prix, (PrefMandoline) preferences);
    	}
        instruments.add(instrument);
    }

    @objid ("a3782776-fc9b-47ad-9176-3792f0d25b93")
    public Instrument getInstrument(String numSerie) {
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
        	Instrument instrument = i.next();
        
            if (instrument.getNumSerie().equals(numSerie)) {
                return instrument;
            }
        
        }
        return null;
    }

    @objid ("5799b264-50ce-4ee9-8d0e-5e83224d56d0")
    public List<Instrument> chercher(PrefGuitare preferences) {
    	System.out.println("On cherche une Guitare");
        List<Instrument> resultats = new ArrayList<Instrument>();
        
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
        	Instrument instrument = i.next();
        
            if (instrument.getPreferences().equals(preferences)) {
            	System.out.println("Trouvé une "+instrument.getClass().getName());
            	resultats.add(instrument) ;
            }
                
        }
        return resultats;
    }
    
    public List<Instrument> chercher(PrefMandoline preferences) {
    	System.out.println("On cherche une Mandoline");
        List<Instrument> resultats = new ArrayList<Instrument>();
        
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext();) {
        	Instrument instrument = i.next();
        
            if (instrument.getPreferences().equals(preferences)) {
            	System.out.println("Trouvé une "+instrument.getClass().getName());
                resultats.add(instrument) ;
            }
        }
        return resultats;
    }
}
