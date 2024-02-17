import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de su examen matemático: ");
        double nota = scanner.nextDouble();

        if (nota >= 3.0) {
            System.out.println("¡Felicidades! Usted ganó el examen.");
        } else {
            System.out.println("Lo siento, usted no ganó el examen.");
        }
        
        
        scanner.close();
    }
}
    
    

