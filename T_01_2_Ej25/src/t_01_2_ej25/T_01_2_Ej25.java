package t_01_2_ej25;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 6, 2019 6:30:20 PM                             *
 * fecha de finalizacion: ???                                                  *
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
            System.out.print(MENSAJE_PETICION_ALTURA_RECTANGULO);
            alto = in.nextInt();
            System.out.print(MENSAJE_PETICION_ANCHURA_RECTÁNGULO);
            ancho = in.nextInt();
        //BACKEND//
        metodoCreadorRectanguloVacio(alto, ancho);
    }
    private static final String MENSAJE_PETICION_ANCHURA_RECTÁNGULO = "Introduzca la anchura del rectángulo a crear: ";
    private static final String MENSAJE_PETICION_ALTURA_RECTANGULO = "Introduzca la altura del rectángulo a crear: ";
    

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
            if((contadorAltura == altura) || (contadorAltura == 1)) //SI ESTAMOS EN EL PRIMER O ÚLTIMO NIVEL//
                for(contadorAnchura = 0; contadorAnchura < anchura; contadorAnchura++)  //LLENAMOS EL NIVEL DE *//
                    System.out.print(BORDE_RECTANGULO);
            else//SI ESTAMOS DENTRO DEL RECTÁNGULO
            {
                System.out.print(BORDE_RECTANGULO);
                for(contadorAnchura = 1; contadorAnchura < anchura - 1; contadorAnchura++) //LLENAMOS EL NIVEL DE ESPACIOS//
                    System.out.print(DENTRO_RECTANGULO);
                System.out.print(BORDE_RECTANGULO);
            }
            System.out.println("");
        }
    }
    private static final String DENTRO_RECTANGULO = " ";
    private static final String BORDE_RECTANGULO = "*";
}
