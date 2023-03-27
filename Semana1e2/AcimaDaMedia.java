
import java.util.Scanner;
/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Pedro Nascimento da Silva - 122111054
 */
public class AcimaDaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] lista = entrada.split(" ");

        int soma = 0;

        for (int i=0; i<lista.length; i++){
            soma += Integer.parseInt(lista[i]);
        }

        int media = soma / lista.length;

        String resposta = "";

        for (int i=0; i < lista.length; i++){
            if(Integer.parseInt(lista[i]) > media){
                resposta += (lista[i]) + " ";
            }
            
        }
        System.out.println(resposta);
    }  
}
