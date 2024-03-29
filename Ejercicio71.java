import java.util.ArrayList;
import java.util.List;

public class Ejercicio71 {
    public static List<Integer> generateFibonacci(int n) {
        List<Integer> fibSequence = new ArrayList<>();
        int a = 11, b = 23; 
        fibSequence.add(a);
        fibSequence.add(b);
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
            if (b > 10 && b < 30) {
                fibSequence.add(b);
            }
        }
        return fibSequence;
    }

    public static void main(String[] args) {
        int limit = 100; 
        List<Integer> fibonacciSequence = generateFibonacci(limit);
        System.out.println("Serie Fibonacci que cumple con la condición:");
        for (int num : fibonacciSequence) {
            System.out.print(num + " ");
        }
    }
}

