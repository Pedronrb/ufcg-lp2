import java.util.Scanner;
import java.util.Arrays;

public class Senha {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[4];
        String[] palavras = new String[4];

        lenumeros(numeros, sc);
        
    
        for(int i=0; i<palavras.length; i++){
            palavras[i] = sc.nextLine();

        }
        
        String senha = String.valueOf(palavras[0].charAt(numeros[0]));
        senha += String.valueOf(palavras[1].charAt(numeros[1]));
        senha += String.valueOf(palavras[2].charAt(numeros[2]));
        senha += String.valueOf(palavras[3].charAt(numeros[3]));
    
        System.out.println(senha);
    }

    private static void leNumeros(int valores[], Scanner sc){
        for(int i=0; i<valores.length; i++){
            valores[i] = Integer.parseInt(sc.nextLine());
        }

}
