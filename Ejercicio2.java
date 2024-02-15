import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese un texto: ");
        String texto = scanner.nextLine();
        System.out.println("El texto ingresado es: " + texto);

        scanner.close();
    }
}

    
