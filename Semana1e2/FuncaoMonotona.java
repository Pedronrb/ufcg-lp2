import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Pedro Nascimento da Silva - 122111054
 */

public class FuncaoMonotona {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();

            if (a < b && b < c && c < d) {
                System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
            } 
            else if (a > b && b > c && c > d) {
                System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
            } 
            else {
                System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
            }
        }
    }
