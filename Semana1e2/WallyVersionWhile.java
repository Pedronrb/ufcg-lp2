import java.util.Scanner;
/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Pedro Nascimento da Silva - 122111054
 */

import javax.print.DocFlavor.STRING;
public class WallyVersionWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] listaNomes = entrada.split(" ");
        String novoNome = "";
        int count = 0;

        for(String nome: listaNomes){
            count += 1;
            System.out.println(nome);

            while (nome.equalsIgnoreCase("wally")) {

                if(nome.length() == 5  ){
                    novoNome = nome;           
                }

                if(count == listaNomes.length){
                    if(novoNome.equalsIgnoreCase("")) {
                        System.out.println("?");
                    }else {
                        System.out.println(novoNome);
                    }
                    entrada = sc.nextLine();
                    listaNomes = entrada.split(" ");
                    }       
            }
        }
    } 
}
