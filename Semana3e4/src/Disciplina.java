public class Disciplina {
	
	private Double nota1 = 0.0;
	private Double nota2 = 0.0;
	private Double nota3 = 0.0;
	private Double nota4 = 0.0;
	
	private String nomeDisciplina;
	
	private Double mediaNota;
	private Double horaDisciplina;
	
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	
	
	public void mediaNotas(Double nota1, Double nota2, Double nota3, Double nota4){
		Double soma = nota1 + nota2 + nota3 + nota4;
		Double media = soma / 4;
		mediaNota = media;
	}	

	public void cadastraHoras(int horas) {
		horaDisciplina += horas; 
	}
	
	public void cadastraNota(int nota, double valorNota) {
		
		if (nota == 1) {
			nota1 = valorNota;	
		}else if (nota == 2) {
			nota2 = valorNota;
		}else if (nota == 3) {
			nota3 = valorNota;
		}else if(nota4 == 4) {
			nota4 = valorNota;
		}
		
	}
	
	public boolean aprovado() {
		if(mediaNota >= 7) {
			return true;
		}else {
			return false;
		}
		
	}

	public String toString() {
		return "Nome da disciplina: " + nomeDisciplina + " Número de horas de estudo: " + horaDisciplina + 
				"Média das notas: " + mediaNota + "Notas: " + nota1 + "-1" + nota2 + "-2" + nota3 + "-3" + nota4 + "-4";  
	}
	
}		
		