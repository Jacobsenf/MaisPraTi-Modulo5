import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números da sequência de Fibonacci você deseja: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.printf("Segue abaixo os %d números da sequência: \n", n);

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
    }
}
