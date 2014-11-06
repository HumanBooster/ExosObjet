
public enum Fabricant {
    FENDER,
    GIBSON;

    public String toString() {
        switch (this) {
        case FENDER:
            return "Fender";
        case GIBSON:
            return "Gibson";
        default: return "";
        }
    }

}
