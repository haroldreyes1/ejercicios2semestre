import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingresa el segundo número:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Ingresa el tercer número:");
        double num3 = scanner.nextDouble();
        
        double promedio = (num1 + num2 + num3) / 3;
    
        double suma = num1 + num2 + num3;
        
        System.out.println("El promedio de los tres números es: " + promedio);
        System.out.println("La suma de los tres números es: " + suma);
        

        scanner.close();
    }
}
