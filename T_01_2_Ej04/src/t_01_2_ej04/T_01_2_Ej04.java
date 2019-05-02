
package t_01_2_ej04;

import java.util.Scanner;

/*******************************************************************************
 *                                                                             *
 * CLASE MAIN                                                                  *
 * Funcion de la clase:                                                        *
 * 4. Escribe un algoritmo que lea números introducidos de manera consecutiva  *
 *    y aleatoria por teclado hasta que el valor introducido sea 0 (cero).     *
 *    Suma todos los valores introducidos antes de que aparezca el primero     *
 *    mayor que 200. Por otra parte, suma todos los que entran a continuación  *
 *    de éste hasta la aparición del cero. Por último, el algoritmo deberá     *
 *    visualizar el número de introducciones (sin contar el cero ni el primer  *
 *    número mayor de 200), la primera suma y la segunda. Contempla la         *
 *    posibilidad de que entre antes el 0 que el primer número mayor de 200.   *
 *                                                                             *
 *******************************************************************************

 *******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 18, 2019 3:08:25 PM                            *
 * fecha de finalizacion: Apr 18, 2019 3:35:00 PM                              *
 * nombre del proyecto: T_01_2_Ej04.java                                       *
 *                                                                             *
 ******************************************************************************/
public class T_01_2_Ej04 {

    /** */
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        int numero;
        int resultado1 = 0;
        int resultado2 = 0;
        int contador = 0;
        do
        {
            do
            {
                System.out.println("Introduzca un numero para la primera cadena: ");
                numero = in.nextInt();
                contador++;
                resultado1 = resultado1 + numero;
            }while((numero <= 200) && (numero != 0) );
            if(numero != 0)
                contador--;
            while(numero != 0)
            {
                System.out.println("Introduzca un numero para la segunda cadena: ");
                numero = in.nextInt();
                contador++;
                resultado2 = resultado2 + numero;
            }
        }while((numero != 0));
        contador--;
        System.out.println("Fin del programa.");
        System.out.println("Numero de sumas: " + contador);
        System.out.println("Suma de la primera cadena: " + resultado1);
        System.out.println("Suma de la segunda cadena: " + resultado2);
    }
    
    //Metodos suplementarios de la clase principal//
    /*_________________________________________________________________________
     | Función del metodo:                                                     |
     | 
     | Parámetros:                                                             |
     | 
     | Método dirigido a: FrontEnd //BackEnd                                              |
     |________________________________________________________________________*/
    /*static void metodo ()
    {
        //VARIABLES LOCALES//
        
        //CUERPO DEL METODO//
        
    }
    */
}
