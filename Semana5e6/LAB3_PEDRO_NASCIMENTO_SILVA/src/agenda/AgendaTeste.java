package agenda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
*Classe de testes da classe Agenda. Testa os metodos de cadastro, exibicao de contato,
*favoritos e listagem de contatos da agenda.
*@author Pedro Nascimento da Silva
*/
public class AgendaTeste {
	Agenda agendaTeste = new Agenda();

	/**
	*Prepara a lista de contatos para os testes, cadastrando um contato.
	*/
	@BeforeEach
	void preparaContatos() {
		this.agendaTeste.cadastraContato(1,"Matheus", "Gaudencio", "(83) 99999-0000");
	}
	
	/**
	*Testa o metodo de cadastro de contatos, verificando se os cadastros sao realizados
	*corretamente e se mensagens de erro sao retornadas para entradas invalidas.
	*/
	@Test
	public void cadastraContatoTeste() {
		
		assertEquals(agendaTeste.cadastraContato(3, "Matheus", "Gaudencio", "(83) 99999-0000"), "CONTATO JA CADASTRADO");
		assertEquals(agendaTeste.cadastraContato(2, "Pedro", "Silva", "(84) 98888-1111"), "CADASTRO REALIZADO");
		assertEquals(agendaTeste.cadastraContato(100, "Matheus", "Silva", "(83) 99999-0000"), "CADASTRO REALIZADO");
		assertEquals(agendaTeste.cadastraContato(101, "Matheus", "Gaudencio", "(83) 99999-0000"), "POSICAO INVALIDA");
		assertEquals(agendaTeste.cadastraContato(0, "Matheus", "Gaudencio", "(83) 99999-0000"), "POSICAO INVALIDA");
		assertNotEquals(agendaTeste.cadastraContato(1, "Matheus", "Gaudencio", ""), "CADASTRO REALIZADO");
		assertNotEquals(agendaTeste.cadastraContato(1, "", "Gaudencio", "(83) 99999-0000"), "CADASTRO REALIZADO");
		assertTrue(agendaTeste.equals("Matheus", "Gaudencio"));
		assertFalse(agendaTeste.equals("Pedro", "Gaudencio"));
		assertEquals(agendaTeste.listarContatos(), "1 - Matheus Gaudencio\n2 - Pedro Silva\n100 - Matheus Silva\n");
	}
	
	/**
	*Testa o metodo de exibicao de contatos, verificando se o retorno e o esperado para diferentes posicoes na agenda.
	*/
	@Test
	public void exibeContatoTeste() {
		assertEquals(agendaTeste.exibeContato(1), "Matheus Gaudencio\n(83) 99999-0000");
		assertEquals(agendaTeste.exibeContato(100),"POSICAO INVALIDA!");
		assertEquals(agendaTeste.exibeContato(0),"POSICAO INVALIDA!");
		assertEquals(agendaTeste.exibeContato(101),"POSICAO INVALIDA!");	
	}
	
	/**
	*Testa os metodos de adicao e remocao de contatos favoritos, verificando se os contatos sao corretamente marcados e removidos da lista de favoritos.
	*/
	@Test
	public void favoritosTeste() {
		agendaTeste.adicionarFavoritos(1, 1);
		assertEquals(agendaTeste.exibeContato(1),"<3 Matheus Gaudencio\n(83) 99999-0000");
		assertEquals(agendaTeste.listarFavoritos(), "1 - <3 Matheus Gaudencio\n");
		assertEquals(agendaTeste.exibeContato(1), "<3 Matheus Gaudencio\n(83) 99999-0000");
		agendaTeste.removerFavoritos(1);
		assertEquals(agendaTeste.exibeContato(1), "Matheus Gaudencio\n(83) 99999-0000");	
	}
}
