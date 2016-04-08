package iut;

/**
 * Représente une police de caractères
 */
public class Police {
	/**
	 * nom de la police
	 */
	private String nom;
	/**
	 * taille (points) de la police
	 */
	private int taille;
	/**
	 * couleur (RVB) de la police
	 */
	private int couleur;

        public Police(String name, int size, int color)
        {
            nom = name;
            taille = size;
            couleur = color;
        }
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getTaille() {
		return this.taille;
	}
}