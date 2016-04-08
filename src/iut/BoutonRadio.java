package iut;

/**
 * un bouton radio est une sorte de case à cocher qui "décoche" les autres boutons radio du même parent (groupe ou fenêtre). 
 */
public class BoutonRadio extends CaseCocher {

    public BoutonRadio(Composant parent, int x, int y, int w, int h)
    {
        super(parent,x,y,w,h);
    }
    
    /**
     * Dessine le bouton radio : texte du libellé, cercle à coté, plein si coché
     * @param e 
     * @author
     */
    @Override
	public void dessiner(Ecran e) {
           
	}

    @Override
	protected String nomType() {
		return "boutons radio";
	}
        
        /**
         * Clic sur le bouton : coche la case et décoche les autres boutons radios du parent
         * @author 
         */
    @Override
        protected void clic()
        {
            
        }
}