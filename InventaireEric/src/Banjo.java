import java.util.List;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2f12e654-ff33-48cf-b9f3-b2b6bf1e42ed")
public class Banjo extends Instrument {
    @objid ("50a2eb03-efb5-4eed-8529-d91fd26fc315")
    public Banjo(String numSerie, double prix, PrefBanjo pref) {
        super(numSerie, prix, pref);
    }
   
}
