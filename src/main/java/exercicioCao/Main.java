package exercicioCao;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args)
    { 
		List<Animal> animais = new ArrayList<Animal>();		
		
		animais.add (new Cao ("Piloto", 5, 35, "Grand Danois"));
		animais.add (new Cao ("Farrusco", 12, 2.7, "Pequenois"));
		
		animais.add (new Gato ("Tareco", 5, 4, false));
		animais.add (new Gato ("Tigre", 2, 2.5, true));
		
		for (Animal animal :animais) System.out.println("Olá! " + animal.comunicar() + " Eu sou o " + animal.getNome()+ ", tenho " + animal.getIdade() + " anos, " + animal.getPeso() + " quilos, e sou um" + returnEsp(animal) + "!"); //" quilos, e sou um " + animal.getRaca() + "!");
		//for (Cao cao :caes) System.out.println("Olá! " + cao.comunicar() + " Eu sou o " + cao.getNome()+ ", tenho " + cao.getIdade() + " anos, " + cao.getPeso() +" quilos, e sou um " + cao.getRaca() + "!");
		//for (Gato gato :gatos) System.out.println("Olá! " +  gato.comunicar() + " Eu sou o " + gato.getNome() +", tenho " + gato.getIdade() + " anos, " + gato.getPeso() +" quilos, e sou um" + returnCacador(gato.isCacador()));
		
    }
	
	public static String returnCacador (boolean aCacador)
	{
		String sCacador;
		if (aCacador) sCacador = " excelente caçador"; else  sCacador = "a desgraça a caçar";
		return sCacador;
	}
	
	public static String returnEsp (Animal aAnimal)
	{
		String sEsp= "";
		if (aAnimal instanceof Cao) sEsp = ", e sou um " + ((Cao)aAnimal).getRaca(); 
		else { 
			if (aAnimal instanceof Gato) sEsp = returnCacador(((Gato)aAnimal).isCacador()); 
			//else sEsp = "";
		}
		return sEsp;
	}
}
