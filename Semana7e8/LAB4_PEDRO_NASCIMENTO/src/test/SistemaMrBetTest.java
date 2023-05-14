package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import mrbet.SistemaMrBet;

/**
 * Classe de testes para a classe SistemaMrBet.
 * 
 * Esta classe contem metodos de teste para verificar o funcionamento correto dos metodos da classe SistemaMrBet.
 * Cada metodo de teste e responsavel por testar uma funcionalidade especifica da classe SistemaMrBet.
 * 
 * Antes de executar cada teste, um novo objeto SistemaMrBet e criado.
 * Isso garante que cada teste seja executado em um estado limpo e independente de outros testes.
 * 
 * @author Pedro Nascimento da Silva
 */
public class SistemaMrBetTest {
	SistemaMrBet sistema = new SistemaMrBet();
		
	/**
	 * Testa o cadastro de campeonato.
	 * 
	 * Este metodo realiza uma serie de chamadas aos metodos do sistema para testar o cadastro de campeonato.
	 * Sao realizadas as seguintes acoes:
	 * - Cadastra times no sistema.
	 * - Tenta adicionar um campeonato com um nome que nao existe e verifica se e adicionado com sucesso.
	 * - Tenta adicionar um campeonato com o mesmo nome e verifica se e detectado o conflito.
	 * - Tenta adicionar times em um campeonato existente e verifica se sao incluidos corretamente.
	 * - Tenta adicionar um time que nao existe em um campeonato existente e verifica se e detectado o erro.
	 * - Tenta adicionar um time em um campeonato que nao existe e verifica se e detectado o erro.
	 * - Tenta adicionar um campeonato com um numero maximo de participantes igual a 1 e verifica se e adicionado com sucesso.
	 * - Tenta adicionar um time em um campeonato existente com o numero maximo de participantes atingido e verifica se e detectado o erro.
	 * - Realiza verificacoes sobre a presenca de um time em um campeonato existente.
	 * - Realiza verificacoes sobre a presenca de um time em um campeonato que nao existe.
	 * - Realiza verificacoes sobre a presenca de um time em um campeonato existente, mas com o time nao participante.
	 * - Realiza verificacoes sobre a presenca de um time que nao existe em um campeonato que nao existe.
	 * - Realiza exibicao dos campeonatos de um determinado time.
	 * 
	 * Os resultados de cada acao sao verificados usando o metodo assertEquals do JUnit.
	 */
	@Test
	public void cadastraCampeonato() {
		this.sistema.cadastrarTime("250_PB", "Nacional de Patos", "Canario");
		this.sistema.cadastrarTime("252_PB", "Sport Lagoa Seca", "Carneiro");
		this.sistema.cadastrarTime("002_RJ", "Clube de Regatas do Flamengo", "Urubu");
		this.sistema.cadastrarTime("105_PB", "Sociedade Recreativa de Monteiro (SOCREMO)", "Gaviao");
		
		assertEquals(sistema.adicionarCampeonato( "Brasileirão série A 2023", 10), "CAMPEONATO ADICIONADO!");
		assertEquals(sistema.adicionarCampeonato( "Brasileirão série A 2023", 10), "CAMPEONATO JA EXISTE!");
		assertEquals(sistema.addTimeEmCamp("250_PB", "Brasileirão série A 2023"), "TIME INCLUIDO NO CAMPEONATO!");
		assertEquals(sistema.addTimeEmCamp("252_PB", "Brasileirão série A 2023"), "TIME INCLUIDO NO CAMPEONATO!");
		assertEquals(sistema.addTimeEmCamp("250_PB", "Brasileirão série A 2023"), "TIME INCLUIDO NO CAMPEONATO!");
		assertEquals(sistema.addTimeEmCamp("252_PB", "Brasileirão série A 2023"), "TIME INCLUIDO NO CAMPEONATO!");
		assertEquals(sistema.addTimeEmCamp("005_PB", "Brasileirão série A 2023"), "TIME NAO EXISTE!");
		assertEquals(sistema.addTimeEmCamp("252_PB", "Brasileirão série D 2023"), "CAMPEONATO NAO EXISTE!");
		assertEquals(sistema.adicionarCampeonato( "Brasileirão série D 2023", 1), "CAMPEONATO ADICIONADO!");
		assertEquals(sistema.addTimeEmCamp("002_RJ", "Brasileirão série D 2023"), "TIME INCLUIDO NO CAMPEONATO!");
		assertEquals(sistema.addTimeEmCamp("250_PB", "Brasileirão série D 2023"), "TODOS OS TIMES DESSE CAMPEONATO JA FORAM INCLUIDO!");
		assertEquals(sistema.verificaTimeCamp("252_PB", "Brasileirão série A 2023"), "TIME ESTA NO CAMPEONATO!");
		assertEquals(sistema.verificaTimeCamp("252_PB", "Brasileirão série D 2023"), "O TIME NAO ESTA NO CAMPEONATO!");
		assertEquals(sistema.verificaTimeCamp("252_PB", "Brasileirão série C 2023"), "O CAMPEONATO NAO EXISTE!");
		assertEquals(sistema.verificaTimeCamp("005_PB", "Brasileirão série C 2023"), "O TIME NAO EXISTE!");
		assertEquals(sistema.exibeCamp("004_PB"), "O TIME NAO EXISTE!");
	}
	
