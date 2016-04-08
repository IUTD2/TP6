package iut;

/**
 * une liste possède un certain nombre de chaînes et sélectionne par clic une d'entre elles.
 */
public class Liste extends Composant {
	/**
	 * tableau des chaînes contenues dans la liste
	 */
	private java.util.ArrayList<String> chaines = new java.util.ArrayList<>();
	/**
	 * indice de la chaîne sélectionnée (-1 si aucune)
	 */
	private int selection=-1;	
                     
        
        public Liste(Composant parent, int x, int y, int w, int h)
        {
            super(parent,x,y,w,h);
        }
        
        /**
         * Dessine la boite liste
         * Trace un rectangle, puis affiche les chaines à l'intérieur
         * Sélectionne par un rectangle la chaine sélectionnée
         * @author
         * @param e 
         */
        @Override
	public void dessiner(Ecran e) {
            
	}

        @Override
	protected String nomType() {
		return "liste";
	}

	/**
	 * ajoute une chaine dans la liste
     * @param s
     * @author
	 */
	public void ajoute(String s) {
		
	}

	/**
	 * retire une chaîne de la liste
         * @author
     * @param s
	 */
	public void retire(String s) {
		
	}

        /**
         * Lit le ième item de la liste         
         * @param i l'indice de l'item
         * @return la valeur de l'item
         */
        
        public String getItem(int i)
        {
            return chaines.get(i);
        }

	public void setSelection(int selection) {
		this.selection = selection;
	}

	public int getSelection() {
		return this.selection;
	}

	/**
	 * @return true si le composant peut recevoir des enfants
	 */
        @Override
	protected boolean peutAvoirComposants() {
		return false;
	}
        
        /**
         * Change la sélection dans la liste
         * @author
         * @param x
         * @param y 
         */
        @Override
        public void clic(int x, int y) // sélectionne un item de liste
        {
            
            
        }
}