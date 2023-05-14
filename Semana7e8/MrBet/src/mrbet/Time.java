package mrbet;

public class Time {

	String codigo;
	String nome; 
	String mascote; 
	int qntdCamp = 0;
	int primeiraPosi = 0;
	
	public Time(String codigo, String nome, String mascote) {
		this.codigo = codigo;
		this.nome = nome;
		this.mascote = mascote;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMascote() {
		return mascote;
	}

	public void setMascote(String mascote) {
		this.mascote = mascote;
	}
	
	
	public int getQntdCamp() {
		return qntdCamp;
	}

	public void setQntdCamp(int qntdCamp) {
		this.qntdCamp = qntdCamp;
	}
	
	

	public int getPrimeiraPosi() {
		return primeiraPosi;
	}

	public void setPrimeiraPosi(int primeiraPosi) {
		this.primeiraPosi = primeiraPosi;
	}

	@Override
	public String toString() {
		return "[" + codigo + "] " + nome + " / " + mascote ;
	}
	
	

}
