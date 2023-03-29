
public class RegistroTempoOnline {

	String nomeDisciplina;
	int tempoOnlineUsado;
	int tempoOnlineEsperado;
	
	public RegistroTempoOnline(String nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = 120;
	}
	
	
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}
	
	public void adicionaTempoOnline(int tempo) {
		tempoOnlineUsado += tempo;
	}
	
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
	
	public String toString() {
		return "nome da disciplina: " + nomeDisciplina + ", tempo online: " + tempoOnlineUsado + 
				", tempo online esperado: " + tempoOnlineEsperado;
		
	}
}
