package exercicios;
import java.util.*;
public class exercicio5 {
	public static void pedeNumero ()
	{
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print ("Introduza um número?");  
    	int a= sc.nextInt(); 
        System.out.println("o nº aleatório é: "+ geraAleatorio (a));
        sc.close();
	}
	public static int geraAleatorio (int a)
	{
		Random gerador = new Random();
        return(gerador.nextInt (a));
	}
    public static void main(String[] args)
    { 
    	// pedeNumero();
    	
    	String resposta = "S";
    	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
    	while (resposta == "S")
        	{
        		//pedeNumero();
            	System.out.print ("Gerar outro (S/N) ?");
            	resposta = sc.nextLine();
            	System.out.println (resposta);
        	 }
        System.out.println("Parabéns, finalizou com sucesso.");
        sc.close();
        
	}  
}