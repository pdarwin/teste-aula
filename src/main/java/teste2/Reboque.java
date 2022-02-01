package teste2;

public abstract class Reboque {
	
	private int numTransporte;
	private int numServicos;
	private boolean avariado;
	
	public Reboque(int aNumTransporte) {
		super();
		this.numTransporte = aNumTransporte;
		this.numServicos = 0;
		this.avariado = false;
	}
		
	public void trabalhar ()
	{
		String tipoReboque = "";
		
		if (this instanceof Carro)
		{
			tipoReboque = "carro";
		}
		else if (this instanceof Barco) 
		{
			tipoReboque = "barco";
		}
			
		if (avariado != true)
		{
			numServicos++;
			System.out.println("Eu, " + tipoReboque + " número " + String.format("%03d", numTransporte) + " estou a trabalhar.");
		}
		else 
		{
			System.out.println("Eu, " +  tipoReboque + " número " + String.format("%03d", numTransporte) + " estou avariado, não poderei trabalhar!");
		}
		
	}
	
	public void avariar ()
	{
		avariado = true;
	}
	
	public int getNumTransporte() {
		return numTransporte;
	}



	public void setNumTransporte(int aNumTransporte) {
		this.numTransporte = aNumTransporte;
	}



	public int getNumServicos() {
		return numServicos;
	}



	public void setNumServicos(int aNumServicos) {
		this.numServicos = aNumServicos;
	}

	
	public boolean isAvariado() {
		return avariado;
	}


	public void setAvariado(boolean aAvariado) {
		this.avariado = aAvariado;
	}
}
