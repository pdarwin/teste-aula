package exercicioCao;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


public class Main {
	
	public static void main(String[] args)
    { 
		/*List<Trabalhador> trabalhadores = new ArrayList<Trabalhador>();
		
		
		trabalhadores.add (new Trabalhador("Jo�o", 30, 1000));
		trabalhadores.add (new Trabalhador("Pedro", 45, 1500));
		trabalhadores.add (new Trabalhador("Tiago", 25, 700));
		trabalhadores.add (new Trabalhador("Ana", 23, 2050));
		trabalhadores.add (new Trabalhador("Maria", 57, 2000));
	
		
		System.out.println("Soma: " + somaSalarios (trabalhadores));
		System.out.println("M�dia: " + mediaSalarios (trabalhadores));
		System.out.println("M�ximo: " + maxSalarios (trabalhadores));
		System.out.println("M�nimo: " + minSalarios (trabalhadores));
		System.out.println("M�dia via stream: " + medStrSalarios (trabalhadores));
		
		*/
		Cao Maluco = new Cao ("Maluco", 5, 10, "Grand Danois");
		
		System.out.println(Maluco.comunicar());
    }	
}
