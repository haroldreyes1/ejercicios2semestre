public class Ejercicio45 {
    public static void main(String[] args) {
        double numero = -3.5;
        int resultado = determinarSigno(numero);
        System.out.println("El número " + numero + " es: " + resultado);
    }
    
    public static int determinarSigno(double numero) {
        if (numero < 0) {
            return -1;
        } else if (numero > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

