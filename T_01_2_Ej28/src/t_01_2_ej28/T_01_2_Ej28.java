package t_01_2_ej28;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 10, 2019 11:52:24 PM                             *
 * fecha de finalizacion: May 10, 2019 0:24:00 PM                               *
 * nombre del proyecto: T_01_2_Ej28.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 28. Escribir un programa que permita jugar a doble o nada: El jugador       *
 *     apuesta una cantidad y tira una moneda. Si sale cara obtiene el doble   *
 *     de la cantidad apostada. Si sale cruz la pierde todo.                   *
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej28 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Realiza el programa completo.                                            *
    *                                                                          *
    ***************************************************************************/
    public static void main(String[] args) {
        // VARIABLES LOCALES //
        Scanner in = new Scanner(System.in);
        int random;
        final int dineroInicial = 5;
        int dineroActual = dineroInicial;
        boolean lanzarMoneda;
        boolean otraVuelta = true;
        boolean centinela;
        String peticion;
        // Esqueleto de la aplicacion: //
        do
        {
            System.out.println("Lanzando la moneda:");
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