package com.hb.inventaire.enums;

public enum Bois {
    AULNE,
    FRENE,
    OLIVIER,
    CHENE;

    public String toString() {
        switch (this) {
        case AULNE:
            return "Aulne";
        case FRENE:
            return "Frêne";
        case OLIVIER:
            return "Olivier";
        case CHENE:
            return "Chêne";
        default: return "";
        }
    }

}
