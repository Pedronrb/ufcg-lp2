package mrbet;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um campeonato no sistema MrBet.
 * 
 * Armazena informacoes como nome, numero de participantes, lista de times participantes
 * e numero de participantes adicionados.
 * 
 * Permite acessar e modificar os atributos do campeonato.
 * 
 * @author Pedro Nascimento da Silva
 */
public class Campeonato {

	private String nome; 
	private int numParticipantes;
	private List<Time> times;
	private int numPartAdd = 0;
	
	/**
	 * Construtor da classe Campeonato.
	 * 
	 * Cria um novo objeto Campeonato com os atributos especificados.
	 *
	 * @param nome o nome do campeonato
	 * @param numParticipantes o numero de participantes do campeonato
	 */
	public Campeonato(String nome, int numParticipantes ) {
		this.nome = nome;
		this.numParticipantes = numParticipantes;
		this.times = new ArrayList<>();
	}
	
	/**
	 * Adiciona um time ao campeonato.
	 * 
	 * Cria um novo objeto Time com os atributos especificados e o adiciona a lista de times do campeonato.
	 * Incrementa o numero de participantes adicionados do campeonato.
	 *
	 * @param codigo o codigo do time a ser adicionado
	 * @param nomeTime o nome do time a ser adicionado
	 * @param mascote o mascote do time a ser adicionado
	 */
	public void adicionarTime(String codigo, String nomeTime, String mascote) {
		Time time = new Time(codigo, nomeTime, mascote);
		numPartAdd += 1;
		times.add(time);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumParticipantes() {
		return numParticipantes;
	}

	public void setNumParticipantes(int numParticipantes) {
		this.numParticipantes = numParticipantes;
	}

	public List<Time> getTimes() {
		return times;
	}

	public void setTimes(List<Time> times) {
		this.times = times;
	}

	public int getNumPartAdd() {
		return numPartAdd;
	}

	public void setNumPartAdd(int numPartAdd) {
		this.numPartAdd = numPartAdd;
	}
	
	
	
	
	
}
