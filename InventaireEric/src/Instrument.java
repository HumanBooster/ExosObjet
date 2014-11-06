import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d57b87ec-de1b-4846-a3ff-75869b7df315")
public abstract class Instrument {
    @objid ("1087d2fe-e5d8-4db6-b58a-ddb0f8ddecb7")
    protected String numSerie;

    @objid ("ae607fb3-b0e3-4274-8f39-73066c7bd839")
    protected double prix;

    @objid ("7926fa2a-f6d9-4ce1-a87c-35114db7782e")
    protected PrefInstrument preferences;

    @objid ("cfb89fd5-48e2-433f-aa42-f6b1aa61ae9d")
    public String getNumSerie() {
        return numSerie;
    }

    @objid ("a9c3d10e-be33-4914-8fd6-6d585d51a373")
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    @objid ("b02f707e-0214-4ad1-8590-a609f2a23bf6")
    public double getPrix() {
        return prix;
    }

    @objid ("6b6677eb-f69d-4745-b1b5-ec1b51f4c08c")
    public void setPrix(double prix) {
        this.prix = prix;
    }

    @objid ("cb8f7a1c-d1fc-48e1-9fc1-847016412578")
    public void setPreferences(PrefInstrument preferences) {
        this.preferences = preferences;
    }

    @objid ("11953fa4-e82b-41af-832a-853ef6cf9971")
    public abstract PrefInstrument getPreferences();

    @objid ("fbaed1cc-6635-4137-b2c9-2d98a7b13af6")
    public abstract boolean correspond(PrefInstrument preferences);
    
    public String toString() {
    	return "Instrument de type "+this.getClass().getName()+" \n"
    			+"Prix : "+this.prix+" / numSerie : "+this.numSerie+"\n"
    			+this.getPreferences().toString();
    }

}
