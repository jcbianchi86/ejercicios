package Flota;
import java.util.ArrayList;
import java.util.List;

class Flota {
        private String nombre;
    private List<Vehiculo> vehiculosEnFlota;

    // Constructor
    public Flota(String nombre) {
        this.nombre = nombre;
        this.vehiculosEnFlota = new ArrayList<>();
    }

    // Método para agregar un vehículo a la flota
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculosEnFlota.add(vehiculo);
    }

    // Método para mostrar los vehículos en la flota
    public void mostrarVehiculos() {
        System.out.println("");
        System.out.println("=== Vehículos de la flota: " + this.getNombre() + " ===" );
        for (Vehiculo vehiculo : vehiculosEnFlota) {
            System.out.println("--> " + vehiculo.getMarca() + " | " + vehiculo.getModelo() + " | " + vehiculo.getColor() + " | " + vehiculo.getPatente() + " | " + vehiculo.getAnio());
    
        }
    }

    // Getters y setters para el nombre de la flota
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void moverVehiculos(Vehiculo vehiculo) {
        vehiculo.mover();
    }
}