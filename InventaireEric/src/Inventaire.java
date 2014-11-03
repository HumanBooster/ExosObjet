import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("873f5c84-c214-4988-b181-667fda1e3907")
public class Inventaire {
	@objid("5283c993-f632-4172-b552-79a70bbde490")
	private List<Guitare> guitares;

	@objid("36abb9ad-f220-4336-a620-70306095e28f")
	public Inventaire() {
		guitares = new LinkedList<Guitare>();
	}

	@objid("820b0092-e6be-4d85-b6b3-735fd1d39cf1")
	public void addGuitare(String numSerie, double prix, Fabricant fabricant,
			String modele, Type type, Bois boisFond, Bois boisTable) {
		
		PrefGuitare prefGuitare = new PrefGuitare(fabricant, modele, type,
				boisFond, boisTable);
		Guitare guitare = new Guitare(numSerie, prix, prefGuitare);
		guitares.add(guitare);
	}

	@objid("a3782776-fc9b-47ad-9176-3792f0d25b93")
	public Guitare getGuitare(String numSerie) {
		for (Iterator i = guitares.iterator(); i.hasNext();) {
			Guitare guitare = (Guitare) i.next();

			if (guitare.getNumSerie().equals(numSerie)) {
				return guitare;
			}

		}
		return null;
	}

	@objid("5799b264-50ce-4ee9-8d0e-5e83224d56d0")
	public Guitare chercher(PrefGuitare prefGuitare) {
		for (Iterator<Guitare> i = guitares.iterator(); i.hasNext();) {
			Guitare guitare = i.next();

			if (guitare.correspond(prefGuitare))
				return guitare;
		}
		return null;
	}

}
