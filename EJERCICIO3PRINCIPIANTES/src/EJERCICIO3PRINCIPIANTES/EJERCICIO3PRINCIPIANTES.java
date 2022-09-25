package EJERCICIO3PRINCIPIANTES;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author
 */
public class EJERCICIO3PRINCIPIANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int valor = 10;
        int[] arreglo1 = new int[valor];
        int[] arreglo2 = new int[valor];
        int[] rep = new int[valor];

        System.out.println("Introduce los 10 valores del Arreglo 1: ");
        for (int i = 0; i < arreglo1.length; i++) {

            arreglo1[i] = input.nextInt();
        }

        System.out.println("Introduce los 10 valores del Arreglo 2: ");
        for (int i = 0; i < arreglo2.length; i++) {

            arreglo2[i] = input.nextInt();
        }

        //Imprimir
        System.out.println("Los valores del Arreglo 1: ");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("[ " + arreglo1[i] + " ]");
        }
        System.out.println("");

        System.out.println("Los valores del Arreglo 2: ");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print("[ " + arreglo2[i] + " ]");
        }
         System.out.println("");

         
        //Determinar si son similares
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo2.length; j++) {
                if (arreglo1[i] == arreglo2[j]) {
                    rep[i] = arreglo1[i];
                }
            }

        }
        if (Arrays.equals(arreglo1, rep)) {
            System.out.println("Son similares");
        } else {
            System.out.println("No son iguales");
        }

        // Fin
    }
}
