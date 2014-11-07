package com.hb.inventaire.enums;

public enum TypeInstrument {
	GUITARE, MANDOLINE, BANJO;

	public String toString() {
		switch (this) {
		case GUITARE:
			return "Guitare";
		case MANDOLINE:
			return "Mandoline";
		case BANJO:
			return "Banjo";
		default:
			return "Sans type";

		}
	}
}
