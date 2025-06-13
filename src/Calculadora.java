import java.util.Scanner;

public class Calculadora {

    // Métodos estáticos
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public static double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");
        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potenciação");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = somar(num1, num2);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            case 5:
                resultado = potencia(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}