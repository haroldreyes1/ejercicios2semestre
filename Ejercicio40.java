import java.util.Scanner;
//Construir una calculadora minera, la cual permita saber a cuántos pesos equivalen
//los kilos de oro ingresados. El usuario deberá ingresar tanto los kilos a convertir
//como el precio en pesos por onza de oro. Recordemos que una onza equivale a
//28.3495 gramos y que 1000 gramos son un kilo.

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

