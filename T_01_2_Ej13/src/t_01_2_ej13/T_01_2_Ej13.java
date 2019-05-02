
package t_01_2_ej13;

import java.text.DecimalFormat;
import java.util.Scanner;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 20, 2019 4:35:21 PM                            *
 * fecha de finalizacion: Apr 20, 2019 4:47:21 PM                              *
 * nombre del proyecto: T_01_2_Ej13.java                                       *
 ******************************************************************************/

public class T_01_2_Ej13 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 13. Realiza un programa en Java que lea por teclado un entero y muestre  *
    * por pantalla la tabla de multiplicar correspondiente. Cuida tanto el     *
    * formato de entrada como el de salida.                                    *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int entero;
        Scanner in = new Scanner(System.in);
        //FRONTEND//
            //PETICION DE DATOS//
        System.out.print("Introduzca el numero del que mostrar la tabla de multiplicación: ");
        entero = in.nextInt();
        
            //MUESTRA DE TABLA//
        for(int i = 1; i <= 10; i++)
        {
            System.out.print("|" + entero + " * " + i + " = " + (i*entero) + ("|\t"));
            if(i%5 == 0)
                System.out.println("");
        }
        System.out.println("");
    }
}
