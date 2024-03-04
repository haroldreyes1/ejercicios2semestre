import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        
        double area = calcularAreaRectangulo(base, altura);
        System.out.println("El área del rectángulo es: " + area);

        
        double perimetro = calcularPerimetroRectangulo(base, altura);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        scanner.close();
    }

    
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    
    public static double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }
}

