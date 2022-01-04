package exercicios;
import java.util.*;
public class exercicio7 {
	public static void main(String[] args)
    { 
    	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
    	System.out.print ("Nome?");  
    	String nome= sc.nextLine(); 
    	System.out.println (nome.toUpperCase ());
    	System.out.println (nome.substring(0, 3));
    	String resultado = "";
    	for (int i= 0; i < nome.length(); i++)
    	{
    		resultado = resultado + (int) nome.charAt(i) + " ";
    	}
    	System.out.println (resultado);
    	sc.close();
	}  
}