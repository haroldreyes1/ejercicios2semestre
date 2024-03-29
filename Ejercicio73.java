public class Ejercicio73 {
    public static double calcularSueldoNeto(double sueldo) {
        double descuento = 0;
        if (sueldo <= 1000) {
            descuento = sueldo * 0.1;
        } else if (sueldo > 1000 && sueldo <= 2000) {
            descuento = (1000 * 0.1) + ((sueldo - 1000) * 0.05);
        } else {
            descuento = (1000 * 0.1) + (1000 * 0.05) + ((sueldo - 2000) * 0.03);
        }
        double sueldoNeto = sueldo - descuento;
        return sueldoNeto;
    }

    public static void main(String[] args) {
        double sueldo = 2500; 
        double sueldoNeto = calcularSueldoNeto(sueldo);
        double descuento = sueldo - sueldoNeto;
        System.out.println("El descuento es: $" + descuento);
        System.out.println("El sueldo neto del trabajador es: $" + sueldoNeto);
    }
}

