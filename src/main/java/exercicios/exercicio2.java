package exercicios;
import java.util.*;  
public class exercicio2 {
	
	public static void main(String[] args)
    { 
    	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
    	System.out.print ("Introduza o 1� n�mero- ");  
    	int a= sc.nextInt();  
    	System.out.print ("Introduza o 2� n�mero- ");  
    	int b= sc.nextInt();
    	int c =1;
    	if (a==b)
    	{
    		System.out.println ("Os n�meros s�o iguais");
    	}
    	else
    	{
    		if (a > b)
    		{ 
    		c = a;
    		}
    		else
    		{
    			c = b;
    		}
    	}
    	System.out.println("Entre " + a + " e " + b + ", o n�mero maior � " + c);
    	System.out.print("Introduza o 3� n�mero- "); 
    	int d = sc.nextInt(); 
    	int e = 0;
    	System.out.print ("Ciclo while:");
    	while (e <= d)
    	{
    		System.out.print(e + " ");
    		e++;
    	}
    	System.out.println ();
    	System.out.print ("Ciclo for:");
    	for (e=0; e <= d; e++)
    	{
    		System.out.print(e + " ");
    	}
	}  
}