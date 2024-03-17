import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        int suma = calcularSumaSerie(n);
        System.out.println("La suma de la serie es: " + suma);

        scanner.close();
    }

    public static int calcularSumaSerie(int n) {
        
        int primerTermino = 21;
        int ultimoTermino = 21 + n - 1;
        int suma = (n * (primerTermino + ultimoTermino)) / 2;
        return suma;
    }
}

