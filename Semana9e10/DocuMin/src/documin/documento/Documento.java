package documin.documento;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import documin.Lista;
import documin.Termo;
import documin.Texto;
import documin.Titulo;

public class Documento {

	private String titulo;
	private int tamanho;
	private List<Elemento> elementos;
	
	public Documento(String titulo, int tamanho) {
		this.titulo = titulo;
		this.tamanho = tamanho;
		this.elementos = new ArrayList<>();
	}
	
	public Documento(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int contarElementos() {
		return elementos.size();
	}
	

	
	public int criarTexto(String valor, int prioridade) {
		Elemento elemento = new Texto(valor, prioridade);
		elementos.add(elemento);
		return elementos.lastIndexOf(elemento);
	}
	
	public int criarTitulo(String valor, int prioridade, int nivel, boolean linkavel) {
		Elemento elemento = new Titulo(valor, prioridade, nivel, linkavel);
		elementos.add(elemento);
		return elementos.lastIndexOf(elemento);
	}
	
	public int criarLista(String valorLista, int prioridade, String separador, String charLista) {
		Elemento elemento = new Lista(valorLista, prioridade, separador, charLista);
		elementos.add(elemento);
		return elementos.lastIndexOf(elemento);
	}
	
	public int criarTermos(String valorTermo, int prioridade, String separador, String ordem) {
		Elemento elemento = new Termo(valorTermo, prioridade, separador, ordem);
		elementos.add(elemento);
		return elementos.lastIndexOf(elemento);
	}
	
	public void moverElementoAcima(int elemento) {
		if(elemento != 0) {
			for (int i = 0; i < elementos.size(); i++) {
				if(i == elemento) {
					Elemento elementoSubstituido = elementos.set(i--, elementos.get(elemento));
					elementos.set(i, elementoSubstituido);
				}
			}
		}
	}
	
	public void moverElementoAbaixo(int elemento) {
		if(elemento != 0) {
			for (int i = 0; i < elementos.size(); i++) {
				if(i == elemento) {
					Elemento elementoSubstituido = elementos.set(i++, elementos.get(elemento));
					elementos.set(i, elementoSubstituido);
				}
			}
		}
	}
	
	public boolean removeElemento(int elemento) {
		for (int i = 0; i < elementos.size(); i++) {
			if(i == elemento) {
				elementos.remove(elemento);
				return true;
			}
		}
		throw new NoSuchElementException();
		
	}
	
	public String representacaoCompleta(int posicao) {
		for (int i = 0; i < elementos.size(); i++) {
			if(i == posicao) {
				return elementos.get(i).representacaoCompleta();
			}
		}
		throw new NoSuchElementException();
	}
	
	public String representacaoResumida(int posicao) {
		for (int i = 0; i < elementos.size(); i++) {
			if(i == posicao) {
				return elementos.get(i).representacaoResumida();
			}
		}
		throw new NoSuchElementException();
}
	
	public String[] exibeElementos() {
		String[] resp = new String[elementos.size()];
		
		for (int i = 0; i < elementos.size(); i++) {
			resp[i] = elementos.get(i).representacaoCompleta() + "\n\n";
		}
		return resp;
	}
	
	
	
}
