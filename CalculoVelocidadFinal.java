import java.util.Scanner;
public class CalculoVelocidadFinal {
    public static void main(String[] args) {
   
         //iniciamos las variables y cantidades

        Scanner lectura = new Scanner (System.in);
        System.out.println("Introducir velocidad Inicial: ");
        String lectura1 = lectura.next();
        float vi = Float.parseFloat(lectura1);

       
        System.out.println("Introducir el tiempo de caida: ");
        String lectura2 = lectura.next();
        float t = Float.parseFloat(lectura2);
            
        
        
        //definimos la variable resultado
        double vf;
        double perimetro;
        
        //calculo el porcentaje
         vf = vi + 9.8 * t;
         
        
        //mostramos todo en pantalla
        System.out.println("------------------------------------------------------");
        System.out.println("Velocidad Inicial: " + vi );
        System.out.println("Tiempo de Caida = " + t);
        System.out.println("Velocidad Final de Caida = " + vf);
        System.out.println("------------------------------------------------------");

    }
}
