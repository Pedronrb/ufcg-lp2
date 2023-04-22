package agenda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
*Classe de teste para a classe Contato.
*@author Pedro Nascimento da Silva
*/
class ContatoTeste {
	
	private Contato contatoBase;
	
	/**
	*Prepara o contato base para os testes.
	*/
	@BeforeEach
	public void preparaContatos() {
		this.contatoBase = new Contato(1,"Matheus", "Gaudencio", "555-5551");
	}

	/**
	*Testa se o nome completo e retornado corretamente.
	*/
	@Test
	public void testNomeCompleto() {
		assertEquals("Matheus Gaudencio", this.contatoBase.getNome() + " " + this.contatoBase.getSobrenome());
		this.contatoBase.setNome("Pedro");
		assertNotEquals("Matheus", contatoBase.getNome());
	
	}
	
	/**
	*Testa se o telefone e retornado corretamente.
	*/
	@Test
	public void telefoneTest() {
		assertEquals("555-5551", this.contatoBase.getTelefone());
		assertNotEquals("123", this.contatoBase.getTelefone());
	}	

}
