package iut;

/**
 * Simple étiquette : texte affiché sur une fenêtre ou un groupe
 */
public class Label extends Composant {
	/**
	 * texte du label
	 */
	private String texte="";
	/**
	 * police de caractèrs à utiliser
	 */
	private Police police;

        public Label(Composant parent, int x, int y, int w, int h)
        {
            super(parent,x,y,w,h);
            police = new Police("Arial",10,0);
        }
        
        @Override
	public void dessiner(Ecran e) {
		e.traceTexte(getX(), getY(), texte, police);
	}

        @Override
	protected String nomType() {
		return "label";
	}

	/**
	 * @return true si le composant peut recevoir des enfants
	 */
        @Override
	protected boolean peutAvoirComposants() {
		return false;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getTexte() {
		return this.texte;
	}

	public void setPolice(Police police) {
		this.police = police;
	}

	public Police getPolice() {
		return this.police;
	}
}