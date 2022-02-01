package teste2;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements IEmpresa {

	private String nome;
	private List<Reboque> reboques = new ArrayList<Reboque>();
	
	public Empresa(String aNome) {
		super();
		this.nome = aNome;
	}
	
	public int getNumReboques ()
	{
		return reboques.size();
	}
	
	public int getNumReboquesAvariados ()
	{
		int n = 0;
		for (Reboque reboque:reboques)
		{
			if (reboque.isAvariado())
			{
				n++;
			}
		}
		return n;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public List<Reboque> getReboques() {
		return reboques;
	}

	public void setReboques(List<Reboque> aReboques) {
		this.reboques = aReboques;
	}
	
}
