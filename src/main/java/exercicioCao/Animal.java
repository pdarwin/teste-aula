package exercicioCao;
//Exercício 9
//import java.util.Scanner;

public class Animal {
	
	private String nome;
	private int idade;
	private double peso;
	
	public Animal() {
		super();
	}
	
	public Animal(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public String comunicar ()
	{
		return "Eu falo!";
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
