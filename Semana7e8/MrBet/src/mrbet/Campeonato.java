package mrbet;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {

	private String nome; 
	private int numParticipantes;
	private List<Time> times;
	private int numPartAdd = 0;
	
	public Campeonato(String nome, int numParticipantes ) {
		this.nome = nome;
		this.numParticipantes = numParticipantes;
		this.times = new ArrayList<>();
	}
	
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
