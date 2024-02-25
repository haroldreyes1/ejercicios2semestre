import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingrese las horas de estacionamiento:");
        int horas = scanner.nextInt();

        System.out.println("Ingrese los minutos de estacionamiento:");
        int minutos = scanner.nextInt();

        if (minutos <= 10) {
            minutos = 0; 
        }

        if (minutos > 10) {
            horas++;
        }

        double montoAPagar = horas * 15.00;

        System.out.println("El monto a pagar por el estacionamiento es: $" + montoAPagar);

        scanner.close();
    }
}

    

