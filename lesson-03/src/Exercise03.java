import java.util.Scanner;

public class Exercise03 {

    public static void main(String args[])
    {

        Scanner in = new Scanner(System.in);
        int continuarPrograma = 1;

        while (continuarPrograma == 1) {

            System.out.println("Digite o primeiro valor: ");

            int primeiroValor = in.nextInt();

            System.out.println("Digite o segundo valor: ");

            int segundoValor = in.nextInt();

            if (primeiroValor < segundoValor) {
                System.out.println("O primeiro valor digitado é menor: " + primeiroValor);
            } else if (segundoValor < primeiroValor) {
                System.out.println("O segundo valor digitado é menor: " + segundoValor);
            } else {
                System.out.println("Os valores digitados são iguais");
            }

            System.out.println("Deseja continuar o programa s(1)/n(0)?");
            continuarPrograma = in.nextInt();


        }
        in.close();
    }
}
