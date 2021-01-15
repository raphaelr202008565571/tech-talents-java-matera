import java.util.Scanner;

/**
 * Escreva um algoritmo para ler o número
 * total de eleitores de um município, o número
 * de votos brancos, nulos e válidos. Calcular
 * e escrever o percentual que cada um representa
 * em relação ao total de eleitores.
 */

public class Exercise04 {
    public static double calculaPercentualX(double tDeElei, double totalX) {

        double percentual = totalX * 100 / tDeElei;
        return percentual;

    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de votos");
        int totalVotos = scanner.nextInt();
        System.out.println("Digite o total de votos em branco");
        int totalVotosBrancos = scanner.nextInt();
        System.out.println("Digite o total de votos nulos");
        int totalVotosNulos = scanner.nextInt();
        System.out.println("Digite o total de votos validos");
        int totalVotosValidos = scanner.nextInt();

        System.out.println("A quantidade total de votos é: " + totalVotos);

        System.out.println("A quantidade total de votos em branco é: " + totalVotosBrancos);

        System.out.println("A quantidade total de votos nulos é: " + totalVotosNulos);

        System.out.println("A quantidade total de votos validos é: " + totalVotosValidos);

        double percentualVotosBrancos = Exercise04.calculaPercentualX(totalVotos, totalVotosBrancos);

        double percentualVotosNulos = Exercise04.calculaPercentualX(totalVotos, totalVotosNulos);

        double percentualVotosValidos = Exercise04.calculaPercentualX(totalVotos, totalVotosValidos);

        System.out.println("-----------");

        System.out.println("O percentual total de votos em branco é: " + String.format("%.2f", percentualVotosBrancos));

        System.out.println("O percentual total de votos nulos é: " + String.format("%.2f", percentualVotosNulos));

        System.out.println("O percentual total de votos validos é: " + String.format("%.2f", percentualVotosValidos));

        scanner.close();
}
