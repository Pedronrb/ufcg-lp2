package documin;

import documin.documento.Elemento;

public class Titulo extends Elemento{
	private int nivel;
	private boolean linkavel;
	
	public Titulo(String valor, int prioridade, int nivel, boolean linkavel) {
		super(valor, prioridade);
		this.nivel = nivel;
		this.linkavel = linkavel;
		
	}

	public String representacaoCompleta() {
		String resp = this.getPrioridade() + ". " + this.getValor();
		
		if(linkavel) {
			resp += "-- " + this.nivel + "-" + this.getValor().trim().toUpperCase(); 
		}
		return resp;
		
	}
	
	public String representacaoResumida() {
		return this.getValor().split(" ")[0];
		
	}
}
