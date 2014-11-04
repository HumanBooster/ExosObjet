package com.hb.trappes;

import java.util.Timer;
import java.util.TimerTask;

public class Trappe {
	private boolean ouverte;
	
	Timer timer;

	public Trappe() {
		this.ouverte = false;
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
		System.out.println("La trappe s'ouvre.");
		ouverte = true;
		// on déclare un nouveau timer
		// (final permet d'accéder à des variables de trappe à l'intérieur de la
		// classe)
		timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				fermer();
			}
		}, 5000); // 60000 est en ms = 1 minute
	}

	public void fermer() {
		System.out.println("La trappe se ferme.");
		ouverte = false;
		if (timer!=null) // requis si l'appli est initialisé avec une trappe ouverte
			timer.cancel();
	}

}
