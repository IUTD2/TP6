package iut;

import java.awt.Color;

/**
 * Bouton cliquable.
 */
public class Bouton extends Label {        
    public Bouton(Composant parent, int x, int y, int w, int h)
    {
        super(parent, x,y,w,h);        
    }
        
    @Override
    /**
     * Dessine le bouton : rectangle arrondi gris à contour noir, texte
     * @author Laëtitia LEMIERE
     */
    public void dessiner(Ecran e) {
        e.traceRectangleArrondi(this.getX()-1, this.getY()-1,this.getLargeur()+2, this.getHauteur()+2, 0);       
        e.traceRectangleArrondi(this.getX(), this.getY(),this.getLargeur(), this.getHauteur(), 6316128); 
	e.traceTexte(this.getX(), this.getY(), this.getTexte(), this.getPolice());
 
    }

    @Override
	protected String nomType() {
		return "bouton";
	}

	/**
	 * @return true si le composant peut recevoir des enfants
	 */
    @Override
	protected boolean peutAvoirComposants() {
		return false;
	}
    
}
