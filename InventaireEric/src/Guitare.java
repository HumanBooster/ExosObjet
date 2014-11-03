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
