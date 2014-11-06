import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8dd9ea9d-cafc-4c75-8f56-55e4b542593d")
public class Guitare extends Instrument {
    @objid ("06b195b3-7cf8-4a79-9f59-9781780fb321")
    private PrefGuitare preferences;

    @objid ("65558a08-a826-4682-b17c-fb5d29416abf")
    public Guitare(String numSerie, double prix, PrefGuitare prefGuitare) {
        this.numSerie = numSerie;
        this.prix = prix;
        this.preferences = prefGuitare;
    }
    
    @Override
    public boolean correspond(PrefInstrument preferences) {
    	System.out.println("On test Guitare.correspond()");
    	return this.preferences.equals(preferences);
    }
    
    @Override
    public PrefGuitare getPreferences() {
    	return this.preferences;
    }

}
