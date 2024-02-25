import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados:");
        int cantidadEmpleados = scanner.nextInt();

        int contadorSalariosAltos = 0;
        double sumaSalarios = 0;
        int contadorMujeres = 0;
        int contadorHombres = 0;

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Ingrese el sexo del empleado (M para mujer, H para hombre):");
            char sexo = scanner.next().charAt(0);

            System.out.println("Ingrese el salario del empleado:");
            double salario = scanner.nextDouble();
            if (salario > 700) {
                contadorSalariosAltos++;
            }
            sumaSalarios += salario;

            if (sexo == 'M' || sexo == 'm') {
                contadorMujeres++;
            } else if (sexo == 'H' || sexo == 'h') {
                contadorHombres++;
            }
        }
        double promedioSalarios = sumaSalarios / cantidadEmpleados;
        double porcentajeMujeres = (double) contadorMujeres / cantidadEmpleados * 100;
        double porcentajeHombres = (double) contadorHombres / cantidadEmpleados * 100;

        System.out.println("a) Cantidad de personas que ganan más de 700 al mes: " + contadorSalariosAltos);
        System.out.println("b) Promedio de salarios: " + promedioSalarios);
        System.out.println("c) Porcentaje de mujeres que trabajan en la empresa: " + porcentajeMujeres + "%");
        System.out.println("d) Porcentaje de hombres que trabajan en la empresa: " + porcentajeHombres + "%");

        scanner.close();
    }
}

