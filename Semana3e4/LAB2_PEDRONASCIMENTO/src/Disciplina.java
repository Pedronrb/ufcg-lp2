/**
* Definir o nome da disciplina, atribuir quatro notas, com a possibilidade de repor e fazer a media aritmetica.
* 
* @author Pedro Nascimento da Silva
*/

public class Disciplina {
	
	/**
	*Temos os atributos que consiste em um array de 4 notas, mais o nome da disciplina, media, horas da disciplina, numero de nota e o peso da disciplina
	*/
	
	private double[] notas = {0.0, 0.0, 0.0, 0.0};
	private String nomeDisciplina;
	
	private double media;
	private int horaDisciplina;
	private int numeroNotas;
	private int[] pesos;
	
	/**
	* Constroi uma disciplina a partir do seu nome.
	* @param nome da disciplina tipo string
	*/
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	
	public Disciplina(int numeroNotas) {
		this.numeroNotas = numeroNotas;
	}
	
	/**
	*Constroi uma disciplina a partir do seu nome, do numero de notas e de um array de pesos.
	*@param nomeDisciplina o nome da disciplina do tipo String
	*@param numeroNotas o numero de notas do tipo int
	*@param pesos o array de pesos do tipo int
	*/
	public Disciplina(String nomeDisciplina, int numeroNotas, int[] pesos) {
		this.nomeDisciplina = nomeDisciplina;
		this.numeroNotas = numeroNotas;
		this.pesos = pesos;
		
	}
	
	/*
	 * Metodo que cadastra as horas da disciplina por meio da atribuicao de horas.
	 * @param horas quantidade de horas do tipo Int
	 */
	public void cadastraHoras(int horas) {
		horaDisciplina += horas;
	}
	
	/*
	 * Metodo que relaciona uma nota do tipo Int com o valor da nota do tipo Double e no final calcula 
	 * a media aritmetica.
	 * @param nota do tipo Int refere-se a qual nota sera atribuido o valor
	 * @param valor nota e o valor da nota do tipo Double
	 */
	public void cadastraNota(int nota, double valorNota) {

		notas[nota-1] = valorNota;
		double soma = 0;
		
		for (int i =0; i < notas.length; i++) {
			soma +=  notas[i];
		}
		media = soma / 4;
	}
	
	/**
	*Retorna um valor booleano indicando se a disciplina foi aprovada ou nao, considerando a media das notas.
	*A disciplina sera considerada aprovada se a media das notas for maior ou igual a 7.
	*@return true se a disciplina foi aprovada e false caso contrario.
	*/
	public boolean aprovado() {
		
		if(media >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
	/*
	*Calcula a media ponderada das notas da disciplina, utilizando os pesos especificados na construcao da disciplina, se existirem.
	*Caso contrario, calcula a media aritmetica simples.
	*@return media das notas da disciplina, como um numero de ponto flutuante de dupla precisao.
	*/
	public double mediaPesos() {
		double calculo = 0;
		
		if (pesos != null) {
			for(int i=0; i < pesos.length; i++) {
				calculo += pesos[i] * notas[i];
			}
			return calculo / 10;
			
		}else {
			for(int i=0; i < numeroNotas; i++) {
				calculo +=  notas[i];
				
			}return calculo / numeroNotas;	
		}
			
	}

	/**
	*Retorna a String que representa o nome da disciplina, as horas, a media e as respectivas notas.
	*A representacao segue o formato “Disciplina horas media [notas]”.
	*@return a representacao em String da disciplina.
	*/
	public String toString() {
		String retorno = "";
		
		for (int i=0; i < notas.length; i++) {
			retorno += notas[i] + " ";
		
		}
			return nomeDisciplina + " " + horaDisciplina + " " + media + " [" + retorno + "]";  
	}
	
}		
		