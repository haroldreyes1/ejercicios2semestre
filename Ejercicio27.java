import java.util.Scanner;
public class Ejercicio27{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("¿Eres masculino (M) o femenino (F)?: ");
        String genero = scanner.nextLine();

        
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        
        if (genero.equals("M") || genero.equals("m")) {
            System.out.println("Bienvenido, " + nombre + "!");
        } else if (genero.equals("F") || genero.equals("f")) {
            System.out.println("Bienvenida, " + nombre + "!");
        } else {
            System.out.println("Hola indeciso.");
        }

        scanner.close();
    }
}

    



    
        