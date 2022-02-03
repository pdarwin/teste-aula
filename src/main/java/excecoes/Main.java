package excecoes;

public class Main {

	public static void main(String[] args) {

		
		String nome = "Joel";
		
		try {
			
			// nome = String.valueOf(1/0);
			// nome = nome.substring(3, 5); 
			validador(nome);
			
		} catch (SemLetraAException e) {

			System.out.println("Ocorreu um erro na função " + e.getStackTrace()[0].getMethodName() + " : " + e.getMessage());
		}
		catch (NullPointerException e)
		{
			System.out.println("Ocorreu um erro na função " + e.getStackTrace()[0].getMethodName()  + " : " + e.getMessage());
		}
		catch (Exception e)
		{
			System.out.println("Ocorreu um erro inesperado na função " + e.getStackTrace()[0].getMethodName() + " do tipo: " + e);
		}
		finally {
			System.out.println("Fim try and catch");
		}
		
		System.out.println("\nFim");
	}
	
	public static void validador (String aNome) throws SemLetraAException{
		if ((!aNome.contains("a")) && (!aNome.contains("A")))
		{
			throw new SemLetraAException();
		}
		
	}

}
