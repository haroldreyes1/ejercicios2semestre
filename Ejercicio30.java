import java.util.Scanner;
//Que permita leer el valor correspondiente a una distancia en kilómetros y las
//visualice expresadas en metros.

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la distancia en kilómetros: ");
        float distanciaKm = scanner.nextFloat();
        float distanciaMetros = convertirKilometrosAMetros(distanciaKm);

        System.out.println("La distancia en metros es: " + distanciaMetros + " metros.");

        scanner.close();
    }

    public static float convertirKilometrosAMetros(float distanciaKm) {
        return distanciaKm * 1000; 
    }
}

