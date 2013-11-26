/**
 * @author matthieu Pizenberg
 *
 */
public class TestEx3_5 {

	/**
	 * Affiche plusieurs lignes numérotées
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numeroteur numeroteur = new Numeroteur(new Terminal());
		numeroteur.afficher("Ligne : ");
		numeroteur.afficher(10);
		numeroteur.afficher('n');
		numeroteur.afficher("Attention au retour à la ligne\ndans la chaîne\nhéhé");
	}

}
