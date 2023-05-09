
public class Main {
		
	public static void main(String[] args) {
		CronicasDoEstudanteSistema cronicas = new CronicasDoEstudanteSistema();
			
		cronicas.cadastrarCronica("JUnit lá vou eu!", "JUnit é o framework de Java para testes de unidade, disponível na versão 5...", "19/04/2023");
			
		System.out.println(cronicas.exibirCronicaMaisLida());
			
		System.out.println(cronicas.listarCronicas());
			
		System.out.println(cronicas.lerCronica(0));
	}
}
