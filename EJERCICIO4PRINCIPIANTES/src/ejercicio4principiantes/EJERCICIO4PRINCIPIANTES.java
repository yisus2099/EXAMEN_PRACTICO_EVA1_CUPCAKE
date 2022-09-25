package ejercicio4principiantes;

/**
 *
 * @author 
 */
public class EJERCICIO4PRINCIPIANTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 20;
        int[] array1 = new int[valor];
        int[] trip = new int[valor];
        int[] fin = new int[valor];
        int[] fin2 = new int[valor];
        int vTriple = 0, a = 0, c = 0;
        int cont = 0, aux = 0;

        //Llenar  
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 20) + 1;
        }

        //Primero en repetirse tres veces - Parte 1
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                for (int k = 0; k < array1.length; k++) {
                    if (i != j && k != i && j != k && array1[i] == array1[j] && array1[i] == array1[k] && array1[j] == array1[k]) {
                        trip[j] = array1[j];
                    }
                }
            }
        }

        //Primero en repetirse tres veces - Parte 2
        for (int i = 0; i < trip.length; i++) {
            if (trip[i] > 0) {
                c = c + 1;
                fin[c - 1] = trip[i];
            }
        }

        //Primero en repetirse tres veces - Parte 3
        vTriple = fin[0];

        //Imprimir
        for (int i = 0; i < array1.length; i++) {
            System.out.print("[ " + array1[i] + " ] ");
        }
        System.out.println("");

        if (vTriple == 0) {
            System.out.println("Ningún número se triplica");
        } else {
            System.out.println("El primer número triplicado es:  " + vTriple);
        }
    }
}
