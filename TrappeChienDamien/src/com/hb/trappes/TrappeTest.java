package com.hb.trappes;

import java.util.ArrayList;
import java.util.List;

public class TrappeTest {
    public static void main(String[] args) {
        Trappe trappe = new Trappe();
        Telecommande telecommande = new Telecommande(trappe);
        DetecteurWaf detecteur = new DetecteurWaf(trappe);
        
        trappe.addWafsAutorises(new Waf("Waf"));
        
		System.out.println("Test equals");
		Waf w1 = new Waf("Waf");
		Waf w2 = new Waf("Waf");
		if (w1.equals(w2)) {
			System.out.println("Equals"); // win
		} else {
			System.out.println("Not equals");
		}

		System.out.println("Test contains");
		List<Waf> l1 = new ArrayList<Waf>();
		l1.add(w1);
		
		if (l1.contains(w2)) {
			System.out.println("Contains");
		} else {
			System.out.println("Not contains"); // win
		}
        
        // Fido veut sortir
        if (!trappe.isOuverte()) {
        	
            System.out.println("Fido aboit pour sortir.");
            detecteur.detecter("Waf");

            try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
        }
        
        /*System.out.println("On appuie sur la télécommande.");
        telecommande.presserBouton();*/
        
        // Fido sort
        if (trappe.isOuverte()) {
        	System.out.println("Fido sort.");
        } else {
        	System.out.println("Fido n'est pas sorti... pourtant");
        }
        
        try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("Fido fait ce qu'il a à faire.");
        
        try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // Fido veut rentrer
        if (!trappe.isOuverte()) {
        	
            System.out.println("Fido aboit pour rentrer.");
            detecteur.detecter("Waf");

            try {
				//Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
        }
        
        /*System.out.println("On appuie sur la télécommande.");
        telecommande.presserBouton();*/

        if (trappe.isOuverte()) {
            System.out.println("Fido rentre.");
        } else {
        	System.out.println("Fido est à la porte");
        }

    }
    


}
