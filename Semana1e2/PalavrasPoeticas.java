import java.util.Scanner;
/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Pedro Nascimento da Silva - 122111054
 */
public class PalavrasPoeticas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palavra1 = sc.next();
        String palavra2 = sc.next();
        

        if(palavra1.charAt(0) == (palavra2.charAt(0)) &&
         palavra1.charAt(palavra1.length() - 1) == palavra2.charAt(palavra2.length() - 1) ){
            System.out.println("S");
            }else{
                System.out.println("N");
            }
            
            }        

}
