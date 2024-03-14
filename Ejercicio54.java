import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la medida en centímetros: ");
        double centimeters = scanner.nextDouble();

        double inches = centimeters / 2.54;

        System.out.println(centimeters + " centímetros equivalen a " + inches + " pulgadas.");
    }
}

