import java.util.Scanner;

public class Exercicio3 {
    public static int encontrarMax (int a, int b) {
        return (a > b) ? a : b; // If de uma linha só | Explicação: se a é maior que b então retorna(?) a senão(:) retorna b  
        }

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Encontrar o maior número");
            System.out.println("Digite o primeiro número: ");
            int nr1 = entrada.nextInt();
            System.out.println("Digite o segundo número: ");
            int nr2 = entrada.nextInt();

            int maior = encontrarMax(nr1, nr2);

            System.out.println("O maior número é: " + maior);

            entrada.close();
        }
    }
