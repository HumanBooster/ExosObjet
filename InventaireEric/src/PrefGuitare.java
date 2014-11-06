import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2dab4d9f-21d6-4dd1-b5ed-26b0dec15fde")
public class PrefGuitare extends PrefInstrument {
    @objid ("8d11616e-5c6b-423b-98b9-11a2932ac1b1")
    private int nbCordes;

    @objid ("0e4d9b46-86be-48a8-bf87-b85e79bd3ffb")
    public PrefGuitare(Fabricant fabricant, String modele, Type type, Bois boisFond, Bois boisTable, int nbCordes) {
        super(fabricant, modele, type, boisFond, boisTable);
        this.nbCordes = nbCordes;
    }

    @objid ("f98d24fa-e4fc-4fe3-915b-dcf790f43fe1")
    public boolean equals(PrefInstrument prefGuitare) {
        System.out.println("On compare le nombre de cordes...");
        if (this == prefGuitare) {
            return true;
        }
        
        if (!(prefGuitare instanceof PrefGuitare))
        	return false;
        
        if (!super.equals(prefGuitare))
        	return false;
        
        PrefGuitare pref = (PrefGuitare) prefGuitare;
        if (!(nbCordes == pref.getNbCordes()))
            return false;
        return true;
    }

    @objid ("ef9b4517-9897-4522-b99e-0397a371e1c7")
    public int getNbCordes() {
        return nbCordes;
    }

    @objid ("5b5d8ff9-dac3-4be9-b9e5-099d5a48dc97")
    public void setNbCordes(int nbCordes) {
        this.nbCordes = nbCordes;
    }

}
