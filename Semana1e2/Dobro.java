import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Pedro Nascimento da Silva - 122111054
 */

public class Dobro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        System.out.println("dobro: " + valor * 2 + ", " + "triplo: " + valor * 3);
    }
}
