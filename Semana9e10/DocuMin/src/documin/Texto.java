package documin;

import documin.documento.Elemento;

public class Texto extends Elemento {
	public Texto(String valor, int prioridade) {
		super(valor, prioridade);
	}
	
	public String representacaoCompleta() {
		return this.getValor();
		
	}
	
	public String representacaoResumida() {
		return this.getValor();
		
	}

}
