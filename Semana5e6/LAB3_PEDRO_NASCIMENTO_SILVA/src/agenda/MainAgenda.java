package agenda;
import java.util.Scanner;

/**
*A classe MainAgenda e responsavel por executar o programa da agenda.
*Ela contem o metodo principal e metodo para exibir o menu e lidar com a entrada do usuario.
*@author Pedro Nascimento da Silva
*/
public class MainAgenda {
	
	/**
	*A instancia de agenda a ser utilizada ao longo do programa.
	*/
	static Agenda agenda = new Agenda();
	static Scanner sc = new Scanner(System.in);
	
	/**
	*O metodo principal para executar o programa.
	*Ele chama o metodo exibeMenu para exibir o menu e lidar com a entrada do usuario.
	*/
	public static void main(String[] args) {	
		exibeMenu();	
	}
	
	/**
	*O metodo exibeMenu exibe o menu e lida com a entrada do usuario.
	*Ele faz um loop ate que o usuario insira uma opcao valida e chama o metodo correspondente.
	*/
	public static void exibeMenu() {
		
		System.out.println("(C)adastrar Contato");
		System.out.println("(L)istar Contatos");
		System.out.println("(E)xibir Contato");
		System.out.println("(F)avoritos");
		System.out.println("(A)dicionar Favorito");
		System.out.println("(R)emover Favorito");
		System.out.println("(S)air");
		System.out.println("");
		System.out.print("Opção> ");

		String opcao = sc.next().toUpperCase();
		System.out.println("");
		
		while(! "CLESAFR".contains(opcao)) {
			System.out.println("OPCAO INVALIDA!");
			exibeMenu();
		}
		
		if(opcao.equalsIgnoreCase("S")) {
			 System.exit(0);
		}
		
		else if(opcao.equalsIgnoreCase("c")) {
			System.out.println(opcaoC());
			System.out.println();
			exibeMenu();
		}
		else if(opcao.equalsIgnoreCase("l")) {
			System.out.println(opcaoL());
			exibeMenu();
		}
		else if(opcao.equalsIgnoreCase("e")) {
			System.out.println(opcaoE());
			exibeMenu();
		}
		else if(opcao.equalsIgnoreCase("f")) {
			System.out.println(opcaoF());
			exibeMenu();
		}
		else if(opcao.equalsIgnoreCase("a")) {
			System.out.println(opcaoA());
			exibeMenu();
		}
		else if(opcao.equalsIgnoreCase("r")) {
			opcaoR();
			exibeMenu();
		}
	}
	
	/**
	*O metodo opcaoC solicita as informacoes de um novo contato e chama o metodo cadastraContato da agenda.
	*Retorna uma mensagem informando se o cadastro foi bem-sucedido ou nao.
	*/
	public static String opcaoC(){
		
		System.out.print("Posição> ");
		
		int posicao = sc.nextInt();
		if(posicao < 1 || posicao > 100) {
			return "POSICAO INVALIDA";
		}
		
		System.out.print("Nome> ");
		String nome = sc.next();
		if(nome.isEmpty() || nome.equals("")) {
			return "CONTATO INVALIDO";
		}
		
		System.out.print("Sobrenome> ");
		String sobrenome = sc.next();
		
		System.out.print("Telefone> ");
		String telefone = sc.next();
		if(telefone.isEmpty() || telefone.equals("")) {
			return "CONTATO INVALIDO";
		}
		
		return agenda.cadastraContato(posicao, nome, sobrenome, telefone);
	}
	
	public static String opcaoL(){
		return agenda.listarContatos();
	}
	
	public static String opcaoE(){
		
		System.out.print("Contato> ");
		int posicao = sc.nextInt();
		return agenda.exibeContato(posicao);

	}
	
	public static String opcaoF(){
		return agenda.listarFavoritos();
	}
	
	public static String opcaoA(){
		System.out.print("Contato> ");
		int posicaoContato = sc.nextInt();
		System.out.print("Posicao> ");
		int posicao = sc.nextInt();
		return agenda.adicionarFavoritos(posicaoContato, posicao);
	}
	
	public static void opcaoR(){
		System.out.print("Posicao> ");
		int posicao = sc.nextInt();
		agenda.removerFavoritos(posicao);
	}
}
