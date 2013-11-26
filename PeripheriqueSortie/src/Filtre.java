/**
 * @author mpizenbe
 *
 */
public abstract class Filtre implements PeripheriqueSortie {

	protected PeripheriqueSortie sortie;
	
	/**
	 * Constructeur de Filtre
	 * @param sortie
	 */
	public Filtre(PeripheriqueSortie sortie) {
		this.sortie = sortie;
	}

}
