package agenda;

/**
*Representa um contato na agenda.
*@author Pedro Nascimento da Silva
*/
public class Contato {
	
	private int posicao;
	private String nome;
	private String sobrenome;
	private String telefone;
	
	/**
	*Cria um novo contato com as informacoes fornecidas.
	*@param posicaoRec a posicao do contato na agenda.
	*@param nomeRec o primeiro nome do contato.
	*@param sobrenomeRec o sobrenome do contato.
	*@param telefoneRec o telefone do contato.
	*/
	 public Contato(int posicaoRec, String nomeRec, String sobrenomeRec, String telefoneRec) {
		 this.posicao = posicaoRec;
		 this.nome = nomeRec;
		 this.sobrenome = sobrenomeRec;
		 this.telefone = telefoneRec;
	 }
	 
	 
	 public int getPosicao() {
			return posicao;
		}

		public void setPosicao(int posicao) {
			this.posicao = posicao;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		/**
		*Retorna uma representacao em string do contato, no formato "nome sobrenome\ntelefone".
		*/
		@Override
		public String toString() {		
			return nome + " " + sobrenome + "\n" + telefone;
		}
}
