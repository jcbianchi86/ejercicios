import java.util.Scanner;
public class Porcentaje {
    public static void main(String[] args) {
        
        //iniciamos las variables y cantidades

        Scanner lectura = new Scanner (System.in);
        System.out.println("Introducir Valor:");
        String lectura1 = lectura.next();
        float cantidad1 = Float.parseFloat(lectura1);
    
        int cantidad2 = 8;

        //definimos la variable resultado
        double resultado;

        //calculo el porcentaje
        resultado = cantidad2 / cantidad1 * 100;

        //mostramos todo en pantalla
        System.out.println("Cantidad 1 = " + cantidad1);
        System.out.println("Cantidad 2 = " + cantidad2);
        System.out.println("Resultado = " + resultado + " %");

    }
    
}
