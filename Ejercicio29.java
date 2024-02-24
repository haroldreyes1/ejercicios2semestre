public class Ejercicio29 {
    public static float calcularCubo(float numero) {
        return numero * numero * numero;
    }

    public static void main(String[] args) {
        float numero = 2.5f; 
        float cubo = calcularCubo(numero);
        System.out.println("El cubo de " + numero + " es: " + cubo);
    }
}

