import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad comprada: ");
        double cantidadComprada = scanner.nextDouble();

        System.out.print("Introduce el precio de la compra: ");
        double precioCompra = scanner.nextDouble();

        System.out.print("Introduce el precio pagado: ");
        double precioPagado = scanner.nextDouble();

        double porcentajeDescontado = calcularPorcentajeDescontado(cantidadComprada, precioCompra, precioPagado);

        System.out.println("El porcentaje descontado es: " + porcentajeDescontado + "%");

        scanner.close();
    }

    public static double calcularPorcentajeDescontado(double cantidadComprada, double precioCompra, double precioPagado) {
        double descuento = precioCompra - precioPagado;
        double porcentajeDescontado = (descuento / (cantidadComprada * precioCompra)) * 100;
        return porcentajeDescontado;
    }
}

