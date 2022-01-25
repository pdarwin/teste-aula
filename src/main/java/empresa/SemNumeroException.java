package empresa;

public class SemNumeroException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage ()
	{
		return "tem de ser um numero maior que 10";
	}
}
