package mrbet;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsavel por gerenciar o sistema de apostas MrBet.
 * 
 * Armazena uma lista de times, campeonatos e apostas.
 * Permite realizar operacoes como cadastrar times, adicionar campeonatos,
 * fazer apostas, verificar informacoes sobre os times e campeonatos, entre outras.
 * 
 * @author Pedro Nascimento da Silva
 */
public class SistemaMrBet {
	
	private List<Time> times;
	private List<Campeonato> campeonatos;
	private List<Aposta> apostas;
	
	/**
	 * Cria um novo objeto SistemaMrBet.
	 * Inicializa as listas de times, campeonatos e apostas.
	 */
	public SistemaMrBet() {
		this.times = new ArrayList<>();
		this.campeonatos = new ArrayList<>();
		this.apostas = new ArrayList<>();
	}
	
	/**
	 * Cadastra um novo time no sistema.
	 * Verifica se o time ja existe na lista de times.
	 * Se o time ja existe, retorna a mensagem "TIME JA EXISTE!".
	 * Caso contrario, cria um novo objeto Time com o codigo, nome e mascote fornecidos.
	 * Adiciona o novo time a lista de times.
	 * Retorna a mensagem "INCLUSAO REALIZADA!".
	 *
	 * @param codigo  O código do time a ser cadastrado.
	 * @param nome    O nome do time a ser cadastrado.
	 * @param mascote O mascote do time a ser cadastrado.
	 * @return Uma mensagem indicando o resultado da inclusão.
	 */
	public String cadastrarTime(String codigo, String nome, String mascote) {
		for(Time time: times) {
			if(time.getCodigo().equals(codigo)) {
				return "TIME JA EXISTE!";
			}	
		}
		
		Time time = new Time(codigo, nome, mascote);
		times.add(time);
		return "INCLUSAO REALIZADA!";
	}
	
	/**
	 * Recupera as informacoes de um time com base no codigo fornecido.
	 * Verifica se o time com o codigo fornecido existe na lista de times.
	 * Se o time existe, retorna uma representacao em string do objeto Time.
	 * Caso contrario, retorna a mensagem "TIME NAO EXISTE!".
	 *
	 * @param codigo O codigo do time a ser recuperado.
	 * @return Uma representacao em string do objeto Time se o time existir, ou a mensagem "TIME NAO EXISTE!".
	 */
	public String recuperarTime(String codigo) {
		for(Time time: times) {
			if(time.getCodigo().equals(codigo)) {
				return time.toString();
			}
		}
		return "TIME NAO EXISTE!";
	}
	
	/**
	 * Adiciona um novo campeonato ao sistema.
	 * Verifica se o campeonato com o nome fornecido ja existe na lista de campeonatos.
	 * Se o campeonato ja existe, retorna a mensagem "CAMPEONATO JA EXISTE!".
	 * Caso contrario, cria um novo objeto Campeonato com o nome e numero de participantes fornecidos.
	 * Adiciona o novo campeonato a lista de campeonatos.
	 * Retorna a mensagem "CAMPEONATO ADICIONADO!".
	 *
	 * @param nome O nome do campeonato a ser adicionado.
	 * @param numParticipantes O numero de participantes do campeonato a ser adicionado.
	 * @return Uma mensagem indicando o resultado da adicao do campeonato.
	 */
	public String adicionarCampeonato(String nome, int numParticipantes) {
		for(Campeonato campeonato : campeonatos) {
			if(campeonato.getNome().equalsIgnoreCase(nome)) {
				return "CAMPEONATO JA EXISTE!";
			}
		}
		Campeonato campeonato = new Campeonato(nome, numParticipantes);
		campeonatos.add(campeonato);
		return "CAMPEONATO ADICIONADO!";
	}
	
	/**
	 * Adiciona um time a um campeonato especifico.
	 * Verifica se o campeonato com o nome fornecido existe na lista de campeonatos.
	 * Se o campeonato nao existe, retorna a mensagem "CAMPEONATO NAO EXISTE!".
	 * Caso contrario, verifica se o numero maximo de participantes do campeonato ja foi atingido.
	 * Se o numero maximo de participantes foi atingido, retorna a mensagem "TODOS OS TIMES DESSE CAMPEONATO JA FORAM INCLUIDOS!".
	 * Em seguida, verifica se o time ja foi incluido no campeonato.
	 * Se o time ja foi incluido, retorna a mensagem "TIME INCLUIDO NO CAMPEONATO!".
	 * Se o time nao foi incluido, verifica se o time existe na lista de times.
	 * Se o time existe, adiciona o time ao campeonato e atualiza a quantidade de campeonatos do time.
	 * Retorna a mensagem "TIME INCLUIDO NO CAMPEONATO!" se o time for adicionado com sucesso.
	 * Caso contrario, retorna a mensagem "TIME NAO EXISTE!".
	 *
	 * @param codTime O codigo do time a ser adicionado.
	 * @param nomeCamp O nome do campeonato ao qual o time sera adicionado.
	 * @return Uma mensagem indicando o resultado da adicao do time ao campeonato.
	 */
	public String addTimeEmCamp(String codTime, String nomeCamp) {
		for(Campeonato campeonato: campeonatos) {
			if(campeonato.getNome().equalsIgnoreCase(nomeCamp)) {
				if(campeonato.getNumPartAdd() == campeonato.getNumParticipantes()) {
					return "TODOS OS TIMES DESSE CAMPEONATO JA FORAM INCLUIDOS!";
				}
				for(Time time: campeonato.getTimes()) {
					if(time.getCodigo().equals(codTime)) {
						return "TIME INCLUIDO NO CAMPEONATO!";
					}
				}
				for(Time time: times) {
					if(time.getCodigo().equals(codTime)) {
						campeonato.adicionarTime(time.getCodigo(), time.getNome(), time.getMascote());	
						time.setQntdCamp(time.getQntdCamp() + 1);
						return "TIME INCLUIDO NO CAMPEONATO!";
					}
				}
				return "TIME NAO EXISTE!";
			}	
		}
		return "CAMPEONATO NAO EXISTE!";
	}
	
