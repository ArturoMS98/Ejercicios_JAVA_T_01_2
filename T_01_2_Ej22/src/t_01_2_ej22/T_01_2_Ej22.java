package t_01_2_ej22;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 6, 2019 4:58:32 PM                             *
 * fecha de finalizacion: May 6, 2019 5:12:32 PM                               *
 * nombre del proyecto: T_01_2_Ej22.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 22. Escribe un programa que pida la anchura y altura de un rectángulo y lo  *
 *     dibuje de la siguiente manera:                                          *
 *          Anchura del rectángulo: 5                                          *
 *          Altura del rectángulo: 3                                           *
 *          *****                                                              *
 *          *****                                                              *
 *          *****                                                              *
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej22 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Petición de datos, y acceso al método creador del rectángulo.            *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int alto;
        int base;
        Scanner in = new Scanner(System.in);
        
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print("Introduzca la longitud de la base del rectángulo: ");
            base = in.nextInt();
            System.out.println("Introduzca la longitud de altura del rectángulo: ");
            alto = in.nextInt();
        //BACKEND//
        metodoCreadorRectangulo(alto, base);
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoCreadorRectangulo:                                    |
     | Crear el rectángulo de altura y anchura dadas.                          |
     | Parámetros:                                                             |
     | altura: Altura del rectángulo a crear.                                  |
     | base: Longitud de la base del rectángulo a crear.                       |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void metodoCreadorRectangulo(int altura, int base)
    {
        //VARIABLES LOCALES//
        int contadorFilas;
        int contadorColumnas;
        //CUERPO DEL METODO//
        for(contadorFilas = 0; contadorFilas < altura; contadorFilas++)
        {
            for(contadorColumnas = 0; contadorColumnas < base; contadorColumnas++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
