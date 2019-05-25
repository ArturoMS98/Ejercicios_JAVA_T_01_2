package t_01_2_ej30;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 10, 2019 1:13:49 PM                            *
 * fecha de finalizacion: May 10, 2019 1:15:40 PM                              *
 * nombre del proyecto: T_01_2_Ej30.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 30. Modificar el programa del juego de doble o nada para que permita ir     *
 *     jugando hasta que el jugador decida abandonar el juego. El programa     *
 *     debe sacar por pantalla el número de jugadas y el total ganado por el   *
 *     jugador (si ha perdido debe ser una cantidad negativa).                 *
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej30 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Lanzar la moneda mientras no se diga lo contrario o se pierda.           *
    * Nota la necesidad de utilizar métodos en este ejercicio.                 *
    *                                                                          *
    ***************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        Scanner in = new Scanner(System.in);
        int random;
        final int dineroInicial = 5;
        int dineroActual = dineroInicial;
        boolean lanzarMoneda;
        boolean otraVuelta = true;
        boolean centinela;
        String peticion;
        do
        {
            //FRONTEND//
            //PETICION DE DATOS//
            System.out.println("Lanzando la moneda:");
            //BACKEND//
            random = (int)(Math.random()*10);
            if(random < 5)
            {
                lanzarMoneda = true;
                System.out.println("El jugador ha ganado " + dineroActual);
                dineroActual = 2*dineroActual;
                System.out.println("Actualmente el jugador tiene: " + dineroActual);
                System.out.println("Desea lanzar de nuevo la moneda?");
                peticion = in.nextLine();
                do
                {
                    centinela = true;
                    if(peticion.equals("no") || peticion.equals("NO"))
                    {
                        otraVuelta = false;
                        centinela = false;
                    }
                    else if(peticion.equals("si") || peticion.equals("SI"))
                    {
                        otraVuelta = true;
                        centinela = false;
                    }
                    else
                        System.out.println("Por favor, introduzca una opcion valida");
                }while(centinela);
            }
            else
            {
                lanzarMoneda = false;
                System.out.println("El jugador ha perdido " + dineroActual);
                dineroActual = 0;
                otraVuelta = false;
            }
        }while(otraVuelta);
    }
}
