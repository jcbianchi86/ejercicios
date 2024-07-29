package Flota;

class Coche extends Vehiculo {
    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    public void mover() {
        System.out.println("El coche está conduciendo");
    }
}