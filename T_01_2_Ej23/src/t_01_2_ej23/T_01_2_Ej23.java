package t_01_2_ej23;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 6, 2019 5:23:34 PM                             *
 * fecha de finalizacion: May 6, 2019 5:33:34 PM                               *
 * nombre del proyecto: T_01_2_Ej23.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 23. Escribe un programa que pida la altura de un triángulo y lo dibuje de   *
 *  la siguiente manera:                                                       *
 *     Altura del triángulo: 4                                                 *
 *      *                                                                      *
 *      **                                                                     *
 *      ***                                                                    *
 *      ****                                                                   *
 *  Usa un bucle for.                                                          *
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej23 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Pedir la altura del triángulo a crear, y acceder al metodoCrearTriangulo *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int altura;
        Scanner in = new Scanner(System.in);
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print("Introduzca la altura del triángulo: ");
            altura = in.nextInt();
        //BACKEND//
        metodoCrearTriangulo(altura);
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoCrearTriangulo:                                       |
     | Crear un triángulo rectángulo de base en el suelo y altura a la izq     |
     | Parámetros:                                                             |
     | alto: Define la altura del triángulo a crear.                           |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void metodoCrearTriangulo (int alto)
    {
        //VARIABLES LOCALES//
        int contadorAltura;
        //CUERPO DEL METODO//
        for(contadorAltura = 0; contadorAltura < alto; contadorAltura++)
        {
            for(int i = contadorAltura; i >= 0; i--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
