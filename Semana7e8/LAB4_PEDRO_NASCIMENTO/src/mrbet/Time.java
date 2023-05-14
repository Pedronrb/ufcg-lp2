package mrbet;

/**
 * Classe que representa um time no sistema MrBet.
 * 
 * Armazena informacoes como codigo, nome, mascote, quantidade de campeonatos em que o time participou
 * e quantidade de vezes em que o time ficou em primeira posicao nas apostas.
 * Permite acessar e modificar os atributos do time.
 * 
 * @author Pedro Nascimento da Silva
 */
public class Time {

	String codigo;
	String nome; 
	String mascote; 
	int qntdCamp = 0;
	int primeiraPosi = 0;
	
	/**
	 * Construtor da classe Time.
	 * 
	 * Cria um novo objeto Time com os atributos especificados.
	 *
	 * @param codigo o codigo do time
	 * @param nome o nome do time
	 * @param mascote o mascote do time
	 */
	public Time(String codigo, String nome, String mascote) {
		this.codigo = codigo;
		this.nome = nome;
		this.mascote = mascote;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMascote() {
		return mascote;
	}

	public void setMascote(String mascote) {
		this.mascote = mascote;
	}
	
	
	public int getQntdCamp() {
		return qntdCamp;
	}

	public void setQntdCamp(int qntdCamp) {
		this.qntdCamp = qntdCamp;
	}
	
	

	public int getPrimeiraPosi() {
		return primeiraPosi;
	}

	public void setPrimeiraPosi(int primeiraPosi) {
		this.primeiraPosi = primeiraPosi;
	}

	/**
	 * Retorna uma representacao em formato de String do objeto Time.
	 *
	 * @return a representacao do objeto Time em formato de String
	 */
	@Override
	public String toString() {
		return "[" + codigo + "] " + nome + " / " + mascote ;
	}
	
	

}
