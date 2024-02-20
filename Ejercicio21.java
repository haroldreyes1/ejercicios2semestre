public class Ejercicio21 {
    public static void main(String[] args) {
        
        int A = 5;
        int B = 10;

        int temp = A;
        A = B;
        B = temp;

        System.out.println(" Después del intercambio: ");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}

