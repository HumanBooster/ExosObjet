import com.modeliosoft.modelio.javadesigner.annotations.objid;

public class PrefGuitare {
	@objid("fcd5eff8-78ee-485a-b42b-90f780b93c09")
	private Fabricant fabricant;

	@objid("0a3b98ec-d24f-4def-a630-a8456ee53518")
	private String modele;

	public Fabricant getFabricant() {
		return fabricant;
	}

	public void setFabricant(Fabricant fabricant) {
		this.fabricant = fabricant;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Bois getBoisFond() {
		return boisFond;
	}

	public void setBoisFond(Bois boisFond) {
		this.boisFond = boisFond;
	}

	public Bois getBoisTable() {
		return boisTable;
	}

	public void setBoisTable(Bois boisTable) {
		this.boisTable = boisTable;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@objid("8391edd9-e5bc-4886-b0eb-19970feee0ba")
	private Bois boisFond;

	@objid("4d873648-5846-43fd-a18f-02ae044b8f62")
	private Bois boisTable;

	@objid("baa7ca85-ff3b-4858-8ddf-ebf0d8eb9add")
	private Type type;

	public PrefGuitare(Fabricant fabricant, String modele, Type type,
			Bois boisFond, Bois boisTable) {
		this.fabricant = fabricant;
		this.modele = modele;
		this.type = type;
		this.boisFond = boisFond;
		this.boisTable = boisTable;
	}

	public boolean equals(PrefGuitare prefGuitare) {

		if (this == prefGuitare) {
			return true;
		}

		if ((modele != null) && (!modele.equals(""))
				&& (!modele.equalsIgnoreCase(prefGuitare.getModele())))
			return false;
		
		if (!type.equals(prefGuitare.getType()))
			return false;

		if (!boisFond.equals(prefGuitare.getBoisFond()))
			return false;

		if (!boisTable.equals(prefGuitare.getBoisTable()))
			return false;

		return true;
	}
}
