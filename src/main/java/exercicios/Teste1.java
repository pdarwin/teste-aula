package exercicios;

import java.util.Scanner;

public class Teste1 {
	public static Scanner sc1;
	public static void main(String[] args)
	{
		sc1= new Scanner(System.in);    //System.in is a standard input stream 
		String continuar;
		do 
		{
			System.out.print ("Qual é o primeiro número?");
			int primeiroNumero = sc1.nextInt();
			
			System.out.print ("Qual é o segundo número?");
			int segundoNumero = sc1.nextInt();
			
			if (primeiroNumero > segundoNumero)
			{
				somaNumeros(primeiroNumero);
			}
			else
			{
				somaNumeros(segundoNumero);
			}
			System.out.println ();
			System.out.print ("Escreva \"s\" para continuar, ou outro valor qualquer para terminar");
			continuar=sc1.next();
		}
		while (continuar.equals("s"));
		System.out.print ("Fim");
		sc1.close();	
		
	}
	public static void somaNumeros (int aNumero)
	{
		int resultado = aNumero;
		int i=0;
		String soma= "0";
		while (i < aNumero)
		{
			resultado = resultado + i;
			i++;
			soma = soma + " + " + i;
		}
		System.out.print ("A soma dos números de 0 a " + aNumero + " (" + soma +") é " + resultado);
	}
}
