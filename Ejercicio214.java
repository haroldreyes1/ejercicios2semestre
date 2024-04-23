import java.util.Scanner;

public class Ejercicio214 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la cantidad invertida por la primera persona:");
        double inversionPersona1 = scanner.nextDouble();

        System.out.println("Ingrese la cantidad invertida por la segunda persona:");
        double inversionPersona2 = scanner.nextDouble();

        System.out.println("Ingrese la cantidad invertida por la tercera persona:");
        double inversionPersona3 = scanner.nextDouble();

        
        double inversionTotal = inversionPersona1 + inversionPersona2 + inversionPersona3;

        
        double porcentajePersona1 = (inversionPersona1 / inversionTotal) * 100;
        double porcentajePersona2 = (inversionPersona2 / inversionTotal) * 100;
        double porcentajePersona3 = (inversionPersona3 / inversionTotal) * 100;

        
        System.out.println("Porcentaje de inversión de la primera persona: " + porcentajePersona1 + "%");
        System.out.println("Porcentaje de inversión de la segunda persona: " + porcentajePersona2 + "%");
        System.out.println("Porcentaje de inversión de la tercera persona: " + porcentajePersona3 + "%");

        scanner.close();
    }
}

