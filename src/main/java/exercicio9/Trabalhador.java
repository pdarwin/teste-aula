package exercicio9;
//Exercício 9
//import java.util.Scanner;

public class Trabalhador {
	
	String nome;
	int idade;
	double salario;
	
	public Trabalhador (String aNome, double aSalario) {
		nome = aNome;
		salario = aSalario;
	}

	public Trabalhador (String aNome, int aIdade, double aSalario) {
		nome = aNome;
		idade = aIdade;
		salario = aSalario;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
}
