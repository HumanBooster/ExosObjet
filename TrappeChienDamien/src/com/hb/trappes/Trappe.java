package com.hb.trappes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Trappe {
	private boolean ouverte;

	private Timer timer;
	
	private List<Waf> wafsAutorises = new ArrayList<Waf>();

	public Trappe() {
		this.ouverte = false;
	}
	
	public void notifier(Waf waf) {
		System.out.println("La trappe a reçu un : "+waf.getSon());
		if (isWafsAutorises(waf)) {
			System.out.println("Autorisé");
			ouvrir();
		} else {
			System.out.println("Refusé");
		}
	}
	
	public void addWafsAutorises(Waf waf) {
		System.out.println("Ajout d'un waf : "+waf.getSon());
		wafsAutorises.add(waf);
	}
	
	public boolean isWafsAutorises(Waf waf) {
		for (Iterator<Waf> i = wafsAutorises.iterator(); i.hasNext();) {
			Waf wafAutorise = i.next();
			if (wafAutorise.equals(waf))
				return true;
		}
		return false;
	}
	

	public boolean isOuverte() {
		return ouverte;
	}

	public void toggle() {
		if (this.isOuverte()) {
			this.fermer();
		} else {
			this.ouvrir();
		}
	}

	public void ouvrir() {
		if (!isOuverte()) {
			System.out.println("La trappe s'ouvre.");
			ouverte = true;

			// on instancie un nouveau timer
			timer = new Timer();
			timer.schedule(new TimerTask() {
				public void run() {
					fermer();
				}
			}, 5000); // 60000 est en ms = 1 minute
		}
	}

	public void fermer() {
		if (isOuverte()) {
			System.out.println("La trappe se ferme.");
			ouverte = false;
			if (timer != null) // requis si l'appli est initialisée avec une
								// trappe ouverte
				timer.cancel();
		}
	}

}
