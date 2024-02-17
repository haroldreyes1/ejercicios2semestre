import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("programa que calcula la media aritmética de tres números.");
        System.out.println("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        double media = calcularMedia(numero1, numero2, numero3);

        System.out.println("La media aritmética de los tres números es: " + media);

        scanner.close();
    }

    public static double calcularMedia(double nume1, double nume2, double nume3) {
        double media = (nume1 + nume2 + nume3) / 3;
        return media;
    }
}

