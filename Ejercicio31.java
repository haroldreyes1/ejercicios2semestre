import java.util.Scanner;
// Construir un programa que permita calcular el área de un triángulo. El usuario
//ingresará la base y la altura en milímetros y el sistema mostrará los resultados en
//milímetros, centímetros y metros cuadrados respectivamente.

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo en milímetros:");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo en milímetros:");
        double altura = scanner.nextDouble();

        double areaEnMilimetrosCuadrados = (base * altura) / 2;
        double areaEnCentimetrosCuadrados = areaEnMilimetrosCuadrados / 100;
        double areaEnMetrosCuadrados = areaEnCentimetrosCuadrados / 10000; 

        System.out.println("El área del triángulo es:");
        System.out.println("En milímetros cuadrados: " + areaEnMilimetrosCuadrados + " mm^2");
        System.out.println("En centímetros cuadrados: " + areaEnCentimetrosCuadrados + " cm^2");
        System.out.println("En metros cuadrados: " + areaEnMetrosCuadrados + " m^2");

        scanner.close();
    }
}

