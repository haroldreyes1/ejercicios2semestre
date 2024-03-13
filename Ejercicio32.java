import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del rectángulo en metros:");
        double longitud = scanner.nextDouble();

        System.out.println("Ingrese el ancho del rectángulo en metros:");
        double ancho = scanner.nextDouble();

        double areaEnMetrosCuadrados = longitud * ancho;
        double areaEnCentimetrosCuadrados = areaEnMetrosCuadrados * 10000; 
        double areaEnMilimetrosCuadrados = areaEnCentimetrosCuadrados * 100; 

        System.out.println("El área del rectángulo es:");
        System.out.println("En metros cuadrados: " + areaEnMetrosCuadrados + " m^2");
        System.out.println("En centímetros cuadrados: " + areaEnCentimetrosCuadrados + " cm^2");
        System.out.println("En milímetros cuadrados: " + areaEnMilimetrosCuadrados + " mm^2");

        scanner.close();
    }
}

