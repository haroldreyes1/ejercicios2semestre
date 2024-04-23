import java.util.Scanner;

public class Ejercicio210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el presupuesto anual del hospital:");
        double presupuestoAnual = scanner.nextDouble();

        
        double presupuestoGinecologia = presupuestoAnual * 0.40;
        double presupuestoTraumatologia = presupuestoAnual * 0.30;
        double presupuestoPediatra = presupuestoAnual * 0.30;

        
        System.out.println("Presupuesto para Ginecología: " + presupuestoGinecologia);
        System.out.println("Presupuesto para Traumatología: " + presupuestoTraumatologia);
        System.out.println("Presupuesto para Pediatría: " + presupuestoPediatra);

        scanner.close();
    }
}

