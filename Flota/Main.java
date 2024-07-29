package Flota;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla");
        Moto moto = new Moto("Yamaha", "MT-07");
        
        Flota flota = new Flota();
        flota.moverVehiculo(coche);  // Imprime: El coche está conduciendo
        flota.moverVehiculo(moto);   // Imprime: La moto está acelerando
        
        System.out.println(coche.getMarca());   // Imprime: Toyota
        System.out.println(moto.getModelo());   // Imprime: MT-07
    }
}