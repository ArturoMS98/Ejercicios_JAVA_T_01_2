package t_01_2_ej15;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 22, 2019 10:16:07 PM                           *
 * fecha de finalizacion: Apr 22, 2019 10:27:07 PM                             *
 * nombre del proyecto: T_01_2_Ej15.java                                       *
 ******************************************************************************/

public class T_01_2_Ej15 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 15. Implementa un programa en Java que dado un número introducido por    *
    * teclado, averigue si es o no un número primo.                            *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int numero;
        Scanner in = new Scanner(System.in);
        
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print("Introduzca el numero a analizar: ");
            numero = in.nextInt();
        //BACKEND//
            //Comprobación de si el número es primo//
            if(metodoEsPrimo(numero) && (numero > 0))
        //FRONTEND//
                System.out.println("El numero es primo.");
            else
                System.out.println("El numero no es primo.");
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoEsPrimo:                                              |
     | Calcula si el número pasado por parámetro es primo o no.                |
     | Parámetros:                                                             |
     | numero: Numero a calcular si es primo.                                  |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static boolean metodoEsPrimo(int numero)
    {
        //VARIABLES LOCALES//
        int contador = 2;
        //CUERPO DEL METODO//
        for(contador = contador; contador < numero; contador++)
        {
            if(numero%contador == 0)
                return false;
        }
        return true;
    }
    
}
