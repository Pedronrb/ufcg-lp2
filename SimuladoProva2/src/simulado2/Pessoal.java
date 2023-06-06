package simulado2;

public class Pessoal extends Desafio {
	
	public Pessoal(String titulo) {
		super(titulo);
	}

	public void nivelSatisfacao() {
		this.setNivelSatisfacao(this.getNivelSatisfacao() +10);
	}
}
