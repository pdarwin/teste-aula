package empresa;

public class Chefe extends Trabalhador {

	private boolean paga = true;
	
	public boolean isPaga() {
		return paga;
	}

	public void setPaga(boolean paga) {
		this.paga = paga;
	}

	public Chefe(String nome, int idade, double salario, double carteira) {
		super(nome, idade, salario, carteira);
		// TODO Auto-generated constructor stub
	}

}
