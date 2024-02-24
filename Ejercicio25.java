import java.util.Scanner;

public class Ejercicio25 {
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de grados Celsius a convertir a Fahrenheit: ");
        
        double celsius = scanner.nextDouble();
        double fahrenheit = celsiusAFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
        
        scanner.close();
    }
}

