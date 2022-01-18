package empresa;

public class Divisao {
	
	private TipoDivisao tipo;
	double m2;
	int numJanelas;
	int numLugaresSentados;
	
	public Divisao(TipoDivisao tipo, double m2, int numJanelas, int numLugaresSentados) {
		super();
		this.tipo = tipo;
		this.m2 = m2;
		this.numJanelas = numJanelas;
		this.numLugaresSentados = numLugaresSentados;
	}

	public TipoDivisao getTipoDivisao() {
		return tipo;
	}

	public void setTipoDivisao(TipoDivisao tipoDivisao) {
		this.tipo = tipoDivisao;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public int getNumJanelas() {
		return numJanelas;
	}

	public void setNumJanelas(int numJanelas) {
		this.numJanelas = numJanelas;
	}

	public int getNumLugaresSentados() {
		return numLugaresSentados;
	}

	public void setNumLugaresSentados(int numLugaresSentados) {
		this.numLugaresSentados = numLugaresSentados;
	}
	
	
}
