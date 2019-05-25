package t_01_2_ej27;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 10, 2019 11:44:12 AM                           *
 * fecha de finalizacion: May 18, 2019 11:52:04 AM                             *
 * nombre del proyecto: T_01_2_Ej27.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 27. Escribir un programa que pida un número entero y determine si es        *
 *     múltiplo de 2 y de 5.                                                   *
 *  //NOTA: CONTROL + ESPACIO -> PREDICCION VARIABLE
 *  //NOTA: CONTROL + SHIFT + I -> INTRODUCE 
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej27 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Pide un número y calcula si es múltiplo o no de 2 y 5.                   *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final int multiplo1 = 2;
        final int multiplo2 = 5;
        int numero;
        Scanner in = new Scanner(System.in);        
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.println("Introduzca el número a determinar si es múltiplo de: " + multiplo1 + " y " + multiplo2);
            numero = in.nextInt();
        //BACKEND//
        if(numero%multiplo1 == 0)
        {
            System.out.println("El numero es multiplo de " + multiplo1);
            if(numero%multiplo2 == 0)
                System.out.println("El numero es multiplo de " + multiplo2);
        }
        else if(numero%multiplo2 == 0)
            System.out.println("El numero es multiplo de " + multiplo2);
        else
            System.out.println("El numero no es multiplo ni de " + multiplo1 + " ni de " + multiplo2);
    }
}