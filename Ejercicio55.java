public class Ejercicio55 {
    public static void main(String[] args) {
        int number = 17; 
        int result = isPrime(number);
        if (result == 1) {
            System.out.println(number + " es un número primo.");
        } else {
            System.out.println(number + " no es un número primo.");
        }
    }

    public static int isPrime(int num) {
        if (num <= 1) {
            return 0; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0; 
            }
        }
        return 1; 
    }
}

