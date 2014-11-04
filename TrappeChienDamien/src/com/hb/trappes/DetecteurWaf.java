package com.hb.trappes;

public class DetecteurWaf {
	
	private Trappe trappe;
	
	public DetecteurWaf(Trappe trappe) {
		this.trappe = trappe;
	}

	public void detecter(Waf waf) {
		System.out.println("[Détecté] : " + waf.getSon());
		trappe.notifier(waf);
	}
	
	// surcharge pour marcher avec des strings
	public void detecter(String waf) {
		detecter(new Waf(waf));
	}
	
}
