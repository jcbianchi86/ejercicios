import java.util.Scanner;
public class ConversorDolar {
    public static void main(String[] args) {
   
         //iniciamos las variables y cantidades

        Scanner lectura = new Scanner (System.in);
        System.out.println("Introducir valor en dólares:");
        String lectura1 = lectura.next();
        float cantidad1 = Float.parseFloat(lectura1);
            
        int coeficiente = 1500;
        
        //definimos la variable resultado
        double resultado;
        
        //calculo el porcentaje
         resultado = cantidad1 * coeficiente;
        
        //mostramos todo en pantalla
        System.out.println("------------------------------------------------------");
        System.out.println("Cantidad en dólares a convertir = u$s " + cantidad1);
        System.out.println("Valor de 1 u$S = $" + coeficiente);
        System.out.println("Conversión = $" + resultado);
        System.out.println("------------------------------------------------------");

    }
}
