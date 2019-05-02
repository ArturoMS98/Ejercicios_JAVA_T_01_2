
package t_01_2_ej09;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 20, 2019 2:41:10 PM                            *
 * fecha de finalizacion: Apr 20, 2019 2:48:10 PM                              *
 * nombre del proyecto: T_01_2_Ej09.java                                       *
 ******************************************************************************/

public class T_01_2_Ej09 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 9. Realiza un programa en Java que sume los 100 primeros números         *
    * enteros. Usa el bucle for.                                               *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int i;
        int ENTEROSSUMAR = 5; //Constante que da uno menos del numero de enteros empezando por 1 que se sumarán//
        int suma = 0;
        //BACKEND
        for(i = 1; i <= ENTEROSSUMAR; i++)
        {
            suma += i;
        }
        //FRONTEND//
        System.out.println("La suma de los " + (ENTEROSSUMAR) + " numeros enteros es: " + suma);
    }
}
