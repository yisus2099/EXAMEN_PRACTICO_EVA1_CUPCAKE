package arreglos;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author Yo
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    final int INTENTOS_TOTALES = 4; 
        int intentos = 0;
        int aciertos = 0;
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        char resp;
       
        Random rnd = new Random();
        
        String arrayPalabras[] = new String[6];
        arrayPalabras[0] = "pan";
        arrayPalabras[1] = "gato";
        arrayPalabras[2] = "videojueos";
        arrayPalabras[3] = "celular";
        arrayPalabras[4] = "carro";
        arrayPalabras[5] = "television";
 
        do {
 
       
        int alea = rnd.nextInt(6);
        char[] desguazada = desguaza(arrayPalabras[alea]);
        char[] copia = desguaza(arrayPalabras[alea]); 
       
        char[] tusRespuestas = new char[desguazada.length];
 
        
        for(int i = 0; i < tusRespuestas.length; i++){
            tusRespuestas[i] = '_';
        }
 
        
        System.out.println("Adivina la palabra!");
 
       
        while(intentos < INTENTOS_TOTALES && aciertos != tusRespuestas.length){
            imprimeOculta(tusRespuestas);
           
            System.out.println("\nIntroduce una letra: ");
            resp = teclado.next().toLowerCase().charAt(0);
            
            for(int i = 0; i < desguazada.length; i++){
                if(desguazada[i]==resp){
                    tusRespuestas[i] = desguazada[i];
                    desguazada[i] = ' ';
                    aciertos++;
                }
            }
            intentos++;
        }
       
        if(aciertos == tusRespuestas.length){
            System.out.print("\nFelicidades!! has acertado la palabra: ");
            imprimeOculta(tusRespuestas);
        }
       
        else{
            System.out.print("\nChale! la palabra era: ");
            for(int i = 0; i < copia.length; i++){
                System.out.print(copia[i] + " ");
            }
        }
       
        intentos = 0;
        aciertos = 0;
       
        resp = pregunta("\n\nQuieres volver a jugar?",teclado);
        }while(resp != 'n');
 
    }
 
     
    private static char[] desguaza(String palAzar){
        char[] letras;
        letras = new char[palAzar.length()];
        for(int i = 0; i < palAzar.length(); i++){
            letras[i] = palAzar.charAt(i);
        }
        return letras;
    }
 
    
    private static void imprimeOculta(char[] tusRespuestas){
 
        for(int i = 0; i < tusRespuestas.length; i++){
            System.out.print(tusRespuestas[i] + " ");
        }
    }
 
   
     
    public static char pregunta(String men, Scanner teclado) {
        char resp;
        System.out.println(men + " (s/n)");
        resp = teclado.next().toLowerCase().charAt(0);
        while (resp != 's' && resp != 'n') {
            System.out.println("Error! solo se admite S o N");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
    }
 
} 

    

