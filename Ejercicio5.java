import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("programa que calcula el área de un rombo.");
        System.out.println("Ingrese la longitud de la diagonal superior: ");
        double diagonalSuperior = scanner.nextDouble();

        System.out.println("Ingrese la longitud de la diagonal inferior: ");
        double diagonalInferior = scanner.nextDouble();

        double area = calcularAreaRombo(diagonalSuperior, diagonalInferior);

        System.out.println("El área del rombo es: " + area);

        scanner.close();
    }

    public static double calcularAreaRombo(double diagonalSuperior, double diagonalInferior) {
        double area = (diagonalSuperior * diagonalInferior) / 2;
        return area;
    }
}

