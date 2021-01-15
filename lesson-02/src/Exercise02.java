import java.util.Scanner;

/**
 * Escreva um algoritmo para ler um valor
 * (do teclado) e escrever (na tela) o
 * seu antecessor.
 */

public class Exercise02 {
    public static void main(String args[])
    {
        System.out.println("Digite um valor inteiro para saber o seu antecessor");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int antecessor = a - 1;
        System.out.println("O antecessor de " + a + " é: " + antecessor);
        in.close();
    }
}
