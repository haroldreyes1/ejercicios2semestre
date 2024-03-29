public class Ejercicio74 {
    public static void main(String[] args) {
        int num1 = 15; 
        int num2 = 8;
        int num3 = 20;
        
        
        ordenarNumeros(num1, num2, num3);
    }

    public static void ordenarNumeros(int a, int b, int c) {
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println("Los números ordenados de mayor a menor son: " + a + ", " + b + ", " + c);
    }
}

