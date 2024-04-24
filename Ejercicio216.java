import java.util.Scanner;
public class Ejercicio216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese la calificación del examen de Matemáticas:");
        double examenMatematicas = scanner.nextDouble();

        System.out.println("Ingrese la calificación promedio de las tres tareas de Matemáticas:");
        double promedioTareasMatematicas = scanner.nextDouble();

        
        System.out.println("Ingrese la calificación del examen de Física:");
        double examenFisica = scanner.nextDouble();

        System.out.println("Ingrese la calificación promedio de las dos tareas de Física:");
        double promedioTareasFisica = scanner.nextDouble();

       
        System.out.println("Ingrese la calificación del examen de Química:");
        double examenQuimica = scanner.nextDouble();

        System.out.println("Ingrese la calificación promedio de las tres tareas de Química:");
        double promedioTareasQuimica = scanner.nextDouble();

        
        double promedioGeneral = (examenMatematicas + examenFisica + examenQuimica) / 3;

        
        System.out.println("El promedio general en las tres materias más difíciles es: " + promedioGeneral);

        
        System.out.println("El promedio en Matemáticas es: " + ((examenMatematicas * 0.9) + (promedioTareasMatematicas * 0.1)));
        System.out.println("El promedio en Física es: " + ((examenFisica * 0.8) + (promedioTareasFisica * 0.2)));
        System.out.println("El promedio en Química es: " + ((examenQuimica * 0.85) + (promedioTareasQuimica * 0.15)));

        scanner.close();
    }
}

