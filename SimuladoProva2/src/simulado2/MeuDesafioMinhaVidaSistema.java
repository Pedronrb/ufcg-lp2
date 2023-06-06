package simulado2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MeuDesafioMinhaVidaSistema {
	private List<Desafio> desafios;
	
	public MeuDesafioMinhaVidaSistema() {
		desafios = new ArrayList<>();
	}
	
	public int addDesafio(String nomeDesafio) {
		for (int i = 0; i < desafios.size(); i++) {
			if(desafios.get(i).getTitulo().equals(nomeDesafio)) {
				throw new NoSuchElementException();
			}
		}
		Desafio desafio = new Material(nomeDesafio);
		desafios.add(desafio);
		return desafios.lastIndexOf(desafio) +1;
	}
	
	public String exibirDesafio(int posicao) {
		if(existePosicao(posicao)) {
			return desafios.get(posicao).toString(); 
		}
		throw new NoSuchElementException();
	}
	
	
	public boolean existePosicao(int posicao) {
		if(posicao < 0 || posicao > desafios.size()) {
			return false;
		}
		return true;
	}
	
	public void addAcao(int posicao, String data, int id) {
		if(existePosicao(posicao)) {
			desafios.get(posicao).addAcao(data, id);
		}
		else {
			throw new NoSuchElementException();
		}
	}
	
	public String listarAcoes() {
		String resp = "";
		for (int i = 0; i < desafios.size(); i++) {
			resp += desafios.get(i).listarAcoesPorProgresso() + "\n";
		}
		return resp;
	}
	
	public void atualizaProgresso(int id, int progresso) {
		for (int i = 0; i < desafios.size(); i++) {
			if(desafios.get(i).getIdAcao(id)) {
				desafios.get(i).addProgresso(progresso);
				if(desafios.get(i).getProgresso() >= 100) {
					desafios.get(i).setnExecucoes(desafios.get(i).getnExecucoes() +1);
					desafios.get(i).nivelSatisfacao();
				}
				
			}
		
			
			
		}
		
		
	}
	
	public void atualizaProgresso(int id) {
		for (int i = 0; i < desafios.size(); i++) {
			if(desafios.get(i).getIdAcao(id)) {
				desafios.get(i).addProgresso();
			}
		}
	}
	
	
}
