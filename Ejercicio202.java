import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;



public class Ejercicio202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese su fecha de nacimiento (AAAA-MM-DD):");
        String fechaNacimientoStr = scanner.next();

        
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

        
        LocalDate fechaActual = LocalDate.now();

        
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        
        int edad = periodo.getYears();

        
        System.out.println("Su edad es: " + edad + " años");

        scanner.close();
    }
}

