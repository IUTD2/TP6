package iut;

/**
 * la case à cocher est un composant à deux états, l'utilisateur change l'état en cliquant dessus. 
 */
public class CaseCocher extends Label {
	/**
	 * état de la coche
	 */
	private boolean etat=false;	
                        
        public CaseCocher(Composant parent, int x, int y, int w, int h)
        {
            super(parent,x,y,w,h);        
        }
        
        /**
         * Effectue un clic : change l'état de la case à cocher
         * @author
         */
        @Override
        protected void clic()
        {
            
        }
        
        /**
         * Dessine la case à cocher : un rectangle (avec une croix si cochée) et du texte
         * @param e 
         * @author
         */
        @Override
	public void dessiner(Ecran e) {

	}

        @Override
	protected String nomType() {
		return "casecocher";
	}

	/**
	 * @return true si le composant peut recevoir des enfants
	 */
        @Override
	protected boolean peutAvoirComposants() {
		return false;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public boolean isEtat() {
		return this.etat;
	}
}