
package t_01_2_ej02;

import java.util.Scanner;

/*******************************************************************************
 *
 * CLASE MAIN
 * Funcion de la clase: 
 * 2. Escribe un algoritmo que dado un número natural que se introduce por
 *    teclado calcule su factorial.
 *******************************************************************************
 *******************************************************************************
 * @author baha
 * fecha de inicializacion: Apr 18, 2019 2:04:27 PM
 * fecha de finalizacion: Apr 18, 2019 2:30:00 PM
 * nombre del proyecto: T_01_2_Ej2.java
 * @version 1.1
 * tiempo invertido en mejora de version: 3 minutos 40 segundos.
 *
 ******************************************************************************/
public class T_01_2_Ej02 {

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        int numero;
        Scanner in = new Scanner(System.in);
        
        System.out.println(MENSAJEPIDEFACTORIAL);
        numero = in.nextInt();
        
        System.out.println(metodoFactorial(numero));
    }
    private static final String MENSAJEPIDEFACTORIAL = "Introduzca el número a calcular el factorial: ";
    
    //Metodos suplementarios de la clase principal//
    /**
     * Este metodo tiene como función tomar un número por parámetro y calcular su factorial.
     * El parámetro factorial refiere al número del que calcular el factorial.
     * Método dirigido a: FrontEnd // BackEnd
     * @returns el entero resultado, que es factorial!.
     */
    static int metodoFactorial (int factorial)
    {
        //VARIABLES LOCALES//
        int resultado = 1;
        //CUERPO DEL METODO//
        for(factorial = factorial; factorial > 1; factorial--)
        {
            resultado = factorial * resultado;
        }
        return resultado;
    }
    
}
