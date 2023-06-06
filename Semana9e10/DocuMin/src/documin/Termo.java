package documin;

import java.util.Arrays;
import documin.documento.Elemento;

public class Termo extends Elemento{
	
	private String separator;
	private String ordem;
	
	public Termo(String valorTermos, int prioridade, String separador, String ordem) {
		super(valorTermos, prioridade);
		this.separator = separador;
		this.ordem = ordem;
	}
	
	private String[] ordenaLista() {
		String[] lista = this.getValor().split(separator);
		
		if(ordem.equals("ALFABÉTICA")) {
			Arrays.sort(lista);
		}
		else if(ordem.equals("TAMANHO")) {
	        Arrays.sort(lista, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

		}
		return lista;
	}
	
	public String representacaoCompleta() {
		String[] lista = ordenaLista();
		String resp = "Total termos: " + lista.length + "\n - ";
	
		for (int i = 0; i < lista.length; i++) {
			if (lista[lista.length - 1] == lista[i]) {
				resp += lista[i]; 
			}
			else {
				resp += lista[i] + ", "; 
			}
		}
		return resp;
	}
	
	public String representacaoResumida() {
		String[] lista = ordenaLista();
		String resp = "";
		for (int i = 0; i < lista.length; i++) {
			if(lista[lista.length - 1] == lista[i]) {
				resp += lista[i];
			}else {
				resp += lista[i] + " " + this.separator + " ";		
			}			
		}
		return resp;
	}
}
