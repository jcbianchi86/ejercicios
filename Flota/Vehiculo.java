package Flota;

abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String color;
    protected String patente;
    protected int anio;
    
    
    public Vehiculo(String marca, String modelo, String color, String patente, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.patente = patente;
        this.anio = anio;
        
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }
    
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAnio() {
        return anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public abstract void mover();
}