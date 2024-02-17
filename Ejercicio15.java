import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if(edad >= 18) {
            System.out.println("es mayor de edad");

        } else if (edad < 18){
            System.out.println("es menor de edad");
        }

        

    }
}
