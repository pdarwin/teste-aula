package empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Divisao wc = new Divisao(TipoDivisao.WC,10, 1, 2);
		Divisao sala = new Divisao(TipoDivisao.QUARTO,40, 5, 20);
		Divisao gabinete = new Divisao(TipoDivisao.ESCRITORIO,30, 2, 5);
		Divisao cozinha = new Divisao(TipoDivisao.COZINHA,17.3, 3, 10);
		
		List <Divisao> divisoes = new ArrayList<Divisao>();
		
		divisoes.add(wc);
		divisoes.add(sala);
		divisoes.add(gabinete);
		divisoes.add(cozinha);
		
		Empresa pastelaria = new Empresa("Casa dos Bolos", 0, "Rua das Flores", 101999101, divisoes);
		
		Trabalhador t0 = new Trabalhador("José Ramiro", 50, 1050, 0);
		Trabalhador t1 = new Trabalhador("Clara de Sousa", 45, 2050, 0);
		
		System.out.print("Circular, circular, nada para ver aqui!");
		
	}

}
