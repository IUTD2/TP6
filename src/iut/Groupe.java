package iut;

/**
 * le groupe est un composant pouvant contenir d'autres comspoants
 */
public class Groupe extends Composant {
	/**
	 * titre du groupe
	 */
	private String texte="group";
        
        public Groupe(Composant parent,int x, int y, int w, int h)
        {
            super(parent,x,y,w,h);
        }

        @Override
	protected boolean peutAvoirComposants() {
		return true;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getTexte() {
		return this.texte;
	}

        @Override
        public void clic(int x, int y)
        {
            super.clic(x, y);
        }
	/**
	 * @return nom du type exact
	 */
        @Override
	protected String nomType() {
		return "groupe";
	}
        
        /**
         * Dessine le groupe : trace un rectangle autour, place un texte en titre
         * @param e 
         * @author
         */
        @Override
        public void dessiner(Ecran e)
        {                        
            
            super.dessiner(e);
        }
}