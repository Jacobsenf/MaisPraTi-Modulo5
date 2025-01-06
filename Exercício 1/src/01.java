import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite o número da operação desejada: ");
        int operacao = scanner.nextInt();

        double resultado;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("A soma de %.2f e %.2f é igual a %.2f\n", num1, num2, resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("A subtração de %.2f e %.2f é igual a %.2f\n", num1, num2, resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("A multiplicação de %.2f e %.2f é igual a %.2f\n", num1, num2, resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("A divisão de %.2f por %.2f é igual a %.2f\n", num1, num2, resultado);
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opação inválida.");
        }

        scanner.close();

    }
}
