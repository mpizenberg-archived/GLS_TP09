/**
 * @author matthieu Pizenberg
 *
 */
public class Numeroteur extends Afficheur {

	/**
	 * @param sortie
	 */
	public Numeroteur(PeripheriqueSortie sortie) {
		super(sortie);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see Afficheur#afficher(String)
	 */
	@Override
	public void afficher(String texte){
		String lignes[] = texte.split("\n");
		int numLigne = 1;
		for (String ligne : lignes) {
			super.afficher(numLigne);
			super.afficher(" ");
			super.afficher(ligne + "\n");
		}
	}
}
