
package t_01_2_ej21;

import java.util.Scanner;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 6, 2019 1:29:26 AM                             *
 * fecha de finalizacion: May 6, 2019 2:19:26 AM (estuve holgazaneando ^-^)    *
 * nombre del proyecto: T_01_2_Ej21.java                                       *
 *                                                                             *
 * Función de la clase:                                                        *
 * 21. Realiza un programa en Java que muestre por pantalla las tablas de      *
 * multiplicar del 1 al 10.                                                    *
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej21 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Pedir el número del que mostrar la tabla, y llamar a mostrarTabla()      *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int numeroTabla;
        Scanner in = new Scanner(System.in);
        //FRONTEND//
        System.out.print("Introduzca el número del que mostrar la tabla de multiplicación: ");
            //PETICION DE DATOS//
            numeroTabla = in.nextInt();
        //BACKEND//
        mostrarTabla(numeroTabla);
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodo mostrarTabla():                                      |
     | Mostrar la tabla de multiplicacion desde 1 a 10.                        |
     | Parámetros:                                                             |
     | numero: Numero del que mostrar la tabla de multiplicación               |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void mostrarTabla(int numero)
    {
        //VARIABLES LOCALES//
        final short maximoTabla = 10;
        //CUERPO DEL METODO//
        System.out.println("_________________________________________________");
        for(int i = 1; i <= maximoTabla; i++)
        {
            System.out.print("|\t" + numero + "*" + i + " = " + numero*i + " \t|");
            if(i%2 == 0)
                System.out.println("");
        }
        System.out.println("|_______________________||______________________|");
    }
}