	/**
	 * Verifica se um time esta em um determinado campeonato.
	 * Verifica se o time com o codigo fornecido existe.
	 * Se o time nao existe, retorna a mensagem "O TIME NAO EXISTE!".
	 * Caso contrario, percorre a lista de campeonatos e verifica se o nome do campeonato corresponde ao fornecido.
	 * Se o campeonato existe, percorre a lista de times do campeonato e verifica se o codigo do time corresponde ao fornecido.
	 * Se o time esta no campeonato, retorna a mensagem "TIME ESTA NO CAMPEONATO!".
	 * Caso contrario, retorna a mensagem "O TIME NÃO ESTA NO CAMPEONATO!".
	 * Se o campeonato nao existe, retorna a mensagem "O CAMPEONATO NAO EXISTE!".
	 *
	 * @param codTime O codigo do time a ser verificado.
	 * @param nomeCamp O nome do campeonato a ser verificado.
	 * @return Uma mensagem indicando se o time esta ou nao no campeonato, ou se o campeonato nao existe.
	 */
	public String verificaTimeCamp(String codTime, String nomeCamp) {
	
		String existeTime = recuperarTime(codTime);
		if(existeTime.equals("TIME NAO EXISTE!")) {
			return "O TIME NAO EXISTE!";
		}
		
		for(Campeonato campeonato: campeonatos) {
			if(nomeCamp.equals(campeonato.getNome())) {
				for(Time time: campeonato.getTimes()) {
					if(codTime.equals(time.getCodigo())) {
						return "TIME ESTA NO CAMPEONATO!";
					}
				}
				return "O TIME NAO ESTA NO CAMPEONATO!";
			}
		}
		return "O CAMPEONATO NAO EXISTE!";
	 }
	
	/**
	 * Exibe os campeonatos em que um determinado time esta registrado.
	 * Verifica se o time com o codigo fornecido existe.
	 * Se o time nao existe, retorna a mensagem "O TIME NAO EXISTE!".
	 * Caso contrario, inicia a resposta com a string "Campeonatos do " seguido do nome do time.
	 * Em seguida, percorre a lista de times e verifica se o codigo do time corresponde ao fornecido.
	 * Se corresponder, adiciona o nome do time a resposta.
	 * Em seguida, percorre a lista de campeonatos e verifica se o time esta registrado em cada campeonato.
	 * Se o time estiver registrado no campeonato, adiciona o nome do campeonato, o numero de participantes adicionados
	 * e o numero total de participantes a resposta.
	 * Retorna a resposta contendo os campeonatos em que o time esta registrado.
	 * @param codTime O codigo do time.
	 * @return Uma string contendo os campeonatos em que o time esta registrado.
	 */
	public String exibeCamp(String codTime) {
		String existeTime = recuperarTime(codTime);
		if(existeTime.equals("TIME NAO EXISTE!")) {
			return "O TIME NAO EXISTE!";
		}
			
		String resposta = "Campeonatos do ";
		for(Time time: times) {
			if(time.getCodigo().equals(codTime)) {
				resposta += time.getNome()+ "\n"; 
			}
		}
		
		for(Campeonato campeonato: campeonatos) {
			String retorno = verificaTimeCamp(codTime, campeonato.getNome());
			if(retorno.equals("TIME ESTA NO CAMPEONATO!")) {
				resposta += "* " + campeonato.getNome() + " - " + campeonato.getNumPartAdd() + 
						"/" + campeonato.getNumParticipantes() + "\n";	
			}
		}
		return resposta;
	}
	
