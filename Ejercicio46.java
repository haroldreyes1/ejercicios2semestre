import java.util.Scanner;

public class Ejercicio46 {
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la distancia en millas: ");
        double millas = scanner.nextDouble();

        double metros = convertirMillasAMetros(millas);

        System.out.println(millas + " millas equivalen a " + metros + " metros.");

        scanner.close();
    }

    public static double convertirMillasAMetros(double millas) {
        
        return millas * 1852;
    }
}
}
