import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        System.out.println("Ingrese las 5 notas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        double suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += notas[i];
        }
        double promedio = suma / 5;
        System.out.println("La suma de las notas es: " + suma);
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("El doble de las notas es:");
        for (int i = 0; i < 5; i++) {
            double doble = notas[i] * 2;
            System.out.println("Nota " + (i + 1) + ": " + doble);
        }
        
        scanner.close();
    }
}

