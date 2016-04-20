package iut;

/**
 * ue boite combo est une zone de saisie de texte associée avec une liste déroulante. La liste est placée juste sous la boite de texte. 
 */
public class Combo extends BoiteTexte {
	/**
	 * indique si la liste est enroulée (invisible) ou non
	 */
	private boolean enroulée;	
	private Liste liste;

        public Combo(Composant parent, int x, int y, int w, int h)
        {
            super(parent,x,y,w,h);
            enroulée = true;
            liste = new Liste(parent,x,y+h,w,h+60);
            liste.hide();
        }
        
        @Override
        /**
         * Dessine le combo : affiche la liste si elle est enroulée, trace un rectangle de saisie au dessus avec du texte et un symbole ▼
         * @author ll809273
         */
	public void dessiner(Ecran e) {
            BoiteTexte txt = new BoiteTexte (this,this.getX(), this.getY(), this.getLargeur(), this.getHauteur());
            txt.dessiner(e);
            e.traceTexte(this.getX(), this.getY(), "Saisir texte      ▼", this.getPolice());
            if (!(this.enroulée)){
                this.liste.dessiner(e);
            }
	}

        @Override
	protected String nomType() {
		return "combo";
	}
        
        /**
         * Effectue le clic : enroule ou déroule la liste
         * @author
         */
        @Override
        protected void clic()
        {
            
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
	 */
	public void retire(String s) {
		
	}
        
        /**
         * Lit l'item précisé
         * @param i l'indice de l'item
         * @return la valeur de l'item
         * @author
         */
        public String getItem(int i)
        {
            return "";
        }
}