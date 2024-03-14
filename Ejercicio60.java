import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;

        System.out.println("Introduce números. Introduce 0 para terminar.");

        while (true) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                break; 
            }
            
            if (numero > 0) {
                contador++; 
            }
        }

        System.out.println("Cantidad de valores mayores que cero leídos: " + contador);
    }
}

