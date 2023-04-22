import java.util.Arrays;

/**
* Regitrar os resumos com a capacidade de armazenamento limitada e se 
* atigir a capacidade maxima, temos que adicionar eles nas primeiras posiçoes.
* @author Pedro Nascimento da Silva
*/
public class RegistroResumos {
	
	int numeroDeResumos;
	private int index;
	String[] listaTemas = new String[numeroDeResumos];
	String[] listaResumos = new String[numeroDeResumos];
	private int contador;
	
	/**
	*Classe responsavel por armazenar um conjunto de resumos e seus respectivos temas.
	*Possui um numero maximo de resumos definido pelo parametro passado no construtor.
	*Os resumos e temas são armazenados em arrays de strings.
	*/
	public  RegistroResumos(int numeroDeResumos){
		this.index = 0;
		this.numeroDeResumos = numeroDeResumos;
	    this.listaTemas = new String[numeroDeResumos];
	    this.listaResumos = new String[numeroDeResumos];
	    for (int i = 0; i < numeroDeResumos; i++) {
	        this.listaTemas[i] = "";
	        this.listaResumos[i] = "";
	    }
	    this.index = 0;
	}
	
	/**
	*Adiciona um novo resumo a lista de resumos.
	*Se o numero de resumos adicionados ja atingiu o limite definido,
	*o primeiro resumo e substituido pelo novo.
	*@param tema o tema do resumo a ser adicionado
	*@param resumo o texto do resumo a ser adicionado
	*/
	public void adiciona(String tema, String resumo){
		contador += 1;
		if (index == numeroDeResumos) {
			
            // Se ja atingiu o limite de resumos, substitui o primeiro
			listaTemas[0] = tema;
			listaResumos[0] = resumo;
            index = 1;
           
        } else {
        	
            // Se ainda nao atingiu o limite de resumos, adiciona no final
        	listaTemas[index] = tema;
        	listaResumos[index] = resumo;
            index++;
        }
		
	}
	

	public String[] pegaResumos() {
		return listaResumos;
	}
	
	 
	public String toString(){
		String resp = "";
		
		for(int i = 0; i < listaTemas.length; i++) {
			if(!listaTemas[i].isEmpty()) {
				resp += listaTemas[i] + ": " + listaResumos[i] + "\n";	
			}
			
			
		}
		return resp; 
	}
	
	public int conta() {
		return contador;
	}
	
	/**
	*Retorna uma string com todos os temas dos resumos adicionados.
	*@return String contendo os temas dos resumos adicionados, separados por " | ".
	*/
	public String imprimeResumos() {
		String resp = "";
		
		for(int i = 0; i < listaTemas.length; i++) {
			if(!listaTemas[i].isEmpty()){
				resp += listaTemas[i] + " | ";
			} 
			
		} return resp.substring(0, resp.length()-2);
	}

	/**
	*Verifica se ha um resumo com o tema especificado na lista de resumos.
	*@param tema o tema a ser buscado na lista de resumos
	*@return true se ha um resumo com o tema especificado, false caso contrario
	*/
	public boolean temResumo(String tema) {
		for(int i=0; i < listaTemas.length; i++) {
			if(listaTemas[i].equals(tema)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	*Busca os temas dos resumos que contem a chave de busca fornecida.
	*@param chaveDeBusca a string a ser buscada nos resumos
	*@return um array de strings contendo os temas dos resumos que contem a chave de busca
	*/
	public String[] busca(String chaveDeBusca) {
		String[] resposta = new String[listaResumos.length];
		int count = 0;
		for(int i = 0; i < listaResumos.length; i++) {
			if(listaResumos[i].contains(chaveDeBusca)) {
				resposta[count] = listaTemas[i];
				count += 1;
			}
		}
		//Arrays.sort(resposta);
		return resposta;
	}
	
}