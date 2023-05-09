package HugsAndSmiles;
public class DogHost {
	
	private Dog[] dogs;
	private String nomeAnfitriao;
	private int qntdMaximaCachorro;
	private int qntdMaximaRacao;
	private int qntdCachorro = 0;
	private int qntdRacaoAnfitriao = 0;
	private double METRICA_DIARIA = 0.4;
	
	
	public DogHost(String nomeAnfitriao, int qntdMaximaCachorro, int qntdMaximaRacao) {
		this.nomeAnfitriao = nomeAnfitriao;
		this.qntdMaximaCachorro = qntdMaximaCachorro;
		this.qntdMaximaRacao = qntdMaximaRacao;
		this.dogs = new Dog[qntdMaximaCachorro];
	}
	
	public boolean adicionaDog(String nomePet, String nomeTutor, int qntdRacao) {
		if(qntdRacaoAnfitriao > qntdMaximaRacao || qntdCachorro >= qntdMaximaCachorro) {
			return false;
		}
		
		Dog dog = new Dog(nomePet, nomeTutor, qntdRacao);
		qntdRacaoAnfitriao += qntdRacao;
		dogs[qntdCachorro] = dog;
		qntdCachorro += 1;
		return true;
		
	}
	
	public boolean adicionaDog(String nomePet, String nomeTutor, int qntdRacao, String tipoRestricao){
		
		if(qntdRacaoAnfitriao <= qntdMaximaRacao || qntdCachorro < qntdMaximaCachorro) {
			Dog dog = new Dog(nomePet, nomeTutor, 2*qntdRacao, tipoRestricao);
			qntdRacaoAnfitriao += qntdRacao;
			dogs[qntdCachorro] = dog;
			qntdCachorro += 1;
			return true;
		}
		return false;
	
	}
	
	public String listaDogs() {	
		String retorno = nomeAnfitriao + ":\n";
		for(int i = 0; i < dogs.length; i++) {
			retorno += dogs[i].toString() + "\n";	
		}
		return retorno;
	}
	
	public boolean compararDoguinhos(Dog doguinho) {
		for(int i = 0; i < dogs.length; i++) {
			if(dogs[i].getNomePet().equals(doguinho.getNomePet()) &&
					dogs[i].getNomeTutor().equals(doguinho.getNomeTutor())) {
				return true;
			}
		}
		return false;	
	}

	
	public double consultaValorHospedagem(Dog doguinho, int dias) {
		if(compararDoguinhos(doguinho) == true) {
			double valor = doguinho.getQntdRacao() * METRICA_DIARIA * dias;
			return valor;
		}
		else {
			throw new IllegalArgumentException();
		}
		
	}
	
	
	public String getNomeAnfitriao() {
		return nomeAnfitriao;
	}

	public void setNomeAnfitriao(String nomeAnfitriao) {
		this.nomeAnfitriao = nomeAnfitriao;
	}

	public int getQntdMaximaCachoro() {
		return qntdMaximaCachorro;
	}

	public void setQntdMaximaCachoro(int qntdMaximaCachoro) {
		this.qntdMaximaCachorro = qntdMaximaCachoro;
	}

	public int getQntdMaximaRacao() {
		return qntdMaximaRacao;
	}

	public void setQntdMaximaRacao(int qntdMaximaRacao) {
		this.qntdMaximaRacao = qntdMaximaRacao;
	}

	@Override
	public String toString() {
		return "DogHost [nomeAnfitriao=" + nomeAnfitriao + ", qntdMaximaCachoro=" + qntdMaximaCachorro
				+ ", qntdMaximaRacao=" + qntdMaximaRacao + "]";
	}
	
	
}
