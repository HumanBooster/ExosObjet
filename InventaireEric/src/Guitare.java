import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8dd9ea9d-cafc-4c75-8f56-55e4b542593d")
public class Guitare extends Instrument {
    @objid ("65558a08-a826-4682-b17c-fb5d29416abf")
    public Guitare(String numSerie, double prix, PrefGuitare pref) {
        super(numSerie, prix, pref);
    }
}
