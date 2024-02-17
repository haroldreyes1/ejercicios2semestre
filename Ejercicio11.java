import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la longitud del rectangulo");
        double longitud = scanner.nextDouble();

        System.out.println("ingrese la anchura del rectangulo");
        double anchura = scanner.nextDouble();

        double area = longitud * anchura;

        System.out.println("El área del rectangulo es: " + area);
        
        scanner.close();




    }
}

