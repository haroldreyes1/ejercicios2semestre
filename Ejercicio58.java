public class Ejercicio58 {
    public static void main(String[] args) {
        int horasTrabajadas = 40; 
        double valorPorHora = 10.5; 

        double salario = calcularSalario(horasTrabajadas, valorPorHora);

        System.out.println("El salario es: " + salario);
    }

    
    public static double calcularSalario(int horasTrabajadas, double valorPorHora) {
        return horasTrabajadas * valorPorHora;
    }
}

