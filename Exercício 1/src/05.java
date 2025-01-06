import java.util.Scanner;
import java.util.Arrays;

public class exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String primeiraPalavra = scanner.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String segundaPalavra = scanner.nextLine();

        if (primeiraPalavra.length() != segundaPalavra.length()) {
            System.out.println("As palavras não são anagramas.");
            scanner.close();
            return;
        }

        char[] array1 = primeiraPalavra.toCharArray();
        char[] array2 = segundaPalavra.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }

        scanner.close();
    }

}
