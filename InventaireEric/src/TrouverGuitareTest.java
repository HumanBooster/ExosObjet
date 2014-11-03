import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5670d192-883f-4459-ac39-05784e485124")
public class TrouverGuitareTest {
    @objid ("49e190fb-312a-4b6d-b34f-5913757d83da")
    public static void main(String[] args) {
        // Dresse l’inventaire des Guitares d’Éric
        Inventaire inventaire = new Inventaire();
        
        initialiserInventaire(inventaire);
        
        PrefGuitare prefIrene = new PrefGuitare(Fabricant.FENDER,
                "Stratocaster", Type.ELECTRIQUE, Bois.AULNE, Bois.AULNE);
        
        Guitare guitare = inventaire.chercher(prefIrene);
        
        if (guitare != null) {
            System.out.println("Irène,peut-être aimerez-vous cette guitare : " +
                    guitare.getPreferences().getBoisFond() + " pour le corps,\n " +
                    guitare.getPreferences().getBoisTable()
                    + " pour la table.\n Elle est à vous pour seulement " +
                    guitare.getPrix() + " € !");
        } else {
            System.out.println("Désolé, Irène, nous n’avons rien pour vous.");
        }
    }

    @objid ("e679b768-9d00-4f1e-9b19-a5736b70cdb5")
    private static void initialiserInventaire(Inventaire inventaire) {
        // Ajoute des guitares dans l’inventaire...
        inventaire.addGuitare("V95693", 1499.90, Fabricant.FENDER, "Stratocaster", Type.ELECTRIQUE, Bois.AULNE, Bois.AULNE);
    }

}
