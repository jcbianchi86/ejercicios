package Flota;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Moto moto1 = new Moto("Yamaha", "MT-07");
        
        Flota flota = new Flota();
        flota.moverVehiculo(coche1);  // Imprime: El coche está conduciendo
        flota.moverVehiculo(moto1);   // Imprime: La moto está acelerando
        
        System.out.println(coche1.getMarca());   // Imprime: Toyota
        System.out.println(moto1.getModelo());   // Imprime: MT-07
    }
}