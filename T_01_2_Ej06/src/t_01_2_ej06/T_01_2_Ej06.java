package t_01_2_ej06;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 19, 2019 7:17:07 PM                            *
 * fecha de finalizacion: Apr 19, 2019 7:55:07 PM                              *
 * nombre del proyecto: T_01_2_Ej06.java                                       *
 *                                                                             *
 ******************************************************************************/
public class T_01_2_Ej06 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 6. Escribe un método que lea por teclado un número entero N y otro K,    *
    * para después mostrar por pantalla el valor del K_ésimo dígito del número *
    * N empezando por la derecha.                                              *
    * @version 1.1; tiempo de version: 12 minutos, 30 segundos                 *
    *                                                                          *
    ***************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        Scanner in = new Scanner(System.in);
        int N;
        int K;
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print("Introduzca el número: ");
            N = in.nextInt();
            System.out.print("Introduzca la posición a leer: ");
            K = in.nextInt();
        //BACKEND
        System.out.println(metodoPosicion(N, K));
    }
    
    //Metodos suplementarios de la clase principal//
    /*_________________________________________________________________________
     | Función del metodo: metodoPosicion                                      |
     | Recoge un número en base 10 y muestra la posición indicada              |
     | Parámetros:                                                             |
     | numero: El número del que leer la posición.                             |
     | posicion: La posición empezando por la derecha que se lee del número.   |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoPosicion (int numero, int posicion)
    {
        //VARIABLES LOCALES//
        final int BASE = 10;
        int cifra = 0;
        int multiplicador = 1;
        //CUERPO DEL METODO//
        for(posicion = posicion; posicion > 0; posicion--)
        {
            multiplicador = multiplicador*BASE;
        }
        numero = numero%multiplicador;
        multiplicador /= BASE;
        while(numero > 0)
        {
            numero -= multiplicador;
            cifra++;
        }
        return cifra;
    }   
}