import java.util.Scanner;
//Que permita leer el valor correspondiente a una distancia en millas y las visualice
//expresadas en metros. Sabiendo que 1 milla marina equivale a 1852 metros.
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
