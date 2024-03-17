import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int suma = calcularSuma(n);
        System.out.println("La suma de los primeros " + n + " números enteros es: " + suma);

        scanner.close();
    }

    public static int calcularSuma(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}

