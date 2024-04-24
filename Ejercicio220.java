import java.util.Scanner;
public class Ejercicio220 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;
        int cantidadNumeros = 0;

        System.out.println("Ingrese una secuencia de números positivos, y finalice con -1:");

        
        int numero = scanner.nextInt();
        while (numero != -1) {
            
            if (numero >= 0) {
                suma += numero;
                cantidadNumeros++;
            } else {
                System.out.println("Error: solo se permiten números positivos. Ingrese de nuevo:");
            }
            numero = scanner.nextInt();
        }

        
        if (cantidadNumeros > 0) {
            double media = (double) suma / cantidadNumeros;
            System.out.println("La media aritmética de la secuencia es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        scanner.close();
    }
}


