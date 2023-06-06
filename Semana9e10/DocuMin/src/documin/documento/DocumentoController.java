package documin.documento;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DocumentoController {
	
	private List<Documento> documentos;
	
	
	public DocumentoController() {
		this.documentos = new ArrayList<>();
	}
	
	public boolean criarDocumento(String titulo) {
		if(existeDocumento(titulo) != - 1) {
			throw new NoSuchElementException();
		}
		
		Documento d = new Documento(titulo);
		documentos.add(d);
		return true;
	}
	
	public boolean criarDocumento(String titulo, int tamanho) {
		if(tamanho <= 0) {
			throw new IllegalArgumentException("Tamanho menor ou igual a zero");
		}
		return criarDocumento(titulo);
	}
	
	public void removerDocumento(String titulo) {
		int i = existeDocumento(titulo);
		
		if(i != -1) {
			documentos.remove(documentos.get(i));
		}
	}
	
	public int numeroElementos(String titulo) {
		int i = existeDocumento(titulo);
		
			if(i != -1) {
				return documentos.get(i).contarElementos();
			}
		throw new NoSuchElementException();
	}
	
	private int existeDocumento(String tituloDoc) {
		if(tituloDoc.equals("") || tituloDoc.trim().equals("")) {
			throw new IllegalArgumentException("Título vazio ou só contendo espaços");
		} 
		
		for (int i = 0; i < documentos.size(); i++) {
			if(tituloDoc.equals(documentos.get(i).getTitulo())) {
				return i;
			}
		}
		return -1;
	}
	
	public int criarTexto(String tituloDoc, String valor, int prioridade) {
		int i = existeDocumento(tituloDoc);
		
		if(i != -1){
			return documentos.get(i).criarTexto(valor, prioridade);
		}
		throw new NoSuchElementException();
	}
	
	public int criarTitulo(String tituloDoc, String valor, int prioridade, int nivel, boolean linkavel) {
		int i = existeDocumento(tituloDoc);
		
		if(i != -1){
			return documentos.get(i).criarTitulo(valor, prioridade, nivel, linkavel);
		}
		throw new NoSuchElementException();
	}
	
	public int criarLista(String tituloDoc, String valorLista, int prioridade, String separador, String charLista) {
		int i = existeDocumento(tituloDoc);
		
		if(i != -1){
			return documentos.get(i).criarLista(valorLista, prioridade, separador, charLista);
		}
		throw new NoSuchElementException();
	}
	
	public int criarTermos(String tituloDoc, String valorTermo, int prioridade, String separador, String ordem) {
		int i = existeDocumento(tituloDoc);
		
		if(i != -1){
			return documentos.get(i).criarTermos(valorTermo, prioridade, separador, ordem);
		}
		throw new NoSuchElementException();
	}
	
	public String representacaoCompleta(String tituloDoc, int posicao) {
		int i = existeDocumento(tituloDoc);
		
		if(i != -1){
			return documentos.get(i).representacaoCompleta(posicao);
		}
		throw new NoSuchElementException();
	}
	
	public String representacaoResumida(String tituloDoc, int posicao) {
		int i = existeDocumento(tituloDoc);
		
		if(i != -1){
			return documentos.get(i).representacaoResumida(posicao);
		}
		throw new NoSuchElementException();
	}
	
	public boolean removerElemento(String tituloDoc, int posicao) {
		int i = existeDocumento(tituloDoc);
		
		if(i != -1){
			return documentos.get(i).removeElemento(posicao);
		}
		throw new NoSuchElementException();
	}
	
	public void moverParaCima(String tituloDoc, int posicao) {
		int i = existeDocumento(tituloDoc);
		
		if(i != -1){
			documentos.get(i).moverElementoAcima(posicao);
		}
	}

	public void moverParaBaixo(String tituloDoc, int posicao) {
		int i = existeDocumento(tituloDoc);
		
		if(i != -1){
			documentos.get(i).moverElementoAbaixo(posicao);
		}
	}
	
	public String[] exibeElemento(String titulo) {
		int i = existeDocumento(titulo);
		
		if(i != -1) {
			 return documentos.get(i).exibeElementos();
		}
		throw new NoSuchElementException();
	}
	
	
}

