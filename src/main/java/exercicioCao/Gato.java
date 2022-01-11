package exercicioCao;

//Exercício 9
//import java.util.Scanner;

public class Gato extends Animal {
	
	private boolean cacador;
	
	public Gato(String aNome, int aIdade, double aPeso, boolean aCacador) {
		super(aNome, aIdade, aPeso);
		cacador = aCacador;
	}

	public String comunicar ()
	{
		return super.comunicar () + " Sei dizer miau miau miau!";
	}

	public boolean isCacador() {
		return cacador;
	}

	public void setCacador(boolean aCacador) {
		cacador = aCacador;
	}


	
}
