package mrbet;

import java.util.Scanner;

/**
 * Classe responsavel por apresentar o menu de interacao com o sistema MrBet.
 * 
 * Contem um objeto do tipo `SistemaMrBet` para realizar as operacoes do sistema
 * e um objeto do tipo `Scanner` para ler as entradas do usuario.
 * Permite que o usuario interaja com o sistema, realizando acoes como cadastrar times,
 * adicionar campeonatos, fazer apostas, exibir informacoes.
 * 
 * @author Pedro Nascimento da Silva
 */
public class Menu {
	static SistemaMrBet mrBet = new SistemaMrBet();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			exibeMenu();	
		}

	public static void exibeMenu() {
		
		System.out.println("(M)Minha inclusao de times\r\n"
				+ "(R)Recuperar time\r\n"
				+ "(.)Adicionar campeonato\r\n"
				+ "(B)Bora incluir time em campeonato e Verificar se time esta em campeonato\r\n"
				+ "(E)Exibir campeonatos que o time participa\r\n"
				+ "(T)Tentar a sorte e status\r\n"
				+ "(!)Ja pode fechar o programa!\r\n"
				+ "(H) Historico\r\n"
				+ "Opcao>");
		
		String entrada = sc.next().toUpperCase();
		
		if (! "MR.BET!H".contains(entrada) ) {
			throw new IllegalArgumentException("Aposta encerrada!!");
		}
		else if(entrada.equalsIgnoreCase("M")) {
			System.out.print("Codigo: ");
			String codigo = sc.next();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Mascote: ");
			String mascote = sc.next();
			String resposta = mrBet.cadastrarTime(codigo, nome, mascote);
			System.out.println(resposta + "\n");
		}
		else if(entrada.equalsIgnoreCase("R")) {
			System.out.print("Codigo: ");
			String codigo = sc.next();
			System.out.println(mrBet.recuperarTime(codigo) + "\n" );
		}
		else if(entrada.equals(".")) {
			System.out.print("Campeonato: ");
			String nome = sc.next();
			System.out.print("Participantes: ");
			int numParticipantes = sc.nextInt();
			System.out.println(mrBet.adicionarCampeonato(nome, numParticipantes) + "\n");
			}
		else if(entrada.equalsIgnoreCase("B")) {
			System.out.print("(I) Incluir time em campeonato ou (V) Verificar se time esta em\r\n"
					+ "campeonato? ");
			String opcao = sc.next();
			
			if(opcao.equalsIgnoreCase("I")) {
				System.out.print("Codigo: ");
				String codTime = sc.next();
				System.out.print("Campeonato: ");
				String campeonato = sc.next();
				System.out.println(mrBet.addTimeEmCamp(codTime, campeonato));			
			}
			else if(opcao.equalsIgnoreCase("V")) {
				System.out.print("Codigo: ");
				String codTime = sc.next();
				System.out.print("Campeonato: ");
				String campeonato = sc.next();
				System.out.println(mrBet.verificaTimeCamp(codTime, campeonato));
			}
		}
		else if(entrada.equalsIgnoreCase("E")) {
			System.out.print("Time: ");
			String time = sc.next();
			System.out.println(mrBet.exibeCamp(time));	
		}
		else if(entrada.equalsIgnoreCase("T")) {
			System.out.print("(A) Apostar ou (S) Status das apostas? \n"
					+ "campeonato? ");
			String codigo = sc.next();
			if(codigo.equalsIgnoreCase("A")) {
				System.out.print("Codigo: ");
				String cod = sc.next();
				System.out.print("Campeonato: ");
				String camp = sc.next();
				System.out.print("Colocacao: ");
				int coloc = sc.nextInt();
				System.out.print("Valor da aposta: ");
				Double valor = sc.nextDouble();
				System.out.println(mrBet.criarAposta(cod, camp, coloc, valor));
			}
			
			else if(codigo.equalsIgnoreCase("S")) {
				System.out.println("Apostas: " + "\n");
				System.out.println(mrBet.statusAposta());
			}
		}
		else if(entrada.equals("!")) {
			System.out.println("Por hoje e so pessoal!");
			return;
		}
		else if(entrada.equals("H")) {
			System.out.println(mrBet.qntdCampTime());
		}
		
		exibeMenu();
	}
}
