
package ejercicio5principiantes;

/**
 *
 * @author Yo
 */
public class EJERCICIO5PRINCIPIANTES {

    private static Object Array1;

    public static void main(String[] args) {
       int [] Array1 = new int  [15];
 for (int i = 0; i <15; i++) {
       Array1 [i]= ((int)(Math.random()*100 ) ) ;
       int aleatorio = ((int )(Math.random()*100));
if (Array1 [i]%2==0 ){
        System.out.println("Dato par " + (i+1));
        
}else {
    System.out.println("Dato impar" +(i+1));
}
    
        
}
     

        }
    }
    




