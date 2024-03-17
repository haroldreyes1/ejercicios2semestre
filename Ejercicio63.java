import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Ingrese valores enteros. El programa sumará los valores mayores a 0.");
        System.out.println("Ingrese un valor en el rango (20-30] o ingrese 0 para finalizar.");

        int valor;
        do {
            System.out.print("Ingrese un valor: ");
            valor = scanner.nextInt();
            if (valor > 0) {
                suma += valor;
            }
        } while (valor != 0 && (valor <= 20 || valor > 30));

        System.out.println("La suma de los valores mayores a 0 introducidos es: " + suma);

        scanner.close();
    }
}

