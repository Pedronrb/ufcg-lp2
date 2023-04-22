/**
* Registra a quantidade de horas de cada disciplina e calcula o dobro de hora esperada para o remoto.
* 
* @author Pedro Nascimento da Silva
*/
public class RegistroTempoOnline {

	String nomeDisciplina;
	int tempoOnlineUsado;
	int tempoOnlineEsperado;
	
	/**
	* Constroi a disciplina a partir do seu nome do tipo string e o tempo de aula online esperado a partir do parametro 
	* tempo online esperado do tipo Int.
	* @param nomeDisciplia é o nome da discplina do tipo String.
	*/
	public RegistroTempoOnline(String nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = 120;
	}
	
	/**
	* Constroi a disciplina a partir do seu nome do tipo string e o tempo de aula online esperado a partir do parametro 
	* tempo online esperado do tipo Int.
	* @param nomeDisciplia é o nome da discplina do tipo String.
	* @param TempoOlineEsperado é a quantidade de horas esperada para a disciplina do tipo Int.
	*/
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}
	
	/**
	* Constroi a disciplina a partir do seu nome do tipo string e o tempo de aula online esperado a partir do parametro 
	* tempo online esperado do tipo Int.
	* @param nomeDisciplia eh o nome da discplina do tipo String.
	* @param TempoOlineEsperado eh a quantidade de horas esperada para a disciplina do tipo Int.
	*/
	public void adicionaTempoOnline(int tempo) {
		tempoOnlineUsado += tempo;
	}
	
	/*
	 * Metodo do tipo Boolean que verifica uma condicao onde o tempo online esperado deve ser menor ou igual ao tempo usado.
	 * Retornando True se a condicao for verdade e False se nao entrar na condicao.
	 */
	public boolean atingiuMetaTempoOnline() {
		if(tempoOnlineEsperado <= tempoOnlineUsado) {
			return true;	
		}else {
			return false;	
		}
	}
	
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getTempoOnlineUsado() {
		return tempoOnlineUsado;
	}

	public void setTempoOnlineUsado(int tempoOnlineUsado) {
		this.tempoOnlineUsado = tempoOnlineUsado;
	}

	public int getTempoOnlineEsperado() {
		return tempoOnlineEsperado;
	}

	public void setTempoOnlineEsperado(int tempoOnlineEsperado) {
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}
	
	/**
	* Formatacao dos objetos com a representacao "Nome da disciplina tempo online usado / tempo online esperado".
	* @return a representacao em String de uma disciplina com as suas horas usadas sobre as horas esperadas.
	*/
	public String toString() {
		return nomeDisciplina + " " + tempoOnlineUsado + "/" + tempoOnlineEsperado;
		
	}
}
