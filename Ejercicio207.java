import java.util.Scanner;
public class Ejercicio207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el primer valor real:");
        double valor1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo valor real:");
        double valor2 = scanner.nextDouble();

        
        double suma = valor1 + valor2;
        double resta = valor1 - valor2;
        double division = valor1 / valor2;
        double multiplicacion = valor1 * valor2;

        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        
        
        if (valor2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        System.out.println("Multiplicación: " + multiplicacion);

        scanner.close();
    }
}

