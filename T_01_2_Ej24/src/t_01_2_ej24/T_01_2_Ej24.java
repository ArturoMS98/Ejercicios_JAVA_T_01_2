package t_01_2_ej24;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 6, 2019 6:19:55 PM                             *
 * fecha de finalizacion: May 6, 2019 6:29:55 PM                               *
 * nombre del proyecto: T_01_2_Ej24.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 24. Escribe un programa que pida la altura de un triángulo y lo dibuje de   *
 *    la siguiente manera:                                                     *
 *      Altura del triángulo: 4                                                *
 *      ****                                                                   *
 *      ***                                                                    *
 *      **                                                                     *
 *      *                                                                      *
 *    Usa un bucle for.                                                        *
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej24 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Pedir la altura del triángulo rectángulo invertido, y llamar al método   *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int alto;
        Scanner in = new Scanner(System.in);
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print(MENSAJE_PETICION_TRIANGULO_INVERTIDO);
            alto = in.nextInt();
        //BACKEND//
        metodoCrearTrianguloInvertido(alto);
    }
    private static final String MENSAJE_PETICION_TRIANGULO_INVERTIDO = "Introduzca la altura del triángulo invertido: ";
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoCrearTrianguloInvertido():                            |
     | Crear un triángulo rectángulo apoyados sus catetos en el lado de arriba |
     | y el lado izquierdo.                                                    |
     | Parámetros:                                                             |
     | alto: Indica la longitud que tendrá el lado izquierdo del triángulo.    |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void metodoCrearTrianguloInvertido(int alto)
    {
        //VARIABLES LOCALES//
        int contadorAltura;
        //CUERPO DEL METODO//
        for(contadorAltura = alto; contadorAltura > 0; contadorAltura--)
        {
            for(int i = contadorAltura; i > 0; i--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
