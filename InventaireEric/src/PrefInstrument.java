import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3bac70a8-a1d0-4588-aa56-ce6a0f4a27d1")
public abstract class PrefInstrument {
    @objid ("0a3b98ec-d24f-4def-a630-a8456ee53518")
    protected String modele;

    @objid ("fcd5eff8-78ee-485a-b42b-90f780b93c09")
    protected Fabricant fabricant;

    @objid ("8391edd9-e5bc-4886-b0eb-19970feee0ba")
    protected Bois boisFond;

    @objid ("4d873648-5846-43fd-a18f-02ae044b8f62")
    protected Bois boisTable;

    @objid ("baa7ca85-ff3b-4858-8ddf-ebf0d8eb9add")
    protected Type type;
    
    public PrefInstrument(Fabricant fabricant, String modele, Type type, Bois boisFond, Bois boisTable) {
        this.fabricant = fabricant;
        this.modele = modele;
        this.type = type;
        this.boisFond = boisFond;
        this.boisTable = boisTable;
    }

    @objid ("a80c4e2c-3006-4e09-8213-1993f1f2a0b2")
    public Fabricant getFabricant() {
        return fabricant;
    }

    @objid ("812c4fb7-ee07-46c4-9294-f8431d15dba9")
    public void setBoisTable(Bois boisTable) {
        this.boisTable = boisTable;
    }

    @objid ("89fe3d69-34d7-4fa8-8dcc-f687afa1f817")
    public void setFabricant(Fabricant fabricant) {
        this.fabricant = fabricant;
    }

    @objid ("bcda1f4b-954a-4fa9-86f0-d804c7b599fc")
    public String getModele() {
        return modele;
    }

    @objid ("a2e19a82-8a2e-4088-8113-82aae0e55356")
    public void setModele(String modele) {
        this.modele = modele;
    }

    @objid ("3544e5b1-e3f5-43ca-94ec-9350a4bd56e3")
    public Bois getBoisFond() {
        return boisFond;
    }

    @objid ("8862d72d-2822-47e2-843d-6dbe3a47fde2")
    public void setBoisFond(Bois boisFond) {
        this.boisFond = boisFond;
    }

    @objid ("9bd54ae8-c1fc-4110-b5a5-22b3194f6548")
    public Bois getBoisTable() {
        return boisTable;
    }

    @objid ("2de9e873-1eec-4e05-b544-a532cbef172b")
    public Type getType() {
        return type;
    }

    @objid ("c77cbecf-3aa2-4972-95de-f9244f333f80")
    public void setType(Type type) {
        this.type = type;
    }

    @objid ("74502b45-948d-4dd5-ae32-032695d9592c")
    public boolean equals(PrefInstrument prefInstrument) {
        if (this == prefInstrument) {
            return true;
        }
        
        if ((modele != null) && (!modele.equals(""))
                && (!modele.equalsIgnoreCase(prefInstrument.getModele())))
            return false;
        
        if (!type.equals(prefInstrument.getType()))
            return false;
        
        if (!boisFond.equals(prefInstrument.getBoisFond()))
            return false;
        
        if (!boisTable.equals(prefInstrument.getBoisTable()))
            return false;
        
        return true;
    }
    
    public String toString() {
    	return getClass().getName();
    }

}
