import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto de la compra en pesos:");
        double montoCompra = scanner.nextDouble();

        double descuento = 0;

        if (montoCompra > 1000) {
            descuento = 0.10 * montoCompra; 
        } else if (montoCompra > 500) {
            descuento = 0.20 * montoCompra; 
        } else {
            descuento = 0; 
        }

        System.out.println("El descuento aplicado es: $" + descuento);

        scanner.close();
    }
}

