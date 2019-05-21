package t_01_2_ej25;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 6, 2019 6:30:20 PM                             *
 * fecha de finalizacion: May 6, 2019 6:30:20 PM                               *
 * nombre del proyecto: T_01_2_Ej25.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 25. Escribe un programa que pida la anchura y altura de un rectángulo y lo  *
 * dibuje de la siguiente manera:                                              *
 *      Anchura del rectángulo: 5                                              *
 *      Altura del rectángulo: 4                                               *
 *      *****                                                                  *
 *      *   *                                                                  *
 *      *   *                                                                  *
 *      *****                                                                  *
 * Usa un bucle for.                                                           *
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej25 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Pedir altura y anchura del rectángulo, y acceder al método creador.      *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int alto;
        int ancho;
        Scanner in = new Scanner(System.in);
        
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print("Introduzca la altura del rectángulo a crear: ");
            alto = in.nextInt();
            System.out.print("Introduzca la anchura del rectángulo a crear: ");
            ancho = in.nextInt();
        //BACKEND//
        metodoCreadorRectanguloVacio(alto, ancho);
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoCreadorRectanguloVacio:                               |
     | Crear un rectángulo vacío de alto altura y de ancho anchura.            |
     | Parámetros:                                                             |
     | altura: altura del rectangulo                                           |
     | ancho: anchura del rectangulo                                           |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void metodoCreadorRectanguloVacio(int altura, int anchura)
    {
        //VARIABLES LOCALES//
        int contadorAltura;
        int contadorAnchura;
        //CUERPO DEL METODO//
        for(contadorAltura = altura; contadorAltura > 0; contadorAltura--)
        {
            if((contadorAltura == altura) || (contadorAltura == 1))
                for(contadorAnchura = 0; contadorAnchura )
        }
    }
}
