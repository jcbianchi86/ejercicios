package Flota;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla", "Gris", "KWM903", 2015, 5, true);
        Moto moto1 = new Moto("Honda", "Wave", "Azul", "AA192YDB", 2023, 120, false);
        
        Flota flota1 = new Flota("Flota Sarmiento");
        flota1.agregarVehiculo(coche1);
        flota1.agregarVehiculo(moto1);

        flota1.mostrarVehiculos();



        flota1.moverVehiculos(coche1);  
        flota1.moverVehiculos(moto1);   
        
    }
}