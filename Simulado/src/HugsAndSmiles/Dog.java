package HugsAndSmiles;

public class Dog {
	
	private String nomePet;
	private String nomeTutor;
	private int qntdRacao;
	private String restricao;
	
	
	public Dog(String nomePet, String nomeTutor, int qntdRacao) {
		this.nomePet = nomePet;
		this.nomeTutor = nomeTutor;
		this.qntdRacao =  qntdRacao;
	}
	
	public Dog(String nomePet, String nomeTutor, int qntdRacao, String restricao) {
		this.nomePet = nomePet;
		this.nomeTutor = nomeTutor;
		this.qntdRacao =  qntdRacao;
		this.restricao =  restricao;
	}
	
	
	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getNomeTutor() {
		return nomeTutor;
	}

	public void setNomeTutor(String nomeTutor) {
		this.nomeTutor = nomeTutor;
	}

	public int getQntdRacao() {
		return qntdRacao;
	}

	public void setQntdRacao(int qntdRacao) {
		this.qntdRacao = qntdRacao;
	}

	public String getRestricao() {
		return restricao;
	}

	public void setRestricao(String restricao) {
		this.restricao = restricao;
	}

	@Override
	public String toString() {
		return "Dog [nome=" + this.nomePet + ", " +  "tutor=" + this.nomeTutor + "]";
	}
}
