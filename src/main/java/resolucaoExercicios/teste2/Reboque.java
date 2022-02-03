package resolucaoExercicios.teste2;


public class Reboque
{

  // Atributos como protected ou como privados e utilizando os getters e setters
  // N�mero de transporte deveria ser �nico, n�o pode haver dois iguais, vamos ver como fazer isso nas pr�ximas aulas
  protected int numTransporte;
  protected int numServicos;
  protected boolean isAvariado;

  // Construtor(es)
  public Reboque(int aNumTransporte) // Atributos obrigat�rios s�o passados no construtor
  {
    numTransporte = aNumTransporte;

    // Inicializa��o das vari�veis que n�o s�o passadas como argumentos do construtor
    numServicos = 0;
    isAvariado = false;
  }

  public void trabalhar()
  {
    if (!isAvariado) // isAvariado == false
    {
      numServicos++; // numServicos = numServicos + 1;

      // A parte do " carro/barco" poderia ficar assim para efeitos de avalia��o, como dito no teste, era uma melhoria para quem acabasse cedo poder explorar e
      // definir mais objetivamente
      System.out.println("Eu, o carro/barco n�mero " + numTransporte + " estou a trabalhar!");
    }
    else
    {
      apresentaMensagemAvariado();
    }
  }


  public void avariar()
  {
    isAvariado = true;
    apresentaMensagemAvariado();
  }

  private void apresentaMensagemAvariado()
  {
    System.out.println("Eu, o carro/barco n�mero " + numTransporte + " estou avariado, n�o poderei trabalhar!");
  }


  public int getNumTransporte()
  {
    return numTransporte;
  }

  public int getNumServicos()
  {
    return numServicos;
  }

  public boolean isAvariado()
  {
    return isAvariado;
  }

}
