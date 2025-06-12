import java.util.Scanner;

public class TempoConvertido {
    public static void main(String[] args) {

        int totalSegundos = lerTempo();

        int horas = calcularHoras(totalSegundos);
        int minutos = calcularMinutos(totalSegundos);
        int segundo = calcularSegundos(totalSegundos);

        mostrarTempo(horas, minutos, segundo);
    }

    public static int lerTempo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos: ");
        int segundos = scanner.nextInt();
        scanner.close();
        return segundos;
    }
    public static  int calcularHoras(int segundos){
        return segundos / 3600;
    }
    public static int calcularMinutos(int segundos){
        return (segundos % 3600) / 60;
    }
    public static int calcularSegundos(int segundos){
        return segundos % 60;
    }
    public static void mostrarTempo(int horas, int minutos, int segundos){
        System.out.println(horas + "h " + minutos + "min " + segundos + "seg ");
    }
}
