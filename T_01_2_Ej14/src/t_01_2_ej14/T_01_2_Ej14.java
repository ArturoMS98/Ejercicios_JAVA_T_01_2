
package t_01_2_ej14;

import java.util.Scanner;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 21, 2019 4:20:58 PM                            *
 * fecha de finalizacion: Apr 21, 2019 4:43:58 PM                              *
 * nombre del proyecto: T_01_2_Ej14.java                                       *
 ******************************************************************************/

public class T_01_2_Ej14 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 14. Escribe un programa en Java que analice los resultados de un examen. *
    * El usuario introducirá notas por teclado (­1 para terminar) y se debe ir *
    * mostrando si la nota equivale a: suspenso, suficiente, bien, notable o   *
    * sobresaliente. El programa debe implementarse de tres formas distintas:  *
    *   (a) Con un bucle while.                                                *
    *   (b) Con un bucle do­while.                                             *
    *   (c) Con un bucle for.                                                  *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //        
        //BACKEND//
        System.out.println("Estamos con el while:");
        metodoResultadosWhile();
        System.out.println("Estamos con el Do-While: ");
        metodoResultadosDoWhile();
        System.out.println("Estamos con el For: ");
        metodoResultadosFor();
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoResultadosWhile:                                      |
     | Este método analiza los valores introducidos hasta la introduccion -1.  |
     | Mostrará si la nota corresponde a suspenso, suficiente, bien, notable   |
     | o sobresaliente, repetido en un bucle do-while                          |
     | Parámetros:                                                             |
     | Ninguno                                                                 |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void metodoResultadosWhile ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        int resultadoExamen;
        //CUERPO DEL METODO//
        resultadoExamen = in.nextInt();
        while(resultadoExamen != -1)
        {
            if((resultadoExamen < 5) && (resultadoExamen >= 0))
            {
                System.out.println("Suspenso");
            }
            else if((resultadoExamen < 6) && (resultadoExamen >= 0))
            {
                System.out.println("Suficiente");
            }
            else if((resultadoExamen < 7) && (resultadoExamen >= 0))
            {
                System.out.println("Bien");
            }
            else if((resultadoExamen < 9) && (resultadoExamen >= 0))
                System.out.println("Notable");
            else if((resultadoExamen <= 10) && (resultadoExamen >= 0))
                System.out.println("Sobresaliente");
            else
                System.out.println("Introduzca un valor válido.");
            resultadoExamen = in.nextInt();
        }
    }
    
    /*_________________________________________________________________________
     | Función del metodoResultadosDoWhile:                                    |
     | Este método analiza los valores introducidos hasta la introduccion -1.  |
     | Mostrará si la nota corresponde a suspenso, suficiente, bien, notable   |
     | o sobresaliente, repetido en un bucle do-while                          |
     | Parámetros:                                                             |
     | Ninguno                                                                 |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void metodoResultadosDoWhile ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        int resultadoExamen;
        //CUERPO DEL METODO//
        do
        {
            resultadoExamen = in.nextInt();
            if((resultadoExamen < 5) && (resultadoExamen >= 0))
            {
                System.out.println("Suspenso");
            }
            else if((resultadoExamen < 6) && (resultadoExamen >= 0))
            {
                System.out.println("Suficiente");
            }
            else if((resultadoExamen < 7) && (resultadoExamen >= 0))
            {
                System.out.println("Bien");
            }
            else if((resultadoExamen < 9) && (resultadoExamen >= 0))
                System.out.println("Notable");
            else if((resultadoExamen <= 10) && (resultadoExamen >= 0))
                System.out.println("Sobresaliente");
            else if(resultadoExamen != -1)
                System.out.println("Introduzca un valor válido.");
        }while(resultadoExamen != -1);
    }
    
    /*_________________________________________________________________________
     | Función del metodoResultadosFor:                                        |
     | Este método analiza los valores introducidos hasta la introduccion -1.  |
     | Mostrará si la nota corresponde a suspenso, suficiente, bien, notable   |
     | o sobresaliente, repetido en un bucle for.                              |
     | Parámetros:                                                             |
     | Ninguno                                                                 |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void metodoResultadosFor ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        int resultadoExamen;
        //CUERPO DEL METODO//
        resultadoExamen = in.nextInt();
        for(resultadoExamen = resultadoExamen; resultadoExamen != -1; resultadoExamen++)
        {
            
            if((resultadoExamen < 5) && (resultadoExamen >= 0))
            {
                System.out.println("Suspenso");
            }
            else if((resultadoExamen < 6) && (resultadoExamen >= 0))
            {
                System.out.println("Suficiente");
            }
            else if((resultadoExamen < 7) && (resultadoExamen >= 0))
            {
                System.out.println("Bien");
            }
            else if((resultadoExamen < 9) && (resultadoExamen >= 0))
                System.out.println("Notable");
            else if((resultadoExamen <= 10) && (resultadoExamen >= 0))
                System.out.println("Sobresaliente");
            else if(resultadoExamen != -1)
                System.out.println("Introduzca un valor válido.");
            resultadoExamen = in.nextInt();
            resultadoExamen--;
        }
    }
}
