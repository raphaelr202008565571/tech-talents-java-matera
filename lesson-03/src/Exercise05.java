import java.util.Scanner;

/**
 * Escreva um algoritmo em Java que seja
 * capaz de fazer as seguintes operações
 * matemáticas (adição, subtração, multiplicação
 * e divisão). Todas as operações serão entre
 * dois valores. No começo do algoritmo pergunte
 * ao usuário qual operação ele deseja fazer e
 * quais são os valores.
 */

public class Exercise05 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int somaDosValores = 0;

        System.out.println("Informe o 1 num");
        int valor = in.nextInt();

        int menorValor = valor;
        int maiorValor = valor;

        somaDosValores += valor;

        System.out.println("Informe o 2 num");
        valor = in.nextInt();

        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        System.out.println("Informe o 3 num");
        valor = in.nextInt();

        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        System.out.println("Informe o 4 num");
        valor = in.nextInt();

        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;


        System.out.println("Informe o 5 num");
        valor = in.nextInt();

        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        System.out.println("Informe o 6 num");
        valor = in.nextInt();

        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        System.out.println("Informe o 7 num");
        valor = in.nextInt();

        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        System.out.println("Informe o 8 num");
        valor = in.nextInt();

        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        System.out.println("Informe o 9 num");
        valor = in.nextInt();

        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;

        System.out.println("Informe o 10 num");
        valor = in.nextInt();

        if (valor > maiorValor) {
            maiorValor = valor;
        }

        if (valor < menorValor) {
            menorValor = valor;
        }

        somaDosValores += valor;
        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("O menor valor digitado foi: " + menorValor);

        System.out.print("A média dos valores é: " + somaDosValores / 10.0);

    }
}
