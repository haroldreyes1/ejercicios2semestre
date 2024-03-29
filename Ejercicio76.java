public class Ejercicio76 {
    public static void main(String[] args) {
        int numero = 432; 
        
        int cifras = contarCifras(numero);
        
        System.out.println("El número de cifras de " + numero + " es: " + cifras);
    }

    public static int contarCifras(int numero) {
        
        String numeroComoCadena = Integer.toString(numero);
        
        return numeroComoCadena.length();
    }
}

