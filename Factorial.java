public class Factorial {
    public static void main(String[] args) {
        int N = 10;
        int fact = 1;

        for (int i = N; i > 0; i-- ){
            fact = fact * (i);
        }
        System.out.println("El factorial de " + N + " es igual a " + fact);
    }
}
