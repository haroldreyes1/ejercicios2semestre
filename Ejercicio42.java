public class Ejercicio42 {
    public static void main(String[] args) {
        
        double voltiosPorKilovoltio = 1000; 
        double capacidadNaranja = 0.05; 
        double pesoNaranjaGramos = 6; 
        double kilovoltiosNecesarios = 10; 
        
        
        double voltiosNecesarios = kilovoltiosNecesarios * voltiosPorKilovoltio;
        
        
        double naranjasNecesarias = voltiosNecesarios / capacidadNaranja;
        
        
        double pesoTotalToneladas = (naranjasNecesarias * pesoNaranjaGramos) / 1000; 
        
        
        System.out.println("Número de naranjas necesarias: " + naranjasNecesarias);
        System.out.println("Peso total de las naranjas necesarias (toneladas): " + pesoTotalToneladas);
    }
}

