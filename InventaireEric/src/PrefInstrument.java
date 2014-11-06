import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrefInstrument {
	Map<Propriete,Object> proprietes;
    
    public PrefInstrument(Map<Propriete,Object> proprietes) {
    	if (proprietes==null) {
    		this.proprietes = new HashMap<Propriete,Object>();
    	} else {
    		this.proprietes = new HashMap<Propriete,Object>(proprietes);
    	}
    }

    public Object getPropriete(Propriete prop) {
        return proprietes.get(prop);
    }

    public Map<Propriete,?> getProprietes() {
    	return proprietes;
    }

    public boolean correspond(PrefInstrument prefInstrument) {
        if (this == prefInstrument) {
            return true;
        }
        
        for (Iterator<Propriete> i = prefInstrument.getProprietes().keySet().iterator();
        		i.hasNext(); ) {
        	Propriete prop = i.next();
        	
        	if (!proprietes.get(prop).equals(prefInstrument.getPropriete(prop)))
        		return false;
        	
        } 
        return true;

    }
    
    public String toString() {
    	return getClass().getName();
    }

}
