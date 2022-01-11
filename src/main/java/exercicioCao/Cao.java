package exercicioCao;

//Exercício 9
//import java.util.Scanner;

public class Cao extends Animal {
	
	private String raca;
	
	public Cao(String aNome, int aIdade, double aPeso, String aRaca) {
		super(aNome, aIdade, aPeso);
		raca = aRaca;
	}

	public String comunicar ()
	{
		return super.comunicar () + " Sei dizer au au au!";
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String aRaca) {
		raca = aRaca;
	}

	
}
