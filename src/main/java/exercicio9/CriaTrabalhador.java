package exercicio9;
import java.util.ArrayList;
import java.util.List;
//Exercício 9


public class CriaTrabalhador {
	
	public static void main(String[] args)
    { 
		List<Trabalhador> trabalhadores = new ArrayList<Trabalhador>();
		
		
		trabalhadores.add (new Trabalhador("João", 30, 1000));
		trabalhadores.add (new Trabalhador("Pedro", 45, 1500));
		trabalhadores.add (new Trabalhador("Tiago", 25, 700));
		trabalhadores.add (new Trabalhador("Ana", 23, 1050));
		trabalhadores.add (new Trabalhador("Maria", 57, 2000));
		
		System.out.print("Soma: " + somaSalarios (trabalhadores));
    }
	
	public static double somaSalarios (List<Trabalhador> aTrabalhadores) {
		double soma = 0;
		for (Trabalhador trabalhador : aTrabalhadores) {
			soma = soma + trabalhador.getSalario ();
		}
		return soma;
		
	}
}
