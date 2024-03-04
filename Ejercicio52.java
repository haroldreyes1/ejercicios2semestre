public class Ejercicio52 {
    public static void main(String[] args) {
        int numero = 3;
        escribirTablaMultiplicar(numero);
    }
    
    public static void escribirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del número " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

