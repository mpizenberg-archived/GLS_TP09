/**
 * @author matthieu Pizenberg
 *
 */
public class TestEx3_2 {

	/**
	 * Affiche sur un terminal les caractères '4', 'X', et '.' en minuscule
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Terminal terminal = new Terminal();
		Filtre lowerCase = new LowerCase(terminal);
		lowerCase.ecrire('4');
		lowerCase.ecrire('X');
		lowerCase.ecrire('.');
	}

}
