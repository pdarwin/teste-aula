package resolucaoExercicios.teste2;


public class Barco extends Reboque
{

  private double comprimento;
  private Double largura; // Double e não double, porque é opcional, e pode ser null (não definido)

  // Construtor(es)
  public Barco(int numTransporte, double comprimento)
  {
    super(numTransporte);
    this.comprimento = comprimento;
  }


  // Getters e Setters
  public double getComprimento()
  {
    return comprimento;
  }

  public void setComprimento(double aComprimento)
  {
    comprimento = aComprimento;
  }

  public double getLargura()
  {
    return largura;
  }

  public void setLargura(double aLargura)
  {
    largura = aLargura;
  }

}
