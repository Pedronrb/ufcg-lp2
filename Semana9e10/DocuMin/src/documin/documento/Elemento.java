package documin.documento;

import java.util.HashMap;

import java.util.Map;

public abstract class Elemento {
	private String valor;
	private Map<String, String> propriedades;
	private int prioridade; // Tem prioridade de menor prioridade é 1 ao maior é 5
	
	public Elemento(String valor, int prioridade) {
		this.propriedades = new HashMap<String,String>();
		this.valor = valor;
		this.prioridade = prioridade;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Map<String, String> getPropriedades() {
		return propriedades;
	}

	public void setPropriedades(Map<String, String> propriedades) {
		this.propriedades = propriedades;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public abstract String representacaoCompleta();
	public abstract String representacaoResumida();
	
}
