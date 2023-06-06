package simulado2;

public class Material extends Desafio {
	private int investimento;
	
	public Material(String titulo, int investimento) {
		super(titulo);
		this.investimento = investimento;
		
	}

	public void nivelSatisfacao() {
		this.setNivelSatisfacao(this.getNivelSatisfacao() + (investimento * (10/100)));
	}

}
