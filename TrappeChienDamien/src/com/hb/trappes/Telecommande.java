package com.hb.trappes;


public class Telecommande {
    private Trappe trappe;

    public Telecommande(Trappe trappe) {
        this.trappe = trappe;
    }

    public void presserBouton() {
        System.out.println("Le bouton de la télécommande est pressé.");
        trappe.toggle();
    }

}
