import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7efb11ab-4763-42e9-920e-88a214a9d856")
public enum Fabricant {
    FENDER,
    GIBSON;

    @objid ("e8cab7d5-4d2a-4e8e-a836-698d5ade099e")
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
