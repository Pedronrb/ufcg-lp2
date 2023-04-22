
public class CoisaBonus {
	public static void main(String[] args) {
			
		
			Disciplina disciplina2 = new Disciplina(2);
			disciplina2.cadastraNota(2, 5);
			disciplina2.cadastraNota(1, 10);
			
			
			int[] pesos = { 6, 4};
			Disciplina disciplina3 = new Disciplina("Grafos", 2, pesos);
			disciplina3.cadastraNota(1, 7);
			disciplina3.cadastraNota(2, 8);
			
			System.out.println(disciplina2.mediaPesos());
			System.out.println(disciplina3.mediaPesos());
			
			RegistroResumos registroResumo = new RegistroResumos(2);
			registroResumo.adiciona("Classe", "Classes definem um tipo e a base de código para criação de objetos");
			registroResumo.adiciona("Tipo", "Identifica a semântica (operações e significados) de um conjunto de dados.");
			String[] busca = registroResumo.busca("dados");
			for(int i=0; i< busca.length; i++) {
				System.out.println(busca[i]);
			}
			
			Descanso descanso = new Descanso();
			System.out.println(descanso.getStatusGeral());
			descanso.definirEmoji(":(");
			System.out.println(descanso.getStatusGeral());
			descanso.defineHorasDescanso(30);
			System.out.println(descanso.getStatusGeral());
			
	}
	
	

}
