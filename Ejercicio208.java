import java.util.Scanner;

public class Ejercicio208 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la calificación del primer parcial:");
        double parcial1 = scanner.nextDouble();

        System.out.println("Ingrese la calificación del segundo parcial:");
        double parcial2 = scanner.nextDouble();

        System.out.println("Ingrese la calificación del tercer parcial:");
        double parcial3 = scanner.nextDouble();

        System.out.println("Ingrese la calificación de prácticas:");
        double practicas = scanner.nextDouble();

        System.out.println("Ingrese la calificación de asistencia a clases:");
        double asistencia = scanner.nextDouble();

        
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3.0;

        
        double calificacionFinal = 0.6 * promedioParciales + 0.3 * practicas + 0.1 * asistencia;

        
        System.out.println("La calificación final en la materia de Introducción a la Programación es: " + calificacionFinal);

        scanner.close();
    }
}

