import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Pedro Nascimento da Silva - 122111054
 */
public class Calculadora {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String simbolos = sc.next();
    
    if(!"+-*/".contains(simbolos)){
        System.out.println("ENTRADA INVALIDA");
        return;
    }

    float valor1 = sc.nextFloat();
    float valor2 = sc.nextFloat();

    if (simbolos.equals("+")){
       System.out.println("RESULTADO: " + (valor1 + valor2) );
    }
    else if (simbolos.equals("-")){
        System.out.println("RESULTADO: " + (valor1 - valor2) );   
    }
    else if (simbolos.equals("*")){
        System.out.println("RESULTADO: " + (valor1 * valor2) );   
    }
    else{
        if (valor2 == 0.0){
            System.out.println("ERRO");
        }else{
            System.out.println("RESULTADO: " + (valor1 / valor2));
        }
    }
    

   } 
}
