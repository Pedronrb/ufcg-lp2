import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Pedro Nascimento da Silva - 122111054
 */

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        
        int alvo;
        int tentativa;
        Scanner entrada = new Scanner(System.in);
        alvo = entrada.nextInt();
        
        boolean flag = false;
        
        do{
            tentativa = entrada.nextInt();
            if(tentativa > alvo){
                System.out.println("MAIOR");
            }else if(tentativa < alvo){
                System.out.println("MENOR");
            }else {
                System.out.println("ACERTOU");
                flag = true;
            }
        }while(!flag);

    }
}
