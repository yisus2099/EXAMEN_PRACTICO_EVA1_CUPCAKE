
package arreglos;

/**
 *
 * @author Yo
 */
public class ARREGLOS {

    public static void main(String[] args) {
        int[] Arreglo = new int [15];
        for (int i = 0; i <Arreglo.length; i++) {
       Arreglo [i]= (int)(Math.random()*100 +1 );
       int aleatorio = (int )(Math.random()*100 +1);
       
            
    
     }
        for (int i = 0; i < Arreglo.length; i++) {
            if (Arreglo [i]%2 ==0)
                System.out.println("(" + Arreglo[i] +")" + i);
            
    }
}}


