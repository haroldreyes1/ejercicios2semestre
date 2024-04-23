import java.util.Scanner;
public class Ejercicio215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el kilometraje de la última vez que se reportó:");
        double kilometrajeAnterior = scanner.nextDouble();

        System.out.println("Ingrese el kilometraje actual:");
        double kilometrajeActual = scanner.nextDouble();

        System.out.println("Ingrese los litros de gasolina que se repostaron la última vez:");
        double litrosRepostados = scanner.nextDouble();

        System.out.println("Ingrese la cantidad de gasolina actual:");
        double gasolinaActual = scanner.nextDouble();

        
        double distanciaRecorrida = kilometrajeActual - kilometrajeAnterior;

        
        double consumoMedio = (litrosRepostados / distanciaRecorrida) * 100;

        
        System.out.println("El consumo medio del coche es de: " + consumoMedio + " litros cada 100 kilómetros");

        scanner.close();
    }
}

