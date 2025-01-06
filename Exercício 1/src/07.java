import java.util.Scanner;

public class exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.trim().split("\\s+");

        int numeroPalavras = palavras.length;

        System.out.println("A quantidade de palavras na frase é: " + numeroPalavras);

        scanner.close();
    }
}
