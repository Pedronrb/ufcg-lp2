
public class Teste {
	public static void main(String[] args) {
		// RegistroTempoOnline registroOnline = new RegistroTempoOnline();
		RegistroTempoOnline registroOnline2 = new RegistroTempoOnline("LP2", 10);
		
		System.out.println(registroOnline2.getNomeDisciplina());
		
		registroOnline2.adicionaTempoOnline(2);
		
		System.out.println(registroOnline2.toString());
		
		Disciplina disciplina = new Disciplina("Mategegesd");
		
		disciplina.mediaNotas(1.0, 2.0, 3.0, 5.5);
		
		//System.out.println(disciplina.mediaNotas(1.0, 2.0, 3.0, 5.5));
		
		 RegistroResumos meusResumos = new RegistroResumos(100);  // 100 resumos
	      
		    
	      meusResumos.adiciona("Classes", "Classes definem um tipo e a base de código para criação de objetos.");
	      meusResumos.adiciona("Tipo", "Identifica a semântica (operações e significados) de um conjunto de dados.");

	      System.out.println(meusResumos.toString());

	      String[] resumos = meusResumos.pegaResumos();
	
	}
}
