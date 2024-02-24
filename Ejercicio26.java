import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del primer cateto (a): ");
        double a = scanner.nextDouble();

        System.out.print("Ingresa la longitud del segundo cateto (b): ");
        double b = scanner.nextDouble();

        double cCuadrado = calcularCuadradoHipotenusa(a, b);

        System.out.println("El cuadrado de la hipotenusa es: " + cCuadrado);

        scanner.close();
    }
    public static double calcularCuadradoHipotenusa(double a, double b) {
        double cCuadrado = a * a + b * b;
        return cCuadrado;
    }
}

