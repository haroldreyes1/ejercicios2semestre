import java.util.Scanner;

public class Ejercicio211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double precioBocadilloJamón = 15.0;
        double precioBocadilloQueso = 10.0;
        double precioPatatasFritas = 5.0;
        double precioRefresco = 3.0;
        double precioCerveza = 4.0;

        
        System.out.println("Ingrese la cantidad de Bocadillos de Jamón:");
        int cantidadBocadilloJamón = scanner.nextInt();

        System.out.println("Ingrese la cantidad de Bocadillos de Queso:");
        int cantidadBocadilloQueso = scanner.nextInt();

        System.out.println("Ingrese la cantidad de Patatas Fritas:");
        int cantidadPatatasFritas = scanner.nextInt();

        System.out.println("Ingrese la cantidad de Refrescos:");
        int cantidadRefresco = scanner.nextInt();

        System.out.println("Ingrese la cantidad de Cervezas:");
        int cantidadCerveza = scanner.nextInt();

        
        double total = cantidadBocadilloJamón * precioBocadilloJamón +
                       cantidadBocadilloQueso * precioBocadilloQueso +
                       cantidadPatatasFritas * precioPatatasFritas +
                       cantidadRefresco * precioRefresco +
                       cantidadCerveza * precioCerveza;

        
        System.out.println("La cuenta total es: " + total + " Bs.");

        scanner.close();
    }
}

