import java.util.Scanner;
/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Pedro Nascimento da Silva - 122111054
 */
public class PontoFlutuante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor1 = sc.nextFloat();
        float valor2 = sc.nextFloat();
        float media = (valor1 + valor2) / 2;

        if (media >= 7) {
            System.out.println("pass: True!");
        } else {
            System.out.println("pass: False!");
        }
           
    }
    
}
