import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1c685f33-3d17-4a6b-8e59-9057d1169e3c")
public class PrefMandoline extends PrefInstrument {
	@objid ("b5bf855c-d2a7-48c5-99e1-5d57831a9510")
    private Style style;

    public PrefMandoline(Fabricant fabricant, String modele, Type type,
			Bois boisFond, Bois boisTable, Style style) {
		super(fabricant, modele, type, boisFond, boisTable);
		this.style = style;
	}
    
    @objid ("97d1f825-a530-435a-8742-029b3e411f86")
    public Style getStyle() {
		return style;
    }

    @objid ("d18bb296-80f2-4948-9a2b-13132520b580")
    public boolean equals(PrefInstrument prefMandoline) {
        System.out.println("On compare le style...");
     
        if (this == prefMandoline) {
            return true;
        }
        
        if (!(prefMandoline instanceof PrefMandoline))
        	return false;
        
        if (!super.equals(prefMandoline))
        	return false;
        
        PrefMandoline pref = (PrefMandoline) prefMandoline;
  
        if (!(style == pref.getStyle()))
            return false;
        
        return true;
    }

    @objid ("72aed268-72c2-486a-8bb8-227406f754c8")
    public void setStyle(Style style) {
    	this.style = style;
    }

}
