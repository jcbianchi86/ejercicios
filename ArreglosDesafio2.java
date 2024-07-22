public class ArreglosDesafio2 {
    public static void main(String[] args) {
// defino e inicializo arreglo
int[] arreglo = {100,0,5,9,16,32,200};
// defino e inicializo variables con el primer elemento del arreglo
int grande1 = arreglo[0];
int pos1 = 1;
int grande2 = arreglo[0];
int pos2 = 1;
// caso que el primer elemento sea el mayor, le asigno el segundo a grande2
if (arreglo[0]>arreglo[1]){
    grande2 = arreglo[1];
    pos2 = 2;
}
// comienzo a evaluar cada elemento del arreglo
for (int i = 1; i < arreglo.length; i++) {
    if (arreglo[i] > grande1){ 
        grande2 = grande1; // paso el #1 a #2
        pos2 = pos1;
        grande1 = arreglo[i]; // lo asigno como #1
        pos1 = i + 1;
        
    }else{
        
        if (arreglo[i] > grande2){ 
            grande2 = arreglo[i]; // caso que el elemento merezca el #2
            pos2 = i +1;
        }
    }
    

}
System.out.println("Primer valor: " + grande1 + " en posición " + pos1);
System.out.println("Segundo valor: " + grande2 + " en posición " + pos2);
}
}
