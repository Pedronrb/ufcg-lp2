package agenda;

/** 
 * Representa uma agenda de contatos.
 * A agenda pode armazenar ate 100 contatos e ate 10 contatos favoritos.
 * A classe fornece metodos para cadastrar contatos, adicionar contatos aos favoritos, exibir contatos e listar contatos.
 * @author nazareno
 * @author Pedro Nascimento da Silva
 */
public class Agenda {
	
	private static final int TAMANHO_AGENDA = 100;
	private static final int TAMANHO_FAVORITO = 10;
	
	private Contato[] favoritos;
	private Contato[] contatos; //apenas uma simplificacao de contato

	/**
	 * Cria uma nova agenda, inicializando as listas de contatos e favoritos.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
		this.favoritos = new Contato[TAMANHO_FAVORITO];
	}
	
	/**
	 * Acessa a lista de contatos mantida.
	 * @return O array de contatos.
	 */
	public Contato[] getContatos() {
		return this.contatos.clone();
	}

	/**
	 * Acessa os dados de um contato especifico.
	 * @param posicao Posicao do contato na agenda.
	 * @return Dados do contato. Null se nao ha contato na posicao.
	 */
	public Contato getContato(int posicao) {
		return contatos[posicao];
	}

	/**
	 * Cadastra um contato em uma posicao. Um cadastro em uma posicao que ja existe sobrescreve o anterior. 
	 * @param posicao Posicao do contato.
	 * @param nome Nome do contato.
	 * @param sobrenome Sobrenome do contato.
	 * @param telefone Telefone do contato.
	 */
	public String cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		
		if(posicao < 1 || posicao > 100) {
			return "POSICAO INVALIDA";
		}
		
		if((nome.isEmpty() || nome.equals("")) || (telefone.isEmpty() || telefone.equals(""))) {
			return "CONTATO INVALIDO";
		}
		
		if(! equals(nome, sobrenome)) {
			Contato novoContato = new Contato(posicao, nome, sobrenome, telefone);
			this.contatos[posicao - 1] = novoContato ;	
			return "CADASTRO REALIZADO";
		}
		return "CONTATO JA CADASTRADO";
		
	}
	
	/**
	*Verifica se ha algum contato na lista de contatos com o nome e sobrenome especificados.
	*@param nome o nome a ser verificado
	*@param sobrenome o sobrenome a ser verificado
	*@return true se houver um contato com o nome e sobrenome especificados, false caso contrario
	*/
	public boolean equals(String nome, String sobrenome) {	
		for (int i=0; i < contatos.length; i++) {
			if(contatos[i] != null && nome.equalsIgnoreCase(contatos[i].getNome()) && 
					sobrenome.equalsIgnoreCase(contatos[i].getSobrenome())) {
				return true;
			}
		}
		return false;
	}
	
	/**
	*Retorna uma string que representa o contato na posicao especificada.
	*@param posicao a posicao do contato a ser exibido
	*@return uma string que representa o contato na posicao especificada ou "POSICAO INVALIDA!" se a posicao for invalida ou o contato nao existir
	*/
	public String exibeContato(int posicao) {
		if(posicao < 1 || posicao > 100 || contatos[posicao - 1] == null) {
			return "POSICAO INVALIDA!";
		}
		return contatos[posicao - 1].toString();			
	}
	
	/**
	*Retorna uma string que lista todos os contatos existentes na lista de contatos.
	*@return uma string que lista todos os contatos existentes na lista de contatos, no formato "posicao - nome sobrenome", onde posicao e o numero da posicao do contato na lista (1 a 100)
	*/
	public String listarContatos() {
		String retornoContatos = "";
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null) {
				retornoContatos += String.valueOf(i+1) + " - " + contatos[i].getNome() + " " + contatos[i].getSobrenome() + "\n";
			}
		}
		return retornoContatos;
	}
	
	/**
	*Adiciona um contato da lista de contatos aos favoritos na posicao especificada.
	*@param contato o numero do contato na lista de contatos a ser adicionado aos favoritos
	*@param posicao a posicao em que o contato deve ser adicionado na lista de favoritos (1 a 10)
	*@return uma string informando que o contato foi favoritado na posicao especificada e adicionando um coracao (<3) antes do nome do contato na lista de contatos
	*/
	public String adicionarFavoritos(int contato, int posicao) {
		favoritos[posicao - 1] = contatos[contato - 1];
		contatos[posicao - 1].setNome("<3 " + contatos[posicao - 1].getNome());
		return "CONTATO FAVORITADO NA POSICAO " + posicao + "!";	
	}
	
	/**
	*Retorna uma string que lista todos os contatos favoritados na lista de favoritos.
	*@return uma string que lista todos os contatos favoritados na lista de favoritos, no formato "posicao - nome sobrenome",
	*onde posicao é o numero da posicao do contato favoritado na lista de favoritos (1 a 10)
	*/
	public String listarFavoritos() {
		String retornoFavoritos = "";
		for(int i = 0; i < favoritos.length; i++) {
			if(favoritos[i] != null) {
				retornoFavoritos += String.valueOf(i+1) + " - " + favoritos[i].getNome() + " " + favoritos[i].getSobrenome() + "\n";
			}
			
		}
		return retornoFavoritos;
	}
	
	/**
	*Remove o contato favoritado na posicao especificada da lista de favoritos.
	*@param posicao a posicao em que o contato favoritado deve ser removido na lista de favoritos (1 a 10)
	*/
	public void removerFavoritos(int posicao) {
		contatos[posicao - 1].setNome(contatos[posicao - 1].getNome().split(" ")[1]);
		favoritos[posicao - 1] = null;
	}
}