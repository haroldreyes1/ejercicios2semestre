import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();
        double suma = numero1 + numero2;
        System.out.println("Suma: " + suma);

        double resta = numero1 - numero2;
        System.out.println("Resta: " + resta);
        double multiplicacion = numero1 * numero2;
        System.out.println("Multiplicación: " + multiplicacion);
        if (numero2 != 0) {
            double division = numero1 / numero2;
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        if (numero2 != 0) {
            double modulo = numero1 % numero2;
            System.out.println("Resto de la división (módulo): " + modulo);
        } else {
            System.out.println("No se puede calcular el resto de la división por cero.");
        }

        scanner.close();
    }
}

