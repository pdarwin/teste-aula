package excecoes;

public class SemLetraAException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage () {
		return "O nome inserido n�o tem uma letra A";
	}
}
