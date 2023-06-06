package simulado2;

public class Social extends Desafio{
	private int pessoas;
	
	public Social(String titulo, int pessoas) {
		super(titulo);
		this.pessoas = pessoas;
	}

	public void nivelSatisfacao() {
		if(pessoas >= 10 && pessoas <= 50) {
			this.setNivelSatisfacao(this.getNivelSatisfacao() + 20);
		}
		else if(pessoas >= 51 && pessoas <= 100) {
			this.setNivelSatisfacao(this.getNivelSatisfacao() + 50);
		}
		else if (pessoas > 100) {
			this.setNivelSatisfacao(this.getNivelSatisfacao() + pessoas);
			
			
		}
	}
}
