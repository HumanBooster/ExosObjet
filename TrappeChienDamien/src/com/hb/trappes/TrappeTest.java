package com.hb.trappes;

public class TrappeTest {
    public static void main(String[] args) {
        Trappe trappe = new Trappe();
        Telecommande telecommande = new Telecommande(trappe);
        DetecteurWaf detecteur = new DetecteurWaf(trappe);
        
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
				Thread.currentThread().sleep(1000);
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
