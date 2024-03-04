public class Ejercicio49{
    public static void main(String[] args) {
        String texto = "Hola mundo";
        String primeraLetra = obtenerPrimeraLetra(texto);
        System.out.println("La primera letra del texto \"" + texto + "\" es: " + primeraLetra);
    }
    
    public static String obtenerPrimeraLetra(String texto) {
        
        if (texto != null && texto.length() > 0) {
            
            return texto.substring(0, 1);
        } else {
            
            return "";
        }
    }
}

    
       

