
package t_01_2_ej03;

import java.util.Scanner;

/*******************************************************************************
 *                                                                             *
 * CLASE MAIN                                                                  *
 * Funcion de la clase:                                                        *
 * 3. Escribe un programa en Java que reciba dos números (x, y) muestre por    *
 * pantalla el resultado de x elevado a y.                                     *
 *                                                                             *
 *******************************************************************************

 *******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 18, 2019 2:31:01 PM                            *
 * fecha de finalizacion: Apr 18, 2019 3:07:00 PM (incluyendo comida)          *
 * nombre del proyecto: T_01_2_Ej03.java                                       *
 * @version 1.1                                                                *
 * <p>Tiempo de versión: 17 minutos 46 segundos</p>                            *
 *                                                                             *
 ******************************************************************************/
public class T_01_2_Ej03 {

    /** */
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        int resultado;
        int base;
        int exponente;
        Scanner in = new Scanner(System.in);
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.println(MENSAJEPETICIONBASE);
            base = in.nextInt();
            System.out.println(MENSAJEPETICIONEXPONENTE);
            exponente = in.nextInt();
        //BACKEND//
        resultado = metodoExponencial(base, exponente);
        //FRONTEND//
        System.out.println(resultado);
    }
    private static final String MENSAJEPETICIONEXPONENTE = "Introduzca el exponente de la potencia: ";
    private static final String MENSAJEPETICIONBASE = "Introduzca la base de la potencia: ";
    
    //Metodos suplementarios de la clase principal//
    /*_________________________________________________________________________
     | Función del metodoExponencial:                                          |
     | Recibe dos enteros y eleva uno al otro                                  |
     | ATENCION: SOLO FUNCIONA CON EXPONENTES ENTEROS POSITIVOS                |
     | Parámetros:                                                             |
     | int base: Base de la potencia                                           |
     | int exp: Exponente de la potencia                                       |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoExponencial (int base, int exponente)
    {
        //VARIABLES LOCALES//
        int resultado = 1;
        
        //CUERPO DEL METODO//
        while(exponente > 0)
        {
            resultado = base * resultado;
            exponente--;
        }
        return resultado;
    }
    
}
