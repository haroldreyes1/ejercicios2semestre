import java.util.Scanner;

public class Ejercicio24 {
    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de pulgadas a convertir a centímetros: ");
        
        double pulgadas = scanner.nextDouble();
        double centimetros = pulgadasACentimetros(pulgadas);
        System.out.println(pulgadas + " pulgadas equivalen a " + centimetros + " centímetros.");
        
        scanner.close();
    }
}

