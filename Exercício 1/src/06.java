import java.util.Random;
import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(50) + 1;
        int escolhaUsuario = 0;
        int tentativas = 0;

        System.out.println("Adivinhe o número de 1 a 50.");

        while (escolhaUsuario != numeroAleatorio) {
            System.out.print("Digite um número: ");
            escolhaUsuario = scanner.nextInt();
            tentativas++;

            if (escolhaUsuario == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número com " + tentativas + " tentativas.");
            } else {
                System.out.println("Tente outro número!");
            }
        }

        scanner.close();
    }
}
