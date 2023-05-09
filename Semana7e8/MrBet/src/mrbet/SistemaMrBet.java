package mrbet;

import java.util.ArrayList;
import java.util.List;

public class SistemaMrBet {
	
	private List<Time> times;
	private List<Campeonato> campeonatos;
	private List<Aposta> apostas;
	
	public SistemaMrBet() {
		this.times = new ArrayList<>();
		this.campeonatos = new ArrayList<>();
		this.apostas = new ArrayList<>();

	}
	
	public String cadastrarTime(String codigo, String nome, String mascote) {
		for(Time time: times) {
			if(time.getCodigo().equals(codigo)) {
				return "TIME JÁ EXISTE!";
			}	
		}
		
		Time time = new Time(codigo, nome, mascote);
		times.add(time);
		return "INCLUSÃO REALIZADA!";
	}
	
	public String recuperarTime(String codigo) {
		for(Time time: times) {
			if(time.getCodigo().equals(codigo)) {
				return time.toString();
			}
		}
		return "TIME NÃO EXISTE!";
	}
	
	public String adicionarCampeonato(String nome, int numParticipantes) {
		for(Campeonato campeonato : campeonatos) {
			if(campeonato.getNome().equalsIgnoreCase(nome)) {
				return "CAMPEONATO JÁ EXISTE!";
			}
		}
		Campeonato campeonato = new Campeonato(nome, numParticipantes);
		campeonatos.add(campeonato);
		return "CAMPEONATO ADICIONADO!";
	}
	
	public String addTimeEmCamp(String codTime, String nomeCamp) {
		for(Campeonato campeonato: campeonatos) {
			if(campeonato.getNome().equalsIgnoreCase(nomeCamp)) {
				if(campeonato.getNumPartAdd() == campeonato.getNumParticipantes()) {
					return "TODOS OS TIMES DESSE CAMPEONATO JÁ FORAM INCLUÍDOS!";
				}
				for(Time time: times) {
					if(time.getCodigo().equals(codTime)) {
						campeonato.adicionarTime(time.getCodigo(), time.getNome(), time.getMascote());	
						return "TIME INCLUÍDO NO CAMPEONATO!";
					}
				}
				return "TIME NÃO EXISTE!";
			}	
		}
		return "CAMPEONATO NÃO EXISTE!";
	}
	
	public String verificaTimeCamp(String codTime, String nomeCamp) {
	
		String existeTime = recuperarTime(codTime);
		if(existeTime.equals("TIME NÃO EXISTE!")) {
			return "O TIME NÃO EXISTE!";
		}
		
		for(Campeonato campeonato: campeonatos) {
			if(nomeCamp.equals(campeonato.getNome())) {
				for(Time time: campeonato.getTimes()) {
					if(codTime.equals(time.getCodigo())) {
						return "TIME ESTÁ NO CAMPEONATO!";
					}
				}
				return "O TIME NÃO ESTÁ NO CAMPEONATO!";
			}
		}
		return "O CAMPEONATO NÃO EXISTE!";
	}
	
	public String exibeCamp(String codTime) {
		String existeTime = recuperarTime(codTime);
		if(existeTime.equals("TIME NÃO EXISTE!")) {
			return "O TIME NÃO EXISTE!";
		}
			
		String resposta = "Campeonatos do ";
		for(Time time: times) {
			if(time.getCodigo().equals(codTime)) {
				resposta += time.getNome()+ "\n"; 
			}
		}
		
		for(Campeonato campeonato: campeonatos) {
			String retorno = verificaTimeCamp(codTime, campeonato.getNome());
			if(retorno.equals("TIME ESTÁ NO CAMPEONATO!")) {
				resposta += "* " + campeonato.getNome() + " - " + campeonato.getNumPartAdd() + 
						"/" + campeonato.getNumParticipantes() + "\n";	
			}
		}
		return resposta;
	}
	
	public String criarAposta(String codTime, String nomeCamp, int colocacao, double valorAposta ) {
		String existe = verificaTimeCamp(codTime, nomeCamp);
		if(existe.equals("TIME ESTÁ NO CAMPEONATO!")) {
			for(Campeonato campeonato: campeonatos) {
				if(campeonato.getNome().equals(nomeCamp)) {
					if(campeonato.getNumParticipantes() < colocacao) {
						return "APOSTA NÃO REGISTRADA!"; 					}
				}
			}
			Aposta aposta = new Aposta(codTime, nomeCamp, colocacao, valorAposta);
			apostas.add(aposta);
			return"APOSTA REGISTRADA!";
		}	
		return "APOSTA NÃO REGISTRADA!";
	}
	
	public String statusAposta() {
		String resp = "";
		
		/*for(int i=0; i < apostas.size(); i++){
			resp += (i+1) + ". " + recuperarTime(apostas.get(i).getCodTime()) + "\n" + 
		exibeCamp(apostas.get(i).getCodTime()) + "\n" +  apostas.get(i).getValorAposta();	
		}
		*/
		
		int j = 1;
		for(Aposta aposta: apostas) {
			resp += j + ". " + recuperarTime(aposta.getCodTime())
			+ "\n" + exibeCamp(aposta.getCodTime()) + "\n" + "R$ " + aposta.getValorAposta();
			j+=1;
		}
		return resp;
	}
}
