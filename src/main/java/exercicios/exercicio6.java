package exercicios;
import java.util.*;
import java.time.*;
public class exercicio6 {
    public static void main(String[] args)
    { 
    	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
    	System.out.print ("Ano nascimento?");  
    	int a= sc.nextInt();  
    	LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();
        int idade = current_Year - a;
        
        System.out.println("Idade: " +idade);
	}  
}