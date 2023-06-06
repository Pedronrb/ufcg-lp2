package documin;

import documin.documento.DocumentoController;

public class Facade {
	
	private DocumentoController documentoController;
	
	public Facade() {
		this.documentoController = new DocumentoController();
	} 
	
	public boolean criarDocumento(String titulo) {
		return this.documentoController.criarDocumento(titulo);
		  
	}
	
	public boolean criarDocumento(String titulo, int tamanhoMaximo) {
		return this.documentoController.criarDocumento(titulo, tamanhoMaximo);
		  
	}
	
	public void removerDocumento(String titulo) {
		this.documentoController.removerDocumento(titulo);
	}
	
	public int contarElemento(String titulo) {
		return this.documentoController.numeroElementos(titulo);
	}
	
	public int criarTexto(String tituloDoc, String valor, int prioridade) {
		return documentoController.criarTexto(tituloDoc, valor, prioridade);
		  
	}
	
	public int criarTitulo(String tituloDoc, String valor, int prioridade, int nivel, boolean linkavel) {
		return documentoController.criarTitulo(tituloDoc, valor, prioridade, nivel, linkavel);
	}
	
	public int criarLista(String tituloDoc, String valorLista, int prioridade, String separador, String charLista) {
		return documentoController.criarLista(tituloDoc, valorLista, prioridade, separador, charLista);
	}
	
	public int criarTermos(String tituloDoc, String valorTermo, int prioridade, String separador, String ordem) {
		return documentoController.criarTermos(tituloDoc, valorTermo, prioridade, separador, ordem);

	}

	public String pegarRepresentacaoCompleta(String tituloDoc, int elementoPosicao) {
		return documentoController.representacaoCompleta(tituloDoc, elementoPosicao);
		
	}
	
	public String pegarrepresentacaoResumida(String tituloDoc, int elementoPosicao) {
		return documentoController.representacaoResumida(tituloDoc, elementoPosicao);
		
	}
	
	public boolean apagarElemento(String tituloDoc, int elementoPosicao) {
		return documentoController.removerElemento(tituloDoc, elementoPosicao);
	}
	
	
	public void moverParaCima(String tituloDoc, int elementoPosicao) {
		documentoController.moverParaCima(tituloDoc, elementoPosicao);
	}
	
	public void moverParaBaixo(String tituloDoc, int elementoPosicao) {
		documentoController.moverParaBaixo(tituloDoc, elementoPosicao);
	}
	
	public String[] exibirDocumento(String titulo) {
		return documentoController.exibeElemento(titulo);
	}
	
	
	
	
}

