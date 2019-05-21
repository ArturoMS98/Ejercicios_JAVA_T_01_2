package t_01_2_ej09;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 20, 2019 2:41:10 PM                            *
 * fecha de finalizacion: Apr 20, 2019 2:48:10 PM                              *
 * nombre del proyecto: T_01_2_Ej09.java                                       *
 * @version 1.1; tiempo de version: 4 minutos 34 segundos                      *
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
        int i;  //indicador del número en la sucesión que se está sumando//
        int ENTEROSSUMAR = 5; //Número final de la sucesión de naturales que se sumarán//
        int suma = 0;         //Entero que almacena el resultado de la suma de la sucesión//
        //BACKEND//
        //Suma de la sucesión desde 1 hasta ENTEROSSUMAR//
        for(i = 1; i <= ENTEROSSUMAR; i++)
        {
            suma += i;
        }
        //FRONTEND//
        //Muestra por pantalla el resultado de la suma//
        System.out.println("La suma de los " + (ENTEROSSUMAR) + " numeros enteros es: " + suma);
    }
}
