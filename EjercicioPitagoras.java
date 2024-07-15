package Ejercicios;

public class EjercicioPitagoras {
    public static void main(String[] args) {
        
        //iniciamos los catetos
        int cateto1 = 4;
        int cateto2 = 3;

        //definimos la hipotenusa
        double hipo;

        //calculo hipotenusa
        hipo = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);

        //mostramos todo en pantalla
        System.out.println("Cateto 1 = " + cateto1);
        System.out.println("Cateto 2 = " + cateto2);
        System.out.println("Hipotenusa = " + hipo);

    }
    
}
