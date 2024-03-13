import java.util.Scanner;
//En un estacionamiento cobran $15.00 por hora o fracción. Diseñe un algoritmo que
//determine cuánto debe pagar un cliente por el estacionamiento de su vehículo,
//conociendo el tiempo de estacionamiento en horas y minutos.

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las horas de estacionamiento:");
        int horas = scanner.nextInt();
        System.out.println("Ingrese los minutos de estacionamiento:");
        int minutos = scanner.nextInt();
        double tiempoTotalHoras = horas + (minutos / 60.0);
        double montoAPagar = tiempoTotalHoras * 15.00;

        System.out.println("El monto a pagar por el estacionamiento es: $" + montoAPagar);

        scanner.close();
    }
}

