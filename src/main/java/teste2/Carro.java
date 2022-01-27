package teste2;

public class Carro extends Reboque {

	private int numLugaresSentados;
	private double pesoMaxReb;
	
	public Carro(int aNumTransporte, double aPesoMaxReb) {
		super(aNumTransporte);
		this.pesoMaxReb = aPesoMaxReb;
	}
	
	public Carro(int numTransporte, double aPesoMaxReb, int aNumLugaresSentados) {
		super(numTransporte);
		this.pesoMaxReb = aPesoMaxReb;
		this.numLugaresSentados = aNumLugaresSentados;
	}
	
	public int getNumLugaresSentados() {
		return numLugaresSentados;
	}

	public void setNumLugaresSentados(int aNumLugaresSentados) {
		this.numLugaresSentados = aNumLugaresSentados;
	}

	public double getPesoMaxReb() {
		return this.pesoMaxReb;
	}

	public void setPesoMaxReb(double aPesoMaxReb) {
		this.pesoMaxReb = aPesoMaxReb;
	}

	public void Trabalhar() {
		// TODO Auto-generated method stub
		super.Trabalhar();
	}

	public void Avariar() {
		// TODO Auto-generated method stub
		super.Avariar();
	}

}
