package exercicioCao;

//Exercício 9
//import java.util.Scanner;

public class Cao extends Animal {
	
	private String Raca;
	
	public Cao(String nome, int idade, double peso, String raca) {
		super(nome, idade, peso);
		Raca = raca;
	}

	public String comunicar ()
	{
		return super.comunicar () + " Sei dizer au au au!";
	}

	public String getRaca() {
		return Raca;
	}

	public void setRaca(String raca) {
		Raca = raca;
	}

	
}
