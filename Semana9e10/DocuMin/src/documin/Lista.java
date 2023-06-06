package documin;

import documin.documento.Elemento;

public class Lista extends Elemento{
	private String separador;
	private String charLista;
	
	public Lista(String valorLista, int prioridade, String separador, String charLista) {
		super(valorLista, prioridade);
		this.separador = separador;
		this.charLista = charLista;
		
	}
	
	public String representacaoCompleta() {
		String[] lista = this.getValor().split(separador);
		String resp = "";
		for (int i = 0; i < lista.length; i++) {
			resp += charLista + " " + lista[i] + "\n";
			
		}
		return resp;
	}
	
	public String representacaoResumida() {
		String[] lista = this.getValor().split(separador);
		String resp = "";
		for (int i = 0; i < lista.length; i++) {
			if(lista[lista.length - 1] == lista[i]) {
				resp += lista[i];
			}else {
				resp += lista[i] + ", ";
			}	
		}
		return resp;
		
	}
}
