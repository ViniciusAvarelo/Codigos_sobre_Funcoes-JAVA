import java.util.Scanner;

public class Exercicio4 {
        public static boolean isPar(int a) {
        return (a % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;

        while (contador == 1){
             System.out.println("Digite um numero inteiro: ");
             int nr1 = entrada.nextInt();

            boolean imparOUpar = isPar(nr1);

            if(imparOUpar == true){
            System.out.println("Número par");

            } else {
            System.out.println("Número ímpar");

            }
            entrada.nextLine();
            System.out.println("Deseja continuar? (sim / nao)");
            String continuacao = entrada.nextLine();
            System.out.println();
        
            if(continuacao.equals("nao") || continuacao.equals("N") || continuacao.equals("n") 
            || continuacao.equals("Nao")) {
            contador = 0;

            }
        } entrada.close();
    } 
}
