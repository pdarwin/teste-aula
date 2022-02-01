package teste2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa("javaReboques");
		System.out.println("Empresa \"javaReboques\" criada com sucesso.");
		
		List<Reboque> reboques = new ArrayList<Reboque>();
		
		Carro carro1 = new Carro(001, 50);
		Carro carro2 = new Carro(002, 60, 2);
		Barco barco1 = new Barco(003, 10);
		Barco barco2 = new Barco(004, 20, 5);
		
		reboques.add(carro1);
		reboques.add(carro2);
		reboques.add(barco1);
		reboques.add(barco2);
		
		System.out.println("Reboques criados com sucesso.");
		
		empresa.setReboques(reboques);
		
		System.out.println("Reboques adicionados à empresa com sucesso.");
		System.out.println("A empresa tem agora um total de " + empresa.getNumReboques() + " reboques.");
		System.out.println();
		
		for (Reboque reboque:empresa.getReboques())
		{
			reboque.trabalhar();
		}
		
		empresa.getReboques().get(2).setAvariado(true);
		
		System.out.println();
		System.out.println("O reboque " + String.format("%03d", empresa.getReboques().get(2).getNumTransporte()) + " avariou.");
		
		System.out.println();
		for (Reboque reboque:empresa.getReboques())
		{
			reboque.trabalhar();
		}
		
		System.out.println();
		System.out.println("A retornar número de serviços:");
		
		for (Reboque reboque:empresa.getReboques())
		{
			System.out.println("O reboque " + String.format("%03d", reboque.getNumTransporte()) + " efetuou " + reboque.getNumTransporte() + " serviços.");
		}
		
	}

}
