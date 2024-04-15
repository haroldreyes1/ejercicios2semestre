import java.util.Scanner;
public class Ejercicio141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número para calcular su raíz cuadrada: ");
        double numero = scanner.nextDouble();

        
        double raizCuadrada = calcularRaizCuadrada(numero);

        
        System.out.println("La raíz cuadrada de " + numero + " es aproximadamente: " + raizCuadrada);
    }

    
    public static double calcularRaizCuadrada(double numero) {
        
        double epsilon = 1e-7; 

        
        double aproximacion = numero / 2.0;

        
        while (Math.abs(aproximacion * aproximacion - numero) >= epsilon) {
            
            aproximacion = (aproximacion + numero / aproximacion) / 2.0;
        }

        
        return trunc(aproximacion);
    }

    
    public static double trunc(double numero) {
        if (numero >= 0) {
            return (int) numero;
        } else {
            return (int) numero - 1;
        }
    }
}

