import java.util.Scanner;
public class Ejercicio205 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el monto en bolivianos:");
        double bolivianos = scanner.nextDouble();

       
        System.out.println("Ingrese el tipo de cambio (1 $us. = X Bs.):");
        double tipoDeCambio = scanner.nextDouble();

        
        double dolares = bolivianos / tipoDeCambio;

        
        System.out.println("El monto equivalente en dólares es: " + dolares + " $us.");

        scanner.close();
    }
}

