package ejercicio2intermedios;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class EJERCICIO2INTERMEDIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int valor = 15;
        int[] array1 = new int[valor];
        int[] comp = new int[valor];
        int num = 0, c = 0;

        //Llenar
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100) + 1;
        }

        //Imprimir - 1
        System.out.println("Los datos de tu arreglo son: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("[ " + array1[i] + " ] ");
        }
        System.out.println("");

        //Pedir número
        System.out.println("Ingrese el numero que quiera eliminar: ");
        num = input.nextInt();

        //Revisar números
        for (int i = 0; i < array1.length; i++) {
            if (num == array1[i]) {
                for (int j = i; j < (valor - i) + i; j++) {
                    array1[j] = array1[j] - array1[j];
                    break;
                }
            }
        }

        //Compactar
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0) {
                c = c + 1;
                comp[c - 1] = array1[i];
            }
        }

        //Imprimir         
        for (int i = 0; i < comp.length; i++) {
            System.out.print("[ " + comp[i] + " ] ");
        }
        System.out.println("");

    }

}
