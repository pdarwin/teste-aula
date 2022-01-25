package empresa;

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
	
		Scanner sc= new Scanner(System.in);
		
		boolean correto = false;
		
		while (!correto)
		{
			
			try {
				System.out.println("Introduza um número:");
				int num = sc.nextInt();
				
				if (num > 10)
				{
					System.out.println("ok");
				}
				else {
					throw new SemNumeroException();
				}
				
				System.out.println( (float) 1 / num);
				correto= true;
				
			} catch (ArithmeticException e) {
				// TODO: handle exceptio
				printaErro(e);
			}
			catch (SemNumeroException e)
			{
				printaErro(e);
			}
			catch (Exception e) {
				// TODO: handle exceptio
				printaErro(e);
				sc.next();
			}
			finally {
				try {
					String frase = "AA";
					
					System.out.println( frase.substring(5));	
				} catch (Exception e) {
					// TODO: handle exception
					printaErro(e);
				}
			}
		}
		System.out.println();
		
		Empresa pastelaria = new Empresa("Casa dos Bolos", 30000, "Rua das Flores", 101999101, divisoes);
		
		Trabalhador t0 = new Trabalhador("José Ramiro", 50, 1050, 0);
		Trabalhador t1 = new Trabalhador("Clara de Sousa", 45, 2050, 0);
		Chefe chefe = new Chefe("Joaquim", 53, 2000, 0); 
	
		pastelaria.addTrabalhador(t0);
		pastelaria.addTrabalhador(t1);
		pastelaria.addTrabalhador(chefe);

		for (Trabalhador trabalhador : pastelaria.getListaTrabalhadores())
		{
			trabalhador.trabalha();
		}
		
		System.out.println();
		System.out.println("Prima 1 para processar salários\nPrima 0 para sair");
		
		int opcao = sc.nextInt();
		while (opcao == 1)
		{
			
			clearScreen();
			System.out.println("Bem vindo ao programa de salários da empresa " +  pastelaria.getNome());
			System.out.println ();
			
			
			if (chefe.isPaga())
			{			
				System.out.println ("Está com sorte, o chefe " + chefe.getNome() + " mandou pagar.");
				pastelaria.pagaTrabalhadores();
			}
			
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
	
	public static void printaErro(Exception e) {  

		System.out.println("Erro: " + e.toString());

	}

}
