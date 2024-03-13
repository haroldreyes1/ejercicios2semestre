import java.util.Scanner;


public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double numero3 = scanner.nextDouble();

        double suma = numero1 + numero2 + numero3;
        System.out.println("La suma de los tres números es: " + suma);

        double multiplicacion = numero1 * numero2 * numero3;
        System.out.println("La multiplicación de los tres números es: " + multiplicacion);

        scanner.close();
    }
}

