
/**
* Representaçao de descanso de um estudante onde ele deve descansar 26 horas por semana, ou mais, para se considerar descansado.
* Alem disso, nao inclui as horas de sono, mas sim de atividades de lazer em geral.
* 
* @author Pedro Nascimento da Silva
*/
public class Descanso {
	
	/**
	* Os atributos consistem em um status geral do tipo String e as horas de descanso do tipo Int.
	*/
	private String statusGeral;
	private int horasDescanso;
	private String emoji = "";
	
	/*
	 * Constroi um status a partir de um modo ja definido, no caso, cansado e seu tipo e String.
	 */
	public Descanso(){
		this.statusGeral = "cansado";
	}
	
	
	
	public String getStatusGeral() {
		if(!emoji.isEmpty()) {
			return statusGeral + " - " + emoji;
		}else {
			return statusGeral;
		}
		
		
	}
	
	 /*
	  * Metodo de modificacao onde pegamos o atributo da classe e atribuimos para outra variavel do mesmo tipo. 
	  * @param status geral tipo string
	  */
	public void setStatusGeral(String statusGeral) {
		this.statusGeral = statusGeral;
	}
	
	/*
	 * Esse metodo tem um parametro horas da semana do tipo int cujo o objetivo eh verifica a condição e se maior que 26, e, se for verdade, atribuimos no atributo status geral o valor descansado e 
	 * em horas de descanso atribuimos o parametro.
	 * @param horas semana do tipo Int
	 */
	public void defineHorasDescanso(int horasSemana) {
		if(horasSemana > 26) {
			statusGeral = "descansado";
			horasDescanso = horasSemana;
			emoji = "";
			
		}
		
	}
	
	/*
	 * Esse método define o números de semanas com duas condições onde a primeira calcula a razão entre os atributos horas de descanso 
	 * sobre o parâmetro valor e se o resultado for maior que 26, atribuímos ao status geral a String descansado. Contudo, se a condição
	 * da primeira não for válida, o status geral terá a string cansado.
	 *@param valor quantidade de semanas do tipo int
	 */
	public void defineNumeroSemanas(int valor) {
		if((horasDescanso / valor) > 26) {
			emoji = "";
			statusGeral = "descansado";
		}else {
			statusGeral = "cansado";
		}
	}
		
	
	public void definirEmoji(String valor) {
		this.emoji = valor;
	}
}
