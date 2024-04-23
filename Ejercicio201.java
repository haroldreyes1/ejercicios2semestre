import java.util.Scanner;
public class Ejercicio201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la calificación del primer parcial:");
        double parcial1 = scanner.nextDouble();

        System.out.println("Ingrese la calificación del segundo parcial:");
        double parcial2 = scanner.nextDouble();

        System.out.println("Ingrese la calificación del tercer parcial:");
        double parcial3 = scanner.nextDouble();

        System.out.println("Ingrese la calificación del examen final:");
        double examenFinal = scanner.nextDouble();

        System.out.println("Ingrese la calificación del trabajo final:");
        double trabajoFinal = scanner.nextDouble();

        
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3.0;

        
        double calificacionFinal = 0.55 * promedioParciales + 0.30 * examenFinal + 0.15 * trabajoFinal;

        
        System.out.println("La calificación final en la materia de Algoritmos es: " + calificacionFinal);

        scanner.close();
    }
}

