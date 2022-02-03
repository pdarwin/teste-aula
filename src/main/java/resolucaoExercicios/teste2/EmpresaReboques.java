package resolucaoExercicios.teste2;


import java.util.ArrayList;
import java.util.List;


public class EmpresaReboques implements IEmpresaReboques
{

  private String nome;
  private int nif;
  private List<Reboque> reboques;

  public EmpresaReboques(String aNome, int aNif)
  {
    nome = aNome;
    nif = aNif;

    // Inicialização das variáveis que não são passadas como argumentos do construtor
    reboques = new ArrayList<Reboque>();
  }

  @Override
  public int getNumReboques()
  {
    return reboques.size();
  }

  @Override
  public int getNumReboquesAvariados()
  {
    int numAvariados = 0;

    for (Reboque reboque : reboques)
    {
      if (reboque.isAvariado)
      {
        numAvariados += 1;
      }
    }
    return numAvariados;
  }

  public void todosReboquesTrabalhar()
  {
    for (Reboque reboque : reboques)
    {
      reboque.trabalhar();
    }
  }

  public void addReboque(Reboque aReboque)
  {
    reboques.add(aReboque);
  }

  public List<Reboque> getReboques()
  {
    return reboques;
  }


  // Getters e Setters
  public String getNome()
  {
    return nome;
  }

  public void setNome(String aNome)
  {
    nome = aNome;
  }

  public int getNif()
  {
    return nif;
  }

  public void setNif(int aNif)
  {
    nif = aNif;
  }



}
