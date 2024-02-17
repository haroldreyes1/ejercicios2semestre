import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("diga el sueldo básico del empleado: ");
        double sueldoBasico = scanner.nextDouble();
        
        System.out.print("diga el monto por horas extras: ");
        double horasExtras = scanner.nextDouble();
    
        double totalGanado = sueldoBasico + horasExtras;
    
        double descuento = 0.2 * totalGanado;
        
        double sueldoNeto = totalGanado - descuento;
        
        System.out.println("Sueldo básico: $" + sueldoBasico);
        System.out.println("Total del descuento (20%): $" + descuento);
        System.out.println("Total ganado: $" + sueldoNeto);
        
        scanner.close();
    }
}

