import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTemperaturas = 6;
        int sumaTemperaturas = 0;
        int temperaturaMaxima = Integer.MIN_VALUE;
        int temperaturaMinima = Integer.MAX_VALUE;

        for (int i = 1; i <= totalTemperaturas; i++) {
            System.out.print("Ingrese la temperatura exterior cada 4 horas (" + i + "/6): ");
            int temperatura = scanner.nextInt();
            sumaTemperaturas += temperatura;

            if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }

            if (temperatura < temperaturaMinima) {
                temperaturaMinima = temperatura;
            }
        }

        double temperaturaMedia = (double) sumaTemperaturas / totalTemperaturas;
        System.out.println("Temperatura media del día: " + temperaturaMedia);
        System.out.println("Temperatura más alta: " + temperaturaMaxima);
        System.out.println("Temperatura más baja: " + temperaturaMinima);

        scanner.close();
    }
}

