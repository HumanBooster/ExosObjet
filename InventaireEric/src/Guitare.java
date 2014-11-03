import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8dd9ea9d-cafc-4c75-8f56-55e4b542593d")
public class Guitare {
    @objid ("1087d2fe-e5d8-4db6-b58a-ddb0f8ddecb7")
    private String numSerie;

    @objid ("ae607fb3-b0e3-4274-8f39-73066c7bd839")
    private double prix;
    
    private PrefGuitare preferences;

    @objid ("65558a08-a826-4682-b17c-fb5d29416abf")
    public Guitare(String numSerie, double prix, PrefGuitare prefGuitare) {
    	this.numSerie = numSerie;
        this.prix = prix;
        this.setPreferences(prefGuitare);
    }

    @objid ("cfb89fd5-48e2-433f-aa42-f6b1aa61ae9d")
    public String getNumSerie() {
        return numSerie;
    }

    @objid ("b02f707e-0214-4ad1-8590-a609f2a23bf6")
    public double getPrix() {
        return prix;
    }

    @objid ("6b6677eb-f69d-4745-b1b5-ec1b51f4c08c")
    public void setPrix(float nouveauPrix) {
        this.prix = nouveauPrix;
    }

    public boolean correspond(PrefGuitare prefGuitare) {
    
       if (preferences.equals(prefGuitare))
            return true;
    
        return false;
    }

	public PrefGuitare getPreferences() {
		return preferences;
	}

	public void setPreferences(PrefGuitare preferences) {
		this.preferences = preferences;
	}
}
