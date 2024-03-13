import java.util.Scanner;


public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();
        int totalFrutaGramos = edad * 8 * 1000; 
        int cantidadManzanas = totalFrutaGramos / 4;
        System.out.println("La persona ha consumido " + totalFrutaGramos + " gramos de fruta.");

        System.out.println("Esto equivale a aproximadamente " + cantidadManzanas + " manzanas.");

        scanner.close();
    } 
}

