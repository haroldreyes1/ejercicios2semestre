public class Ejercicio78 {
    public static void main(String[] args) {
        double monto = 12000; 
        
        double descuento = calcularDescuento(monto);
        
        System.out.println("El descuento aplicado al monto de $" + monto + " es de $" + descuento);
    }

    public static double calcularDescuento(double monto) {
        double descuento = 0;
        if (monto > 10000) {
            descuento = monto * 0.20; 
        } else {
            descuento = monto * 0.10; 
        }
        return descuento;
    }
}

