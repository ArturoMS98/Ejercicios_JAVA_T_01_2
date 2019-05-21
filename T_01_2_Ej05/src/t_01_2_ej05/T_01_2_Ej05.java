package t_01_2_ej05;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 18, 2019 3:35:29 PM                            *
 * fecha de finalizacion: Apr 19, 2019 3:09:00 PM                              *
 * nombre del proyecto: T_01_2_Ej05.java                                       *
 *                                                                             *
 ******************************************************************************/
public class T_01_2_Ej05 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 5. Escribe un algoritmo que lea números introducidos aleatoriamente por  *
    *    teclado hasta que el valor introducido sea 0 (cero). A continuación,  *
    *    deberá visualizar el número de introducciones efectuadas y la mayor   *
    *    secuencia de números consecutivos iguales, indicando cuál fue el      *
    *    número que se repitió y cuántas veces seguidas lo hizo.               *
    *                                                                          *
    ***************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        Scanner in = new Scanner(System.in);
        final String MENSAJEINTRODUCCIONES = "Numero de introducciones en el programa: ";
        final String MENSAJENUMERO = "El número que más se repitió fue el: ";
        final String MENSAJEREPETICIONES = "Veces que el número se repitió: ";
        final String MENSAJEPETICION = "Introduzca un número a la secuencia: ";
        int numero;
        int numeroRepetidor = 0;
        int contadorIntroducciones = 0;
        int contadorRepeticiones = 0;
        int recordNumero = 0;
        int recordRepeticiones = 1;
        
        do
        {
            System.out.print(MENSAJEPETICION);
            numero = in.nextInt();
            contadorIntroducciones++;
            if(numero == numeroRepetidor)
            {
                contadorRepeticiones++;
            }
            else
            {
                if(contadorRepeticiones >= recordRepeticiones)
                {
                    recordNumero = numeroRepetidor;
                    recordRepeticiones = contadorRepeticiones;
                }
                contadorRepeticiones = 1;
                numeroRepetidor = numero;
            }
        }while(numero != 0);
        contadorIntroducciones--;
        System.out.println(MENSAJEINTRODUCCIONES + contadorIntroducciones);
        System.out.println(MENSAJENUMERO + recordNumero);
        System.out.println(MENSAJEREPETICIONES + recordRepeticiones);
    }
}
