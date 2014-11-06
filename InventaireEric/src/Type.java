
public enum Type {
	ACOUSTIQUE, ELECTRIQUE;

	public String toString() {
		switch (this) {
		case ACOUSTIQUE:
			return "Acoustique";
		case ELECTRIQUE:
			return "Electrique";
		default:
			return "";
		}
	}

}
