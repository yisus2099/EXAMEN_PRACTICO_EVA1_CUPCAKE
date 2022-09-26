/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3intermedios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class EJERCICIO3INTERMEDIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int array[], nElements, aux;

        nElements = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements of the array "));

        array = new int[nElements];

        for (int i = 0; i < nElements; i++) {
            System.out.print((i + 1) + " Enter a number: ");
            array[i] = entry.nextInt();

        }
        for (int i = 0; i < (nElements - 1); i++) {
            for (int j = 0; j < (nElements - 1); j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }

            }
        }
        
        System.out.println("\ndescending ordered array");
        for (int i=(nElements-1); i>=0; i--){
            System.out.print(array[i]+" - ");
         }
        System.out.println("");

    }
}
