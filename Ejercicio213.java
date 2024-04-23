import java.util.Scanner;

public class Ejercicio213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el tiempo cronometrado para el lunes (en minutos):");
        double tiempoLunes = scanner.nextDouble();

        System.out.println("Ingrese el tiempo cronometrado para el miércoles (en minutos):");
        double tiempoMiercoles = scanner.nextDouble();

        System.out.println("Ingrese el tiempo cronometrado para el viernes (en minutos):");
        double tiempoViernes = scanner.nextDouble();

        
        double tiempoPromedio = (tiempoLunes + tiempoMiercoles + tiempoViernes) / 3;

        
        System.out.println("El tiempo promedio en una semana cualquiera es: " + tiempoPromedio + " minutos");

        scanner.close();
    }
}

