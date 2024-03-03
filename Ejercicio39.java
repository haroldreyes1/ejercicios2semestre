import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el año de nacimiento de " + nombre + ": ");
        int añoNacimiento = scanner.nextInt();
        System.out.print("Ingrese el año actual: ");
        int añoActual = scanner.nextInt();
        int edad = añoActual - añoNacimiento;
        int diasDurmiendo = (int) (edad * 365 * 0.34);
        System.out.println(nombre + " ha dormido aproximadamente " + diasDurmiendo + " días en su vida.");
    }
}

