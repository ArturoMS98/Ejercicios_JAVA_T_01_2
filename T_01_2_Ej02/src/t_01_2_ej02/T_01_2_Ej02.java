
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
 *
 ******************************************************************************/
public class T_01_2_Ej02 {

    /**
     * En el futuro utilizaremos esta parte del codigo para dar informacion
     * con comentario Javadoc
     */
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        int numero;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduzca el número a calcular el factorial: ");
        numero = in.nextInt();
        
        System.out.println(metodoFactorial(numero));
    }
    
    //Metodos suplementarios de la clase principal//
    /*
     * Este metodo tiene como función ...
     * El parámetro x indica ...
     * Método dirigido a: FrontEnd // BackEnd
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
