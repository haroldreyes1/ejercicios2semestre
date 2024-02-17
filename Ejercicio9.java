import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad: ");
        double cantidad = scanner.nextDouble();
        
        double tasaIVA = 0.16; 

        double IVA = cantidad * tasaIVA;
        
        System.out.println("El IVA sobre la cantidad de " + cantidad + " es: " + IVA);
        
        scanner.close();
    }
}

