import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("94d80ac0-cd92-4227-b195-e70535f15ec2")
public enum Type {
    ACOUSTIQUE,
    ELECTRIQUE;

    @objid ("b3970ab7-487c-43b7-ad53-2c8d08fd2cf5")
    public String toString() {
        switch (this) {
        case ACOUSTIQUE:
            return "Acoustique";
        case ELECTRIQUE:
            return "Electrique";
        default: return "";
        }
    }

}
