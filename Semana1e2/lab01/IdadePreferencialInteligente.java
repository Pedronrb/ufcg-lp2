package lp2.lab01;

public class IdadePreferencialInteligente{
    public static void main(String[] args) { // Definindo uma função

        int idade = 24;
        int anoAtual = 2023;
        int anoNascimento = 1999;
        boolean gravida = true;
        boolean crianca =  true;


        if(idade >= 60) {
            
            System.out.println("Você tem " + idade + " anos. Você pode usar o atendimento especial.");

        }else{
            System.out.println("Você tem " + idade + " anos. Você ainda não pode usar o atendimento preferencial.");
        }

        if(gravida) {
            System.out.println("Preferencial Gestante.");
        }else {
            System.out.println("Não pode usar o atendimento preferencial.");           
        }

        if(crianca){
            System.out.println("Preferencial pois está com x crianças de colo.");
        }else{
            System.out.println("Não pode usar o atendimento preferencial.");
        }

        System.out.println("Você tem " + (anoAtual - anoNascimento) + " anos");
    }
}