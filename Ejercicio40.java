import java.util.Scanner;


public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de kilos de oro: ");
        double kilosOro = scanner.nextDouble();
        System.out.print("Ingrese el precio en pesos por onza de oro: ");
        double precioPorOnza = scanner.nextDouble();
        double onzas = kilosOro * 1000 / 28.3495;
        double valorEnPesos = onzas * precioPorOnza;

        System.out.println(kilosOro + " kilos de oro equivalen a " + valorEnPesos + " pesos.");
    }
}

