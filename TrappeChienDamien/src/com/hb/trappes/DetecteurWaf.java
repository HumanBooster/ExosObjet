package com.hb.trappes;

public class DetecteurWaf {
	
	private Trappe trappe;
	
	public DetecteurWaf(Trappe trappe) {
		this.trappe = trappe;
	}

	public void detecter(String waf) {
		System.out.println("[Détecté] : " + waf);
		trappe.ouvrir();
	}
	
}
