import java.util.Scanner;

public class Exercicio5 {
    public static String exibirDiaSemana(int a) {
        switch (a) {
            case 1:
                return "domingo";

            case 2:
                 return "Segunda-feira";

            case 3:
                 return "Terça-feira";

            case 4:
                 return "Quarta-feira";

            case 5:
                 return "Quinta-feira";

            case 6:
                 return "Sexta-feira";

            case 7:
                 return "Sábado";

            default:
            return "Dia da semana inválido!";
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número do dia da semana: ");
        int nrDia = entrada.nextInt();
        String exibir = exibirDiaSemana(nrDia);
        System.out.println(exibir);

        entrada.close();
    }
}
