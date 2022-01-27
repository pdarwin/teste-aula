package teste2;

public class Barco extends Reboque {
	
	private double comprimento;
	private double largura;
	
	public Barco(int aNumTransporte, double aComprimento) {
		super(aNumTransporte);
		this.comprimento = aComprimento;
	}

	public Barco(int aNumTransporte, double aComprimento, double aLargura) {
		super(aNumTransporte);
		this.comprimento = aComprimento;
		this.largura = aLargura;
	}
	
	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double aComprimento) {
		this.comprimento = aComprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double aLargura) {
		this.largura = aLargura;
	}

	@Override
	public void Trabalhar() {
		super.Trabalhar();
	}

	@Override
	public void Avariar() {
		super.Avariar();
	}

}
