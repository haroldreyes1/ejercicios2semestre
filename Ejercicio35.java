import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas:");
        double horasTrabajadas = scanner.nextDouble();

        System.out.println("Ingrese la tarifa por hora:");
        double tarifaPorHora = scanner.nextDouble();

        double salario;

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * tarifaPorHora;
        } else {
            double horasNormales = 40;
            double horasExtras = horasTrabajadas - horasNormales;
            double tarifaExtra = tarifaPorHora * 1.5; 
            salario = (horasNormales * tarifaPorHora) + (horasExtras * tarifaExtra);
        }

        System.out.println("El salario del profesor es: $" + salario);

        scanner.close();
    }
}

