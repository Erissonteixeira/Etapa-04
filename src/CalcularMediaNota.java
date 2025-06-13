import java.util.Scanner;

public class CalcularMediaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();

        double media = calculaMedia(nota1, nota2);
        String status = verificarStatus(media);

        System.out.printf("Média do aluno: %.2f\n", media);
        System.out.println("Status: " + status);

        scanner.close();
    }
    public static double calculaMedia(double nota1, double nota2){
        return  (nota1 + nota2) / 2;
    }

    public static String verificarStatus(double media){
        if (media >6){
            return "Aprovado";
        } else if (media >= 4 && media <= 6){
            return "Verificar Suplementar";
        }
        else {
            return "Reprovado";
        }
    }




    }

