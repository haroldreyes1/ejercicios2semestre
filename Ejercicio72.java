public class Ejercicio72 {
    public static double calcularSalario(int horasTrabajadas, double tarifaPorHora) {
        double salario = 0;
        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * tarifaPorHora;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - horasNormales;
            salario = (horasNormales * tarifaPorHora) + (horasExtras * (1.5 * tarifaPorHora));
        }
        return salario;
    }

    public static void main(String[] args) {
        int horasTrabajadas = 45; 
        double tarifaPorHora = 10.0; 
        double salario = calcularSalario(horasTrabajadas, tarifaPorHora);
        System.out.println("El salario del trabajador es: $" + salario);
    }
}

