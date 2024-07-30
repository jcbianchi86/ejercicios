package Flota;

public class Moto extends Vehiculo {
    
    private int cilindrada;
    private Boolean esElectrico;
    
    public Moto(String marca, String modelo, String color, String patente, int anio, int cilindrada, Boolean esElectrico) {
        super(marca, modelo, color, patente, anio);
        this.cilindrada = cilindrada;
        this.esElectrico = esElectrico;
    }
    
    @Override
    public void mover() {
        System.out.println("La moto está acelerando");
    }
}
