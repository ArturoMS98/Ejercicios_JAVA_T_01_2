package t_01_2_ej31;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 10, 2019 1:15:54 PM                            *
 * fecha de finalizacion: May 10, 2019 9:21:22 PM                              *
 * nombre del proyecto: T_01_2_Ej31.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 31. Escribir un programa para jugar a adivinar un número entre 1 y 6        *
 * (generado al azar por el ordenador) hasta acertarlo o decirlos todos.       *
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej31 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Crear un número aleatorio y dar 6 oportunidades al usuario para acertar  *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int random;
        int numeroPeticion;
        int contadorNumeros = 0;
        final int maximoNumeros = 6;
        final int minimoNumeros = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("CALCULANDO EL NUMERO A ADIVINAR: ");
        random = (int)(Math.random()*maximoNumeros + minimoNumeros);
        //BACKEND//
        do
        {
            //FRONTEND//
            //PETICION DE DATOS//
            System.out.print("Introduzca el numero que cree que es: ");
            numeroPeticion = in.nextInt();
            
            contadorNumeros++;
        }while((numeroPeticion != random) && (contadorNumeros < maximoNumeros));
        if(contadorNumeros == maximoNumeros)
            System.out.println("Ha perdido. Mala suerte.");
        System.out.println("El numero era: " + random);
    }
}
