package mrbet;

public class Aposta {
	private String codTime;
	private String nomeCamp;
	private int colocacao;
	private double valorAposta;
	
	public Aposta(String codTime, String nomeCamp, int colocacao, double valorAposta) {
		this.codTime = codTime;
		this.nomeCamp = nomeCamp;
		this.colocacao = colocacao;
		this.valorAposta = valorAposta;
	}

	public String getCodTime() {
		return codTime;
	}

	public void setCodTime(String codTime) {
		this.codTime = codTime;
	}

	public String getNomeCamp() {
		return nomeCamp;
	}

	public void setNomeCamp(String nomeCamp) {
		this.nomeCamp = nomeCamp;
	}

	public int getColocacao() {
		return colocacao;
	}

	public void setColocacao(int colocacao) {
		this.colocacao = colocacao;
	}

	public double getValorAposta() {
		return valorAposta;
	}

	public void setValorAposta(double valorAposta) {
		this.valorAposta = valorAposta;
	}
	
}
