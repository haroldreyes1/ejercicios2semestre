import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();
        
        
        if (numero1 > numero2) {
            System.out.println("El primer número ingresado es mayor: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El segundo número ingresado es mayor: " + numero2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}