	/**
	 * Cria uma nova aposta para um time em um determinado campeonato.
	 * Verifica se o time esta registrado no campeonato fornecido.
	 * Se o time estiver registrado, verifica se o numero de participantes do campeonato
	 * e menor do que a colocacao fornecida na aposta. Se for, retorna a mensagem "APOSTA NAO REGISTRADA!".
	 * Caso contrario, cria uma nova instancia de Aposta com os parametros fornecidos
	 * e adiciona a aposta a lista de apostas.
	 * Se a colocacao fornecida for igual a 1, atualiza a contagem de primeira posicao do time.
	 * Retorna a mensagem "APOSTA REGISTRADA!" se a aposta for criada com sucesso.
	 * Caso contrario, retorna a mensagem "APOSTA NAO REGISTRADA!".
	 *
	 * @param codTime O codigo do time.
	 * @param nomeCamp O nome do campeonato.
	 * @param colocacao A colocacao do time na aposta.
	 * @param valorAposta O valor da aposta.
	 * @return Uma mensagem indicando o resultado da criacao da aposta.
	 */
	public String criarAposta(String codTime, String nomeCamp, int colocacao, double valorAposta ) {
		String existe = verificaTimeCamp(codTime, nomeCamp);
		if(existe.equals("TIME ESTA NO CAMPEONATO!")) {
			for(Campeonato campeonato: campeonatos) {
				if(campeonato.getNome().equals(nomeCamp)) {
					if(campeonato.getNumParticipantes() < colocacao) {
						return "APOSTA NAO REGISTRADA!"; 					}
				}
			}
			Aposta aposta = new Aposta(codTime, nomeCamp, colocacao, valorAposta);
			apostas.add(aposta);
			
			if(colocacao == 1) {
				for(Time time: times) {
					if(time.getCodigo().equals(codTime)) {
						time.setPrimeiraPosi(time.getPrimeiraPosi() + 1);
					}
				}
			}
			
			return "APOSTA REGISTRADA!";
		}	
		return "APOSTA NAO REGISTRADA!";
	}
	
	/**
	 * Retorna o status das apostas registradas.
	 * Percorre a lista de apostas e monta uma resposta contendo as informacoes de cada aposta.
	 * Para cada aposta, concatena a representacao em string da aposta, o resultado da recuperacao do time
	 * atraves do codigo da aposta, a exibicao dos campeonatos em que o time esta registrado
	 * e o valor da aposta.
	 * Retorna a resposta contendo o status das apostas registradas.
	 *
	 * @return O status das apostas registradas.
	 */
	public String statusAposta() {
		String resp = "";
		
		int j = 1;
		for(Aposta aposta: apostas) {
			resp += aposta + ". " + recuperarTime(aposta.getCodTime())
			+ "\n" + exibeCamp(aposta.getCodTime()) + "\n" + "R$ " + aposta.getValorAposta();
			j+=1;
		}
		return resp;
	}
	
	/**
	 * Retorna um relatorio contendo informacoes sobre a participacao dos times em campeonatos
	 * e sua popularidade em apostas.
	 * Cria duas listas, uma para armazenar os times com maior participacao em campeonatos
	 * e outra para armazenar os times que ainda nao participaram de nenhum campeonato.
	 * Inicializa as variaveis de controle "maior" e "menor" com o valor de participacao do primeiro time da lista.
	 * Itera sobre a lista de times e verifica se o time possui uma participacao maior ou igual ao valor "maior".
	 * Se for maior, atualiza o valor de "maior" e armazena o time com a maior participacao.
	 * Se a participacao do time for igual a 0, adiciona o time a lista de times com menos participacao.
	 * Em seguida, itera novamente sobre a lista de times e adiciona os times com a mesma participacao do time com maior participacao
	 * à lista de times com mais participacao.
	 * Monta a resposta concatenando as informacoes dos times com mais participacao em campeonatos,
	 * os times com menos participacao em campeonatos e a popularidade dos times em apostas.
	 * Retorna o relatorio completo.
	 *
	 * @return Um relatorio contendo informacoes sobre a participacao dos times em campeonatos
	 *         e sua popularidade em apostas.
	 */
	public String qntdCampTime() {
		List<Time> timesMaisCamp = new ArrayList<>();
		List<Time> timesMenosCamp = new ArrayList<>();
		String retorno = "";
		int maior = times.get(0).getQntdCamp();
		int menor = times.get(0).getQntdCamp();
		Time timeComMais = null;

		for(Time time: times) {
			if(time.getQntdCamp() >= maior  ) {
				maior = time.getQntdCamp();
				timeComMais = time;
				
			}
			else if(time.getQntdCamp() == 0) {
				menor = time.getQntdCamp();
				timesMenosCamp.add(time);
			}
		}
		
		for(Time time: times) {
			if(timeComMais.getQntdCamp() == time.getQntdCamp()) {
				timesMaisCamp.add(time);
			}
		}
		retorno += "Participacao mais frequente em campeonatos\n";
		for(Time time: timesMaisCamp) {
			 retorno += time.toString() + "\n\n";
			 
		}
		retorno += "Ainda nao participou de campeonato\n";
		for(Time time: timesMenosCamp) {
			retorno +=  time.toString() + "\n\n";
		}
		
		retorno += "Popularidade em apostas\n"; 
		for(Time time: times) {
			if(time.getPrimeiraPosi() >= 1) {
				retorno += time.getNome() + " / " + time.getPrimeiraPosi() + "\n";
			}
			 
		}
		return retorno;
	}
}
