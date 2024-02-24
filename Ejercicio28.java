import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para la cuenta regresiva: ");
        int numero = scanner.nextInt();

        System.out.println("Cuenta regresiva:");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}

