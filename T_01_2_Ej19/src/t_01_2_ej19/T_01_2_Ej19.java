
package t_01_2_ej19;

import java.util.Scanner;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 25, 2019 11:54:57 PM                            *
 * fecha de finalizacion: Apr 25, 2019 11:54:57 PM                              *
 * nombre del proyecto: T_01_2_Ej19.java                                       *
 ******************************************************************************/

public class T_01_2_Ej19 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 19. Escribe un programa que pregunte cuántos números vas a introducir,   *
    * pida esos números y escriba cuántos negativos has puesto. Usa un bucle   *
    * for.
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int numerosIntroducir;
        Scanner in = new Scanner(System.in);
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.println("Introduzca la cantidad de números que entrarán por teclado: ");
            numerosIntroducir = in.nextInt();
        //BACKEND//
        metodoAnalisisNegativos(numerosIntroducir);
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoAnalisisNegativos:                                    |
     | Recoge recolector números por teclado, y al terminar de recogerlos,     |
     | muestra cuántos números introducidos fueron negativos.                  |
     | Parámetros:                                                             |
     | recolector: parametro que indica la cantidad de numeros a pedir         |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void metodoAnalisisNegativos (int recolector)
    {
        //VARIABLES LOCALES//
        int contadorNegativos = 0;
        Scanner in = new Scanner(System.in);
        //CUERPO DEL METODO//
        for(int contador = 1; contador <= recolector; contador++)
        {
            System.out.println("Introduzca el numero " + contador + ":");
            if(in.nextInt() < 0)
            {
                contadorNegativos++;
            }
        }
        System.out.println("Fin del programa.");
        System.out.println("El total de números negativos introducidos fue: " + contadorNegativos);
    }
}
