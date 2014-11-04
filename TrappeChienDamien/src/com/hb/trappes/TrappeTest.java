package com.hb.trappes;

public class TrappeTest {
    public static void main(String[] args) {
        Trappe trappe = new Trappe();
        Telecommande telecommande = new Telecommande(trappe);
        
        System.out.println("Fido aboit et veut sortir.");
        
        System.out.println("On appuie sur la télécommande.");
        telecommande.presserBouton();

        telecommande.presserBouton();
        
        System.out.println("Fido sort.");
        
        try {
        	Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) { }
        
        System.out.println("Fido fait ce qu'il a à faire.");
        
        System.out.println("Fido aboit et veut rentrer.");
        
        System.out.println("On appuie sur la télécommande.");
        telecommande.presserBouton();
        
        System.out.println("Fido rentre.");
    }

}
