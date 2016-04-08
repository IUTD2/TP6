package iut;

/**
 * Fene^tre graphique, peut contenir des composants. liée à un écran, elle déclenche le dessin et les clics souris.
 */
public class Fenetre extends Composant {
	/**
	 * titre de la fenêtre
	 */
	private String titre="noname";
        private Police police; /**< police par défaut */
        
	/**
	 * couleur RVB du fond
	 */
	private int arrièrePlan=0xB8B8B8;
	

        public Fenetre(Ecran e)
        {
            super(null,0,0,e.getLargeur(),e.getHauteur());            
            e.setRoot(this);
            police = new Police("Arial",8,0);
        }
        
        /**
         * Dessine une fenêtre : trace un rectangle autour, dessine le titre
         * Dessine aussi ses enfants 
         * @param e 
         * @author
         */
        @Override
	public void dessiner(Ecran e) {
            
            
            super.dessiner(e);
	}

        @Override
	protected String nomType() {
		return "fenêtre";
	}

        @Override
	protected boolean peutAvoirComposants() {
		return true;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setArrièrePlan(int arrièrePlan) {
		this.arrièrePlan = arrièrePlan;
	}

	public int getArrièrePlan() {
		return this.arrièrePlan;
	}
}