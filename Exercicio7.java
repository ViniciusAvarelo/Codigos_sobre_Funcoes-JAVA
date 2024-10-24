import java.util.Scanner;

public class Exercicio7 {
    public static int calcularFatorial(int nr){;
        
        int fatorial = 1;
        for (int i = 1; i <= nr; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o número inteiro que será fatorado: ");
        int nr = entrada.nextInt();

        int fatorado = calcularFatorial(nr);
        System.out.println(" o fatorial do número " + nr + " é: " + fatorado);
        System.out.println();
        
        entrada.close();
    }
}
