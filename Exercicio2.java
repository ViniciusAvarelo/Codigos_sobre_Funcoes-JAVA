public class Exercicio2 {
    
    public static void main(String[] args) {
        System.out.println("Realiza o calculo");
        Calculo(50, 10);
        System.out.println("Fim");
    }

    public static void Calculo (double n1, double n2) {
        double resultado = ((n1 * n2 ) - (n1 + n2)) / (n1 - n2);
        System.out.println("Resultado da equação: " + resultado);
        
    }
}