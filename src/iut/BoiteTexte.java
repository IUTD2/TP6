package iut;

/**
 * zone de saisie de texte. L'utilisateur doit cliquer dans la boite pour
 * qu'elle ait le focus Note : on ne gère pas la saisie de texte
 */
public class BoiteTexte extends Label {

    /**
     * indique si la boite possède ou non le focus clavier
     */
    private boolean hasFocus = false;

    public BoiteTexte(Composant parent, int x, int y, int w, int h) {
        super(parent, x, y, w, h);

    }

    /**
     * Dessine la boite Texte : tracé d'un rectangle blanc à contour noir. Si la
     * zone a le focus, écrire 'texte' dedans Note : on ne gère pas la saisie de
     * texte
     *
     * @param e l'écran
     * @author Baptiste Prunot
     */
    @Override
    public void dessiner(Ecran e) {
        e.traceRectangle(this.getX(), this.getY(), this.getLargeur()+2   ,this.getHauteur()+2, 0);
        e.traceRectangle(this.getX()+1, this.getY()+1, this.getLargeur(), this.getHauteur(), 0xFFFFFF);
        
        if (this.hasFocus) {
            e.traceTexte(this.getX(), this.getY(), "Texte", new Police("Arial", 12, 0x000000));
            
        }
        this.setVisible(true);
    }

    @Override
    protected String nomType() {
        return "boitetexte";
    }
        
        /**
         * Répond au clic : prend le focus et enlève le focus des autres boites texte du parent
         * @author Raphaël Pinto
         */
        @Override
        protected void clic()
        {
         this.hasFocus=true;   
         
         /* Si quelqu'un a une idée pour enlever le focus des autres boites textes du parent */
        }
}
