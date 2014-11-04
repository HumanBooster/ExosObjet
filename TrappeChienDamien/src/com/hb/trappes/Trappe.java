package com.hb.trappes;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("48b9b00c-e386-4485-b30d-297f356545be")
public class Trappe {
    @objid ("2dbb90ae-1c1c-4771-baa0-445586ed3a8f")
    private boolean ouverte;
    
    public Trappe() {
    	this.ouverte = false;
    }

    @objid ("edbbe32a-c7b9-48ec-9a99-ea097b069470")
    public boolean isOuverte() {
        return ouverte;
    }

    @objid ("c89e1780-e2b0-46c7-a34b-371f576cd424")
    public void ouvrir() {
        System.out.println("La trappe s'ouvre.");
        ouverte = true;
    }

    @objid ("b8862e4d-7ecd-4716-bd19-b626c5071a62")
    public void fermer() {
        System.out.println("La trappe se ferme.");
        ouverte = false;
    }

}
