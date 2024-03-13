//Crear una función que reciba como parámetro un número entero y escriba la tabla
//de multiplicar de ese número (por ejemplo: para el 3 deberá llegar desde 3x0=0
//hasta 3x10=
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

