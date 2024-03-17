import java.util.Scanner;

public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        long sumaFactoriales = calcularSumaFactoriales(n);
        System.out.println("La suma de factoriales desde 1 hasta " + n + " es: " + sumaFactoriales);

        scanner.close();
    }

    public static long calcularSumaFactoriales(int n) {
        long suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += calcularFactorial(i);
        }
        return suma;
    }

    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

