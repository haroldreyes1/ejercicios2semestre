public class Ejercicio79 {
    public static void main(String[] args) {
        int voltajePorBombillo = 120; 
        int cantidadBombillos = 3; 

        
        int voltajeTotal = calcularVoltajeTotal(voltajePorBombillo, cantidadBombillos);

        
        System.out.println("El voltaje total de los " + cantidadBombillos + " bombillos es de " + voltajeTotal + " V.");
    }

    public static int calcularVoltajeTotal(int voltajePorBombillo, int cantidadBombillos) {
        
        return voltajePorBombillo * cantidadBombillos;
    }
}

