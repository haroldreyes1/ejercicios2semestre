import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int suma = calcularSumaImpares(n);
        System.out.println("La suma de los primeros " + n + " números impares es: " + suma);

        scanner.close();
    }

    public static int calcularSumaImpares(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 2 * i - 1;
        }
        return suma;
    }
}

