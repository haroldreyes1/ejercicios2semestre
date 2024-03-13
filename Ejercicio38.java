import java.util.Scanner;
//Una persona por cada año de vida debe consumir 8 kilogramos de fruta. Dada la
//edad de una persona, imprimir cuántos gramos de fruta ha consumido y
//adicionalmente si una manzana pesa en promedio 4 gramos, determinar cuántas
//manzanas ha consumido.

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

