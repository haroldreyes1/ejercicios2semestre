public class Ejercicio44 {
    public static double potencia(double base, int exponente) {
        double resultado = 1.0;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        double pi = 3.1415;

        for (int i = 2; i <= 10; i++) {
            double potencia_pi = potencia(pi, i);
            double raiz_cuadrada = Math.sqrt(potencia_pi);
            System.out.println("Potencia de PI^" + i + ": " + potencia_pi);
            System.out.println("Raíz cuadrada de PI^" + i + ": " + raiz_cuadrada);
        }
    }
}

