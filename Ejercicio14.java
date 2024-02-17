import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un número de cuatro dígitos:");
        int numero = scanner.nextInt();
        
        int primerDigito = numero / 1000;
        int segundoDigito = (numero % 1000) / 100;
        int tercerDigito = (numero % 100) / 10;
        int cuartoDigito = numero % 10;
        
        int suma = primerDigito + segundoDigito + tercerDigito + cuartoDigito;
    
        System.out.println("La suma de los dígitos es: " + suma);
        
        scanner.close();
    }
}

