
package ejercicio.pkg2.principiantes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class Ejercicio2PRINCIPIANTES {


    public static void main(String[] args) {
        int [] Array1 = new int [10];
       int []Array2 = new int [10];
Scanner entrada = new Scanner(System.in);
        System.out.println("Llenar datos del arreglo 1" );
     
            for (int i = 0; i < Array1.length; i++) {
                System.out.println( " Coloque un numero entero");
                Array1 [i] = entrada.nextInt();
                System.out.println(  Arrays.toString(Array1));
      
            }
            System.out.println("Llenar datos arreglo 2");
        for (int i = 0; i < Array2.length; i++) {
            System.out.println("Coloque un numero entero");
            Array2 [i] = entrada.nextInt();
            System.out.println(Arrays.toString(Array2));
   
            
        }
      
if (Arrays.equals(Array1, Array2)){
    System.out.println(" Son iguales los arreglos");
   
}else { 
    System.out.println("No son iguales los arreglos");
}
    
}
            
        
        
    
}
    

