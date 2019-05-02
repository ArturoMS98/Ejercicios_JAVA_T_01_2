
package t_01_2_ej18;

import java.util.Scanner;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 24, 2019 10:40:18 PM                           *
 * fecha de finalizacion: Apr 24, 2019 11:01:00 PM                             *
 * nombre del proyecto: T_01_2_Ej18.java                                       *
 ******************************************************************************/

public class T_01_2_Ej18 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 18. Implementa un programa en Java que sume los múltiplos de un número   *
    * entero introducido por el usuario por teclado. Debe sumar los múltiplos  *
    * de dicho número entre el 1 y el límite que decida el usuario.            *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int numeroMultiplo;
        int limiteSumas;
        int resultado;
        Scanner in = new Scanner(System.in);
        
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print("Introduzca el límite hasta el que sumar los múltiplos: ");
            limiteSumas = in.nextInt();
            System.out.println("Los múltiplos que se sumarán serán los múltiplos de: ");
            numeroMultiplo = in.nextInt();
        //BACKEND//
        resultado = metodoSumasMultiplos(numeroMultiplo, limiteSumas);
        System.out.println("El resultado de la suma de los múltiplos de " + numeroMultiplo + " hasta " + limiteSumas + " es: " + resultado);
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoSumasMultiplos:                                       |
     | Suma los múltiplos de multiplo hasta llegar a limite. Devuelve la suma  |
     | de dichos múltiplos. Excepción en división por 0.                       |
     | Parámetros:                                                             |
     | multiplo: parametro que indica de qué número serán múltiplos los        |
     |           sumandos.                                                     |
     | limite: parametro que indica el límite hasta el que se sumarán los      |
     |         múltiplos.
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoSumasMultiplos (int multiplo, int limite)
    {
        //VARIABLES LOCALES//
        int resultado = 1;  //se inicializa a 1 porque 1 siempre será múltiplo de múltiplo.
        //CUERPO DEL METODO//
        for(int i = 1; i <= limite/multiplo; i++)
        {
            resultado += (i*multiplo);
        }
        if (multiplo == 1)
            resultado--;
        return resultado;
    }
}
