package exercicioCao;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args)
    { 
		List<Cao> caes = new ArrayList<Cao>();
		List<Gato> gatos = new ArrayList<Gato>();
		
		
		caes.add (new Cao ("Piloto", 5, 35, "Grand Danois"));
		caes.add (new Cao ("Farrusco", 12, 2.7, "Pequenois"));
		
		gatos.add (new Gato ("Tareco", 5, 4, false));
		gatos.add (new Gato ("Tigre", 2, 2.5, true));
		
		for (Cao cao :caes) System.out.println("Olá! " + cao.comunicar() + " Eu sou o " + cao.getNome()+ ", tenho " + cao.getIdade() + " anos, " + cao.getPeso() +" quilos, e sou um " + cao.getRaca() + "!");
		for (Gato gato :gatos) System.out.println("Olá! " +  gato.comunicar() + " Eu sou o " + gato.getNome() +", tenho " + gato.getIdade() + " anos, " + gato.getPeso() +" quilos, e sou um" + returnCacador(gato.isCacador()));
		
    }
	
	public static String returnCacador (boolean aCacador)
	{
		String sCacador;
		if (aCacador) sCacador = " excelente caçador!"; else  sCacador = "a desgraça a caçar!";
		return sCacador;
	}
}
