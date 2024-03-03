import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        double longitudCabelloMetros = edad * 12 * 0.5 / 100;

        System.out.println("La longitud del cabello de la persona es de aproximadamente " + longitudCabelloMetros + " metros.");
    }
}

