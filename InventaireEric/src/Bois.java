import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("95fb8f77-f603-424b-abbd-822b21cde43a")
public enum Bois {
    AULNE,
    FRENE,
    OLIVIER,
    CHENE;

    @objid ("8e29de7c-5224-4926-85f3-599ea431fcac")
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
