import java.util.Scanner;

public class CalcularMediaNota {
    public static void main(String[] args) {
        System.out.println("Digite a nota do aluno: ");

        Scanner scanner = new Scanner(System.in);

        int nota = scanner.nextInt();

        if (nota > 6){
            System.out.println("Aluno Aprovado ! ");
        }
        else if (nota >= 4 && nota <=6)
        System.out.println("Aluno deve Verificar Suplementar");
        else{
            System.out.println("Aluno Reprovado");
        }
        scanner.close();

    }
}
