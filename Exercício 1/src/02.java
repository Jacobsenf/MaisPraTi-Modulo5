import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine();
        String primeiraPalavra = palavra;
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        if (primeiraPalavra.equalsIgnoreCase(palavraInvertida)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        scanner.close();
    }
}
