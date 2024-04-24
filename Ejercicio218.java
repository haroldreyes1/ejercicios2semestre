import java.util.Scanner;

public class Ejercicio218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el valor de N (positivo y par):");
        int N = scanner.nextInt();

        
        if (N <= 0 || N % 2 != 0) {
            System.out.println("N debe ser un número positivo y par.");
        } else {
            
            int suma = (N * (N + 1)) / 2;

            
            System.out.println("La suma de los " + N + " primeros números naturales es: " + suma);
        }

        scanner.close();
    }
}

