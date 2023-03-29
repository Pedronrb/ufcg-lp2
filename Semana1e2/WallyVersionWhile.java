import java.util.Scanner;
/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Pedro Nascimento da Silva - 122111054
 */
public class WallyVersionWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] listaNomes = entrada.split(" ");
        String novoNome = "";
        int count = 0;
        
        while(!entrada.equalsIgnoreCase("wally")) {
        	for (String nome : listaNomes) {
        		count++;
				if(nome.length() == 5) {
					novoNome = nome;
				}
				
				if(count == listaNomes.length) {
					if(novoNome.equalsIgnoreCase("")) {
	        			 novoNome = "?";
	                 }
	        		 System.out.println(novoNome);
				}
			}
        	novoNome = "";
        	count = 0;
        	entrada = sc.nextLine();
            listaNomes = entrada.split(" ");
        }
	}
}