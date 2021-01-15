import java.util.Scanner;

/**
 * Escreva um algoritmo para ler as
 * dimensões de um retângulo (base e altura),
 * calcular e escrever a área do retângulo.
 */

public class Exercise03 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcula a área de um retângulo");

        System.out.println("Digite a base do retângulo");
        float base = scanner.nextFloat();

        System.out.println("Digite a altura do retângulo");
        float altura = scanner.nextFloat();

        float area = base * altura;

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
