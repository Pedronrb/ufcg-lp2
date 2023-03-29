
/**
* Representação de descanso de um estudante onde ele deve descansar 26 horas por semana, ou mais, para se considerar descansado.
* Além disso, não inclui as horas de sono, mas de atividades de lazer em geral.
* 
* @author Pedro Nascimento da Silva
*/

public class Descanso {
	/**
	* Constrói quantas horas de descanso o aluno teve e define os números de semanas.
	*
	* @param horas de descanso, no formato inteiro
	* @param número de semanas, no formato inteiro
	*/
	private String statusGeral;
	private int horasDescanso;
	
	
	public Descanso(){
		this.statusGeral = "cansado";
		
	}
	
	
	
	
	public String getStatusGeral() {
		return statusGeral;
	}

	public void setStatusGeral(String statusGeral) {
		this.statusGeral = statusGeral;
	}

	public void defineHorasDescanso(int horasSemana) {
		if(horasSemana > 26) {
			statusGeral = "descansado";
			horasDescanso = horasSemana;
		}
		
	}
	
	public void defineNumeroSemanas(int valor) {
		if((horasDescanso / valor) > 26) {
			statusGeral = "descansado";
		}else {
			statusGeral = "cansado";
		}
		
	}
		

}
