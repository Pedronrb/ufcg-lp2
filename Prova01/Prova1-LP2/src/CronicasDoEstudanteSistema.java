public class CronicasDoEstudanteSistema {
	private Cronica[] cronicas;
	private int indiceCronicas = 0; 
	private Livreto[] livretos;
	private int numLivretos = 0;

	public CronicasDoEstudanteSistema() {
		cronicas = new Cronica[1000];
		livretos = new Livreto[100];
	} 

	public void cadastrarCronica(String titulo, String texto, String data, String autor) {
		Cronica cronica = new Cronica(titulo, texto, data, autor);
		cronicas[indiceCronicas] = cronica;
		indiceCronicas += 1;
	} 

	public void cadastrarCronica(String titulo, String texto, String data){
		Cronica cronica = new Cronica(titulo, texto, data);
		cronicas[indiceCronicas] = cronica;
		indiceCronicas += 1;
	}
	
	public String listarCronicas(){
		String retorno = "";
		for (int i = 0; i < cronicas.length; i++) {
			if(cronicas[i] != null) {
				retorno += cronicas[i].toString() + "\n";
			}
		}
		return retorno;
	}


	public String lerCronica(int indice) {
		cronicas[indice].setLidas(cronicas[indice].getLidas() + 1);
		return cronicas[indice].getTexto();	    
	} 

	public String exibirCronicaMaisLida(){
		Cronica cronicaMaisLida = cronicas[0];
		for (int i = 0; i < cronicas.length; i++) {
			if(cronicas[i] != null && (cronicas[i].getLidas() > cronicaMaisLida.getLidas())) {
				cronicaMaisLida = cronicas[i];
				}
			} 
			return cronicaMaisLida.getTitulo() + " - lida " + cronicaMaisLida.getLidas() + " vezes"; 
	}
			
	public void criarLivreto(int[] posicoes) {
		if(posicoes.length < 3 || posicoes.length > 5) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < posicoes.length; i++) {
			livretos[i].adicionaCronica(cronicas[posicoes[i]]);
			}
			numLivretos += 1;
	}
			
			public String lerLivreto(int i) {
				return livretos[i].toString();
			}
			
			public boolean contemCronicaNoLivreto(String titulo) {
				for(int i = 0; i < livretos.length; i++) {
					if(livretos[i] != null) {
						return livretos[i].contemCronicaNoLivreto(titulo);
					}
				}
				return false;
			}
		}


