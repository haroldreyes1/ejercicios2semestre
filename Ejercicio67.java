import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Error: Ingrese un número entero positivo.");
        } else {
            long factorial = calcularFactorial(n);
            System.out.println("El factorial de " + n + " es: " + factorial);
        }

        scanner.close();
    }

    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

