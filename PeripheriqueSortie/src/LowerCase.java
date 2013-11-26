/**
 * @author matthieu Pizenberg
 *
 */
public class LowerCase extends Filtre {

	/**
	 * @param sortie
	 */
	public LowerCase(PeripheriqueSortie sortie) {
		super(sortie);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see PeripheriqueSortie#ecrire(char)
	 */
	@Override
	public void ecrire(char c) {
		// TODO Auto-generated method stub
		char cFiltered;
		if (Character.isUpperCase(c)) {
			cFiltered = Character.toLowerCase(c);
		} else {
			cFiltered = c;
		}
		this.sortie.ecrire(cFiltered);
	}

}
