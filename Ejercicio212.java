import java.util.Scanner;


public class Ejercicio212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double porcentajeGananciaVendedor = 0.12; 
        double impuestos = 0.06; 

        
        System.out.println("Ingrese el costo total del automóvil:");
        double costoVehiculo = scanner.nextDouble();

        
        double gananciaVendedor = costoVehiculo * porcentajeGananciaVendedor;

        
        double impuestosAplicables = costoVehiculo * impuestos;

        
        double costoTotalConsumidor = costoVehiculo + gananciaVendedor + impuestosAplicables;

        
        System.out.println("El costo total del automóvil para el consumidor es: " + costoTotalConsumidor);

        scanner.close();
    }
}

