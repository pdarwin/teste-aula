package empresa;

public class Divisao {
	
	private TipoDivisao tipoDivisao;
	int m2;
	int numJanelas;
	int numLugaresSentados;
	
	public Divisao(TipoDivisao tipoDivisao, int m2, int numJanelas, int numLugaresSentados) {
		super();
		this.tipoDivisao = tipoDivisao;
		this.m2 = m2;
		this.numJanelas = numJanelas;
		this.numLugaresSentados = numLugaresSentados;
	}

	public TipoDivisao getTipoDivisao() {
		return tipoDivisao;
	}

	public void setTipoDivisao(TipoDivisao tipoDivisao) {
		this.tipoDivisao = tipoDivisao;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
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
