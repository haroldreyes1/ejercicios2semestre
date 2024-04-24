import java.util.Scanner;
public class Ejercicio219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el valor de N:");
        int N = scanner.nextInt();

        
        if (N <= 0) {
            System.out.println("N debe ser un número positivo.");
        } else {
            
            int suma = 0;
            int numeroPar = 2;

            
            for (int i = 0; i < N; i++) {
                suma += numeroPar;
                numeroPar += 2; 
            }

            
            System.out.println("La suma de los " + N + " primeros números pares es: " + suma);
        }

        scanner.close();
    }
}

