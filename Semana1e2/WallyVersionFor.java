import java.util.Scanner;
/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Pedro Nascimento da Silva - 122111054
 */
public class WallyVersionFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] listaNomes = entrada.split(" ");
        String novoNome = "";
        
        for(String nome: listaNomes){
            if(nome.equalsIgnoreCase("wally")){
                return;
            }
            else if(nome.length() == 5){
                novoNome = nome;

            }
        }

        if (novoNome == ""){
            System.out.println("?");
        }

        else{
            System.out.println(novoNome);
        }
    }
    
}
