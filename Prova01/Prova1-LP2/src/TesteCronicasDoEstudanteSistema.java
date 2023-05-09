import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCronicasDoEstudanteSistema {
	
	CronicasDoEstudanteSistema sistema = new CronicasDoEstudanteSistema();
	
	
	@Test
	void test() {
		sistema.cadastrarCronica("JUnit lá vou eu!", "Cheguei bem fera na UFCG, não sabia onde achar nada... A semana do fera foi essencial para eu tomar um rumo...", "13/03/2023");
		sistema.cadastrarCronica("Minha semana do fera 2022.2", "JUnit é o framework de Java para testes de unidade, disponível na versão 5...", "19/04/2023");
		sistema.cadastrarCronica("Minha semana acadêmica 2021.2", "JUnit é o framework de Java para testes de unidade, disponível na versão 5...", "19/01/2023");
		sistema.lerCronica(1);
		sistema.lerCronica(0);
		sistema.lerCronica(1);
		
		System.out.println(sistema.exibirCronicaMaisLida());
		assertEquals(sistema.exibirCronicaMaisLida(), "Minha semana do fera 2022.2 - lida 2 vezes");
		
			
	}

}
