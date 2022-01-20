package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements EmpresaInterface {

	private String nome;
	private double caixa;
	private String morada;
	private int nif;
	private List<Trabalhador> listaTrabalhadores;
	private List<Divisao> listaDivisoes;
	
	
	public Empresa(String nome, double caixa, String morada, int nif,List<Divisao> listaDivisoes) {
		super();
		this.nome = nome;
		this.caixa = caixa;
		this.morada = morada;
		this.nif = nif;
		this.listaDivisoes = listaDivisoes;
		
		listaTrabalhadores = new ArrayList<Trabalhador>();
	}

	@Override
	public void pagaTrabalhadores() {
		// TODO Auto-generated method stub
		
		double total =0;
		
		for (Trabalhador trabalhador:listaTrabalhadores)
		{
		
			total += trabalhador.getSalario();
		}
		
		if (total <= caixa)
		{
			for (Trabalhador trabalhador:listaTrabalhadores) 
			{
				trabalhador.recebeSalario();
				caixa -= trabalhador.getSalario();
			}
		}
		else
		{	
			System.out.println("Não há dinheiro em caixa suficiente para pagar aos trabalhadores!\nOs safados estão a rapar " + 
					total + " € cada mês.\n\nPrima 1 para extorquir dinheiro a um cliente\nPrima 2 para despedir trabalhadores\nPrima 3 para iniciar processo de falência");
		}
		
	}

	@Override
	public void cobraClientes(double aValor) {
		// TODO Auto-generated method stub
		caixa += aValor;
	}

	@Override
	public int getNumTrabalhadores() {
		// TODO Auto-generated method stub
		return listaTrabalhadores.size();
		
	}

	@Override
	public int getNumLugaresSentados() {
		// TODO Auto-generated method stub
		int nLugares = 0;
		
		for (Divisao divisao:listaDivisoes) 
		{
			nLugares += divisao.getNumLugaresSentados();
		}
		return nLugares;
	}
	
	@Override
	public void addTrabalhador(Trabalhador aTrabalhador) {
		// TODO Auto-generated method stub
		listaTrabalhadores.add(aTrabalhador);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCaixa() {
		return caixa;
	}

	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public int getNif() {
		return nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}

	public List<Trabalhador> getListaTrabalhadores() {
		return listaTrabalhadores;
	}

	public void setListaTrabalhadores(List<Trabalhador> listaTrabalhadores) {
		this.listaTrabalhadores = listaTrabalhadores;
	}

	public List<Divisao> getListaDivisao() {
		return listaDivisoes;
	}

	public void setListaDivisao(List<Divisao> listaDivisoes) {
		this.listaDivisoes = listaDivisoes;
	}	
	
	
}
