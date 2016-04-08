package iut;

import java.util.ArrayList;

/**
 * Composant générique
 */
public abstract class Composant {
	/**
	 * abssisse de départ
	 */
	private int x;
	/**
	 * ordonnée de départ
	 */
	private int y;
	/**
	 * largeur totale du composant
	 */
	private int largeur;
	/**
	 * hauteur totale du composant
	 */
	private int hauteur;
	/**
	 * un composant peut contenir un certain nombre d'autres composants
	 */
	private ArrayList<Composant> composants = new ArrayList<>();
	/**
	 * un composant peut contenir un certain nombre d'autres composants
	 */
	private Composant parent;
        
        private Action onClick=null;
        
        /**
         * Un composant peut être visible, ou non
         */
        private boolean visible=true;

        /**
         * Construit un composant
         * @param parent le composant parent
         * @param x l'abs de départ
         * @param y l'ord de départ
         * @param width la largeur du composant
         * @param height la hauteur du composant
         */
	public Composant(Composant parent, int x, int y, int width, int height) {
		this.parent = parent;
                if(parent!=null)
                {
                    parent.ajouteComposant(this);
                }
                this.x = x;
                this.y = y;
                this.largeur = width;
                this.hauteur = height;
	}
        
        public boolean isVisible(){return visible;}
        public void setVisible(boolean v){visible=v;}
        public void show(){visible=true;} /**< montre le composant */
        public void hide(){visible=false;} /**< cache le composant */

	/**
	 * dessiner le composant : dessiner tous les enfants visibles
	 * @param e l'écran sur lequel dessiner
         * @author
	 */
	public void dessiner(Ecran e) {
                
	}

        /**
         * Change l'action associée à l'évènement onClick
         * @param a l'action a exécuter lors du clic
         */
        public void setOnClick(Action a){
            onClick = a;
        }
	/**
	 * ajoute un composant enfant au compmosant
         * @author
	 */
	protected void ajouteComposant(Composant c) {
		
	}

        protected Composant getParent(){return parent;}
        
	/**
	 * cherche parmi les enfants celui qui contient le point précisé
	 * @return le composant contenant le point x,y, ou null si aucun
         * @author
	 */
	protected Composant chercheComposant(int x, int y) {
            Composant c = null;
            
            return c;
	}

        /**
         * 
         * @return les composants enfants
         */
        protected Composant[] getComposants()
        {            
            return composants.toArray(new Composant[0]);
        }
        
        /**
         * Cherche les composants d'un certain type
         * @param type le nom du type désiré
         * @return les composants enfants du type choisi
         * @author
         */
        protected Composant[] getComposants(String type)
        {
            ArrayList<Composant> liste = new ArrayList<>();
            
            return liste.toArray(new Composant[0]);
        }
	/**
	 * @return nom du type exact
	 */
	protected abstract String nomType();

	/**
	 * @return true si le composant peut recevoir des enfants
	 */
	protected abstract boolean peutAvoirComposants();

	/**
	 * effectue un clic de souris 
         * exécute l'action associée si elle existe
         * @author
	 */
	protected void clic() {
		
	}                
        
        /**
	 * Clic de souris, à redistribuer aux différents composants
         * si aucun composant enfant ne traite le clic, on le traite nous (appeler clic())
         * @author
	 */
	public void clic(int x, int y) {
            
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return this.y;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getLargeur() {
		return this.largeur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getHauteur() {
		return this.hauteur;
	}
}