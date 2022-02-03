package resolucaoExercicios.teste2;


public class Carro extends Reboque
{

  private Integer numLugaresSentados; // Integer e n�o int, porque � opcional, e pode ser null (n�o definido)
  private double pesoMaxRebocavel;

  // Construtor(es)
  public Carro(int numTransporte, double pesoMaxRebocavel)
  {
    super(numTransporte);
    this.pesoMaxRebocavel = pesoMaxRebocavel;
  }


  // Getters e Setters
  public int getNumLugaresSentados()
  {
    return numLugaresSentados;
  }

  public void setNumLugaresSentados(int numLugaresSentados)
  {
    this.numLugaresSentados = numLugaresSentados;
  }

  public double getPesoMaxRebocavel()
  {
    return pesoMaxRebocavel;
  }

  public void setPesoMaxRebocavel(double pesoMaxRebocavel)
  {
    this.pesoMaxRebocavel = pesoMaxRebocavel;
  }

}
