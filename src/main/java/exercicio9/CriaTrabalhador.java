package exercicio9;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


public class CriaTrabalhador {
	
	public static void main(String[] args)
    { 
		List<Trabalhador> trabalhadores = new ArrayList<Trabalhador>();
		
		
		trabalhadores.add (new Trabalhador("João", 30, 1000));
		trabalhadores.add (new Trabalhador("Pedro", 45, 1500));
		trabalhadores.add (new Trabalhador("Tiago", 25, 700));
		trabalhadores.add (new Trabalhador("Ana", 23, 2050));
		trabalhadores.add (new Trabalhador("Maria", 57, 2000));
		
		System.out.println("Soma: " + somaSalarios (trabalhadores));
		System.out.println("Média: " + mediaSalarios (trabalhadores));
		System.out.println("Máximo: " + maxSalarios (trabalhadores));
		System.out.println("Mínimo: " + minSalarios (trabalhadores));
		System.out.println("Média via stream: " + medStrSalarios (trabalhadores).getAsDouble());
		
		
    }
	
	public static double somaSalarios (List<Trabalhador> aTrabalhadores) {
		double soma = 0;
		for (Trabalhador trabalhador : aTrabalhadores) {
			soma = soma + trabalhador.getSalario ();
		}
		return soma;	
	}
	
	public static double mediaSalarios (List<Trabalhador> aTrabalhadores) {
		return somaSalarios (aTrabalhadores) / aTrabalhadores.size();
	}
	
	public static double maxSalarios (List<Trabalhador> aTrabalhadores) {
		double max = aTrabalhadores.get(0).getSalario();
		for (Trabalhador trabalhador : aTrabalhadores) {
			if (trabalhador.getSalario() > max) max = trabalhador.getSalario();
		}
		return max;	
	}
	public static double minSalarios (List<Trabalhador> aTrabalhadores) {
		double min = aTrabalhadores.get(0).getSalario();
		for (Trabalhador trabalhador : aTrabalhadores) {
			if (trabalhador.getSalario() < min) min = trabalhador.getSalario();
		}
		return min;	
	}
	
	public static OptionalDouble medStrSalarios (List<Trabalhador> aTrabalhadores) {
		return aTrabalhadores.stream().mapToDouble(trabalhador -> trabalhador.getSalario()).average();
	}
	
	
}
