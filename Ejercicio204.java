import java.util.Scanner;

public class Ejercicio204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el valor en dólares:");
        double dolares = scanner.nextDouble();

        
        double tasaDeCambio = 8.08;

        
        double bolivianos = dolares * tasaDeCambio;

        
        System.out.println("El valor en bolivianos es: " + bolivianos + " Bs.");

        scanner.close();
    }
}

