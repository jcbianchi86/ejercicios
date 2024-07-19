public class EjercicioSumaDiagonal {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        
        int suma = 0;
        
        
        for(int i = 0; i < matriz.length ; i++){
            suma = suma + matriz[i][i];  
        }

        System.out.println("La Suma de los Elementos de la Diagonal es: " + suma);

    }
}
