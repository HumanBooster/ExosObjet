import java.util.List;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2f12e654-ff33-48cf-b9f3-b2b6bf1e42ed")
public class Mandoline extends Instrument {
    @objid ("a0e67507-1f9f-4858-9918-3be86168947b")
    private PrefMandoline preferences;

    @objid ("50a2eb03-efb5-4eed-8529-d91fd26fc315")
    public Mandoline(String numSerie, double prix, PrefMandoline prefMandoline) {
        this.numSerie = numSerie;
        this.prix = prix;
        this.preferences = prefMandoline;
    }
    
    @Override
    public boolean correspond(PrefInstrument preferences) {
    	System.out.println("On test Mandoline.correspond()");
    	return this.getPreferences().equals(preferences);
    }
    
    @Override
    public PrefMandoline getPreferences() {
    	return this.preferences;
    }
    
    

}
