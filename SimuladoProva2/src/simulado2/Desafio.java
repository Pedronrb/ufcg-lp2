package simulado2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class Desafio {
	private String titulo;
	private int nExecucoes = 0;
	private int progresso = 0;
	private List<Acao> acoes;
	private int nivelSatisfacao = 0;
	
	public Desafio(String titulo) {
		this.titulo = titulo;
		acoes = new ArrayList<>();
	}
	
	public void addAcao(String data, int id ) {
		for (int i = 0; i < acoes.size(); i++) {
			if(acoes.get(i).getId() == id){
				throw new IllegalArgumentException("ID repetido!");	
			}
		}
		Acao acao = new Acao(data, id);
		acoes.add(acao);
	}
	
	public String toString() {
		return "Título: " + titulo + "\n" + nExecucoes + " execuções";
	}
	
	public abstract void nivelSatisfacao();
	
	public void addProgresso(int progresso) {
		this.progresso += progresso;
	}
	
	public void addProgresso() {
		this.progresso += 10;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getnExecucoes() {
		return nExecucoes;
	}

	public void setnExecucoes(int nExecucoes) {
		this.nExecucoes = nExecucoes;
	}

	public int getProgresso() {
		return progresso;
	}

	public void setProgresso(int progresso) {
		this.progresso = progresso;
	}

	public List<Acao> getAcoes() {
		return acoes;
	}

	public void setAcoes(List<Acao> acoes) {
		this.acoes = acoes;
	}
	
	public String listarAcoesPorProgresso() {
		String resp = "";
		for (int i = 0; i < acoes.size(); i++) {
			resp += acoes.get(i).toString() + this.titulo + " - Progresso " + this.progresso + "\n"; 
			
		}
		return resp;
	}

	public int getNivelSatisfacao() {
		return nivelSatisfacao;
	}

	public void setNivelSatisfacao(int nivelSatisfacao) {
		this.nivelSatisfacao = nivelSatisfacao;
	}
	
	public boolean getIdAcao(int id) {
		for (int i = 0; i < acoes.size(); i++) {
			if(acoes.get(i).getId() == id) {
				return true;
			}
		}
		throw new NoSuchElementException();
		
	}
	
	

}

	

