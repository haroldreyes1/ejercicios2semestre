import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del lado del cuadrado:");
        double lado = scanner.nextDouble();
        
        double area = lado * lado;
        
        System.out.println("El área del cuadrado es: " + area);
        
        scanner.close();
    }
}