	/**
	 * Metodo de teste para as operacoes relacionadas aos times.
	 * 
	 * Este metodo executa uma serie de testes para verificar o funcionamento correto das operacoes de cadastro e recuperacao de times.
	 * Cada teste utiliza os metodos do objeto sistema para realizar as operacoes desejadas e verifica se o resultado e o esperado.
	 * 
	 * Os testes incluem:
	 * - Cadastro de um novo time com codigo, nome e mascote.
	 * - Tentativa de cadastrar um time com um codigo ja existente.
	 * - Recuperacao de um time que nao existe.
	 * - Recuperacao de um time que foi previamente cadastrado.
	 * 
	 * Os resultados dos testes sao comparados usando o metodo assertEquals da biblioteca de testes, garantindo que o valor retornado seja igual ao valor esperado.
	 */
	@Test
	public void operacoesTime() {
		assertEquals(sistema.cadastrarTime("250_PB", "Nacional de Patos", "Canario"), "INCLUSAO REALIZADA!");
		assertEquals(sistema.cadastrarTime("250_PB", "Nacional de Patos", "Canario"), "TIME JA EXISTE!");
		assertEquals(sistema.recuperarTime("005_SS"),"TIME NAO EXISTE!" );
		assertEquals(sistema.recuperarTime("250_PB"),"[250_PB] Nacional de Patos / Canario");
	}
	
	/**
	 * Metodo de teste para as operacoes relacionadas as apostas.
	 * 
	 * Este metodo executa uma serie de testes para verificar o funcionamento correto das operacoes de criacao de apostas.
	 * Antes de realizar os testes, e feito o cadastro de um time e a adicao de um campeonato ao sistema.
	 * 
	 * Os testes incluem:
	 * - Tentativa de criar uma aposta para um time em um campeonato em que ele ainda nao esta incluido.
	 * - Criacao de um campeonato e inclusao do time nele.
	 * - Tentativa de criar uma aposta para o time no campeonato em que ele esta incluido.
	 * 
	 * Os resultados dos testes sao comparados usando o metodo assertEquals da biblioteca de testes, garantindo que o valor retornado seja igual ao valor esperado.
	 */
	@Test
	public void operacoesApostas() {
		this.sistema.cadastrarTime("250_PB", "Nacional de Patos", "Canario");
		assertEquals(sistema.criarAposta("250_PB", "Brasileirao serie A 2023", 1, 100),"APOSTA NAO REGISTRADA!");
		assertEquals(sistema.adicionarCampeonato( "Brasileirao serie A 2023", 10), "CAMPEONATO ADICIONADO!");
		assertEquals(sistema.addTimeEmCamp("250_PB", "Brasileirao serie A 2023"), "TIME INCLUIDO NO CAMPEONATO!");
		assertEquals(sistema.criarAposta("250_PB", "Brasileirao serie A 2023", 1, 100),"APOSTA REGISTRADA!");
		
	}
	
	
}
