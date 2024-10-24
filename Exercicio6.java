import java.util.Scanner;

public class Exercicio6 {
    public static int Maior(int[] listaNumeros){
        int maior = listaNumeros[0];
        for (int i = 1; i < listaNumeros.length; i++) {
            if(listaNumeros[i] > maior) {
                maior = listaNumeros[i];
            }
        }   return maior;
    } 
    public static int Menor(int[] listaNumeros){
        int menor = listaNumeros[0];
        for (int i = 1; i < listaNumeros.length; i++) {
            if(listaNumeros[i] < menor) {
                menor = listaNumeros[i];
            }
        }   return menor;
    }
    public static int MediaMaiorMenor(int[] listaNumeros){
        int maior = Maior(listaNumeros);
        int menor = Menor(listaNumeros);
        return (maior + menor) / 2;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] listaNR = new int[5];

        System.out.println("Insira 5 números inteiros!");
        System.out.println("==========================");
        for (int i = 0; i < listaNR.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero inteiro: ");
            listaNR[i] = entrada.nextInt();
        }
        int maior = Maior(listaNR);
        int menor = Menor(listaNR);
        int MediaMaiorMenor = MediaMaiorMenor(listaNR);
        System.out.println("==========================");
        System.out.println("Maior número é: " + maior);
        System.out.println("O menor número é " + menor);
        System.out.println("A média do maior número e do menor número é: " + MediaMaiorMenor);
        System.out.println();
        
        entrada.close();
    }
}
