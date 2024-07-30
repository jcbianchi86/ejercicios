package Flota;

class Coche extends Vehiculo {
    
    private int puertas;
    private Boolean esAutomatico;
    
    public Coche(String marca, String modelo, String color, String patente, int anio, int puertas, Boolean esAutomatico) {
        super(marca, modelo, color, patente, anio);
        this.puertas = puertas;
        this.esAutomatico = esAutomatico; 
    }

    public int getPuertas() {
        return puertas;
    }
    
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public Boolean getesAutomatico() {
        return esAutomatico;
    }
    
    public void setesAutomatico(Boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }
    
    @Override
    public void mover() {
        System.out.println("El coche está en movimiento");
    }

    @Override
    public String toString() {
        return "Auto: " + this.getMarca() + " " + this.getModelo();
    }
}