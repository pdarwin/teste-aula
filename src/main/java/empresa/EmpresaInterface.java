package empresa;

public interface EmpresaInterface {

	public void pagaTrabalhadores ();
	
	public void cobraClientes (double aValor);
	
	public int getNumTrabalhadores ();

	public int getNumLugaresSentados ();

	public void addTrabalhador(Trabalhador aTrabalhador);
	
}
