package resolucaoExercicios.teste2;


public class Main
{

  public static void main(String[] args)
  {

    // Criar a empresa javaReboques
    EmpresaReboques javaReboques = new EmpresaReboques("javaReboques", 254254254);

    // Criar, por exemplo, 2 carros e 2 barcos;
    Carro carro1 = new Carro(1, 7500);
    Carro carro2 = new Carro(2, 5000);

    Barco barco1 = new Barco(3, 30);
    Barco barco2 = new Barco(4, 50);


    // Associar os reboques criados � empresa
    javaReboques.addReboque(carro1);
    javaReboques.addReboque(carro2);
    javaReboques.addReboque(barco1);
    javaReboques.addReboque(barco2);


    // Obter o n�mero total de reboques que a empresa tem
    System.out.println("A empresa tem " + javaReboques.getNumReboques() + " reboques!");
    System.out.println("\n"); // Apenas serve para separar e identificar melhor na consola

    // Colocar todos os reboques a trabalhar
    // Poderia ser feita uma fun��o dentro da classe EmpresaReboques ou atrav�s de um for/foreach
    javaReboques.todosReboquesTrabalhar();
    System.out.println("\n");


    // Definir que um reboque qualquer est� avariado
    javaReboques.getReboques().get(1).avariar();
    System.out.println("\n");


    // Colocar todos os reboques a trabalhar novamente
    javaReboques.todosReboquesTrabalhar();
    System.out.println("\n");


    // Validar o n�mero de servi�os de cada reboque
    // Poderia ser feita uma fun��o dentro da classe EmpresaReboques ou ser assim
    for (Reboque reb : javaReboques.getReboques())
    {
      System.out.println("Eu, o carro/barco n�mero " + reb.getNumTransporte() + " efectuei " + reb.getNumServicos() + " servi�os!");
    }
  }
}
