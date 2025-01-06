import java.util.Scanner;
public class exe04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int numInvert = 0;

        while (num > 0) {
            int digito = num % 10;
            numInvert = numInvert * 10 + digito;
            num = num / 10;
        }

        System.out.println("Número invertido: " + numInvert);

        scanner.close();
    }
}
