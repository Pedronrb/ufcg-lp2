import java.util.ArrayList;

public class RegistroResumos {
	int numeroDeResumos;
	private String temaAtual = "";
	private String resumo;
	private int index;
	String[] listaTemas = new String[numeroDeResumos];
	String[] listaResumos = new String[numeroDeResumos];
	
	
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
	
	public void adiciona(String tema, String resumo){
		
		if (index == numeroDeResumos) {
            // Se já atingiu o limite de resumos, substitui o primeiro
			listaTemas[0] = tema;
			listaResumos[0] = resumo;
            index = 1;
           
        } else {
            // Se ainda não atingiu o limite de resumos, adiciona no final
        	listaTemas[index] = tema;
        	listaResumos[index] = resumo;
            index++;
        }
		System.out.println(listaTemas);
	}
	

	public String[] pegaResumos() {
		return listaResumos;
	}
	
	public String toString(){
		
		return "Número de resumo: " + numeroDeResumos + " Tema atual: " + temaAtual + " resumo: " + resumo + 
				" Lista temas: " + listaTemas.toString() + " Lista resumos: " + listaResumos.toString();
	}
	
	
}