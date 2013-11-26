/**
 * @author mpizenbe
 *
 */
public class Afficheur extends Filtre {

	/**
	 * @param sortie
	 */
	public Afficheur(PeripheriqueSortie sortie) {
		super(sortie);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Ecrit l'ensemble des caractères d'une chaine
	 * @param texte
	 */
	public void afficher(String texte){
		for (char c: texte.toCharArray()) {
			this.sortie.ecrire(c);
		}
	}
	
	/**
	 * Ecrit un entier
	 * @param entier
	 */
	public void afficher(int entier) {
		this.afficher("" + entier);
	}
	
	/* (non-Javadoc)
	 * @see PeripheriqueSortie#ecrire(char)
	 */
	@Override
	public void ecrire(char c) {
		// TODO Auto-generated method stub
		this.sortie.ecrire(c);
	}

}
