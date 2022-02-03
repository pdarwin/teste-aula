package resolucaoExercicios.teste2;


public class Reboque
{

  // Atributos como protected ou como privados e utilizando os getters e setters
  // Número de transporte deveria ser único, não pode haver dois iguais, vamos ver como fazer isso nas próximas aulas
  protected int numTransporte;
  protected int numServicos;
  protected boolean isAvariado;

  // Construtor(es)
  public Reboque(int aNumTransporte) // Atributos obrigatórios são passados no construtor
  {
    numTransporte = aNumTransporte;

    // Inicialização das variáveis que não são passadas como argumentos do construtor
    numServicos = 0;
    isAvariado = false;
  }

  public void trabalhar()
  {
    if (!isAvariado) // isAvariado == false
    {
      numServicos++; // numServicos = numServicos + 1;

      // A parte do " carro/barco" poderia ficar assim para efeitos de avaliação, como dito no teste, era uma melhoria para quem acabasse cedo poder explorar e
      // definir mais objetivamente
      System.out.println("Eu, o carro/barco número " + numTransporte + " estou a trabalhar!");
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
    System.out.println("Eu, o carro/barco número " + numTransporte + " estou avariado, não poderei trabalhar!");
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
