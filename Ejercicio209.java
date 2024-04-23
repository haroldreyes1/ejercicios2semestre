import java.util.Scanner;

public class Ejercicio209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el número de reprobados:");
        int reprobados = scanner.nextInt();

        System.out.println("Ingrese el número de aprobados:");
        int aprobados = scanner.nextInt();

        System.out.println("Ingrese el número de sobresalientes:");
        int sobresalientes = scanner.nextInt();

        
        int totalAlumnos = reprobados + aprobados + sobresalientes;

        
        double porcentajeSuperados = ((double) (aprobados + sobresalientes) / totalAlumnos) * 100;

        
        double porcentajeReprobados = ((double) reprobados / totalAlumnos) * 100;
        double porcentajeAprobados = ((double) aprobados / totalAlumnos) * 100;
        double porcentajeSobresalientes = ((double) sobresalientes / totalAlumnos) * 100;

        
        System.out.println("Tanto por ciento de alumnos que han superado la asignatura: " + porcentajeSuperados + "%");
        System.out.println("Tanto por ciento de reprobados: " + porcentajeReprobados + "%");
        System.out.println("Tanto por ciento de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Tanto por ciento de sobresalientes: " + porcentajeSobresalientes + "%");

        scanner.close();
    }
}

