public class Ejercicio56 {
    public static void main(String[] args) {
        int segundosTotales = 3661; 

        int[] tiempo = convertirSegundos(segundosTotales);
        int horas = tiempo[0];
        int minutos = tiempo[1];
        int segundos = tiempo[2];

        System.out.println(segundosTotales + " segundos equivalen a: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    }
    public static int[] convertirSegundos(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = (segundos % 3600) % 60;
        int[] tiempo = {horas, minutos, segundosRestantes};
        return tiempo;
    }
}

