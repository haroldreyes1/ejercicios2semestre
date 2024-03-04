public class Ejercicio43 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int menorNumero = encontrarMenor(num1, num2);
        System.out.println("El número menor entre " + num1 + " y " + num2 + " es: " + menorNumero);
    }
    
    public static int encontrarMenor(int a, int b) {
        
        return (a < b) ? a : b;
    }
}

