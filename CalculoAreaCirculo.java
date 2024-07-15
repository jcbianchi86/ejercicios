import java.util.Scanner;
public class CalculoAreaCirculo {
    public static void main(String[] args) {
   
         //iniciamos las variables y cantidades

        Scanner lectura = new Scanner (System.in);
        System.out.println("Introducir el valor del Radio en cm: ");
        String lectura1 = lectura.next();
        float radio = Float.parseFloat(lectura1);
            
        int coeficiente = 1500;
        
        //definimos la variable resultado
        double resultado;
        double perimetro;
        
        //calculo el porcentaje
         resultado = radio * radio * 3.14;
         perimetro = 2 * radio * 3.14;
        
        //mostramos todo en pantalla
        System.out.println("------------------------------------------------------");
        System.out.println("Radio del Círculo " + radio + " cm.");
        System.out.println("Área del Círculo = " + resultado + " cm^2.");
        System.out.println("Perímetro del Círculo = " + perimetro + " cm.");
        System.out.println("------------------------------------------------------");

    }
}
