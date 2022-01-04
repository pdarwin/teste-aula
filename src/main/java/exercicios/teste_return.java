package exercicios;

import java.util.Scanner;

public class teste_return {
    public static String saida (String aEntrada)
    {
    	String saida = "A chave é:" + aEntrada;
    	return saida;
    }
    public static void main(String[] args)
    { 
    	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
    	System.out.print ("Introduza a chave");  
    	String entrada = sc.nextLine(); 
    	System.out.print (saida (entrada));
    	sc.close();
    }
	
}
