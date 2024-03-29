public class Ejercicio75 {
    public static void main(String[] args) {
        int año = 2000; 
        
        if (esBisiesto(año)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }

    public static boolean esBisiesto(int año) {
        
        
        return (año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0));
    }
}

