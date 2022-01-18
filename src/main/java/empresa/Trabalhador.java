package empresa;

public class Trabalhador implements TrabalhadorInterface {

	private String nome;
	private int idade;
	private double salario; 
	private double carteira;
	
	public Trabalhador(String nome, int idade, double salario, double carteira) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.carteira = carteira; // dinheiro q o trabalhador tem
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

	public double getCarteira() {
		return carteira;
	}

	public void setCarteira(double carteira) {
		this.carteira = carteira;
	}

	@Override
	public void trabalha() {
		// TODO Auto-generated method stub
		System.out.print("O " + nome + "está a trabalhar.");
		
	}

	@Override
	public void recebeSalario(double aSalario) {
		// TODO Auto-generated method stub
		carteira+= aSalario;
		
	}
	
	
	
}
