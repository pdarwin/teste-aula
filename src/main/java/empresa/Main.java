package empresa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Divisao wc = new Divisao(TipoDivisao.WC,10, 1, 2);
		Divisao sala = new Divisao(TipoDivisao.QUARTO,40, 5, 20);
		Divisao gabinete = new Divisao(TipoDivisao.ESCRITORIO,30, 2, 5);
		Divisao cozinha = new Divisao(TipoDivisao.COZINHA,17.3, 3, 10);
		
		List <Divisao> divisoes = new ArrayList<Divisao>();
		
		divisoes.add(wc);
		divisoes.add(sala);
		divisoes.add(gabinete);
		divisoes.add(cozinha);
		
		Empresa pastelaria = new Empresa("Casa dos Bolos", 7000, "Rua das Flores", 101999101, divisoes);
		
		Trabalhador t0 = new Trabalhador("José Ramiro", 50, 1050, 0);
		Trabalhador t1 = new Trabalhador("Clara de Sousa", 45, 2050, 0);
	
		pastelaria.addTrabalhador(t0);
		pastelaria.addTrabalhador(t1);

		for (Trabalhador trabalhador : pastelaria.getListaTrabalhadores())
		{
			trabalhador.trabalha();
		}
		
		System.out.println();
		System.out.println("Prima 1 para processar salários\nPrima 0 para sair");
		
		
		Scanner sc= new Scanner(System.in);
		int opcao = sc.nextInt();
		while (opcao == 1)
		{
			
			clearScreen();
			System.out.println("Bem vindo ao programa de salários da empresa " +  pastelaria.getNome());
			System.out.println ();
			
			pastelaria.pagaTrabalhadores();
			
			System.out.println ();
			
			for (Trabalhador trabalhador : pastelaria.getListaTrabalhadores())
			{
				System.out.println("Eu "+ trabalhador.getNome() + " tenho " + trabalhador.getCarteira() + " €");
			}
			
			System.out.println();
			System.out.println("Prima 1 para processar salários, prima 0 para sair");
			opcao = sc.nextInt();
			
		}
    	

		
        sc.close();
	
		
	}
	
	public static void clearScreen() {  

		for( int i = 0; i < 25; i++ ) {
			System.out.println("");
			}

	}

}
