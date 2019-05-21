package t_01_2_ej16;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 24, 2019 10:00:07 PM                           *
 * fecha de finalizacion: Apr 24, 2019 10:17:07 PM                             *
 * nombre del proyecto: T_01_2_Ej16.java                                       *
 ******************************************************************************/

public class T_01_2_Ej16 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 16. Escribe un programa en Java que dado un número entero introducido    *
    * por teclado muestre por pantalla de cuántos digitos está formado. Por    *
    * ejemplo: 72045 está formado por 5 dígitos.                               *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int numero;
        int numeroDigitos;
        Scanner in = new Scanner(System.in);
        
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print("Introduzca el número por teclado: ");
            numero = in.nextInt();

        //BACKEND//
            //Cálculo del número de dígitos de numero//
            numeroDigitos = metodoCalculoDigitos(numero);
        
        //FRONTEND//
            //DESPEDIDA//
            System.out.println("El numero de digitos del numero " + numero + " es: " + numeroDigitos);
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoCalculoDigitos:                                       |
     | Toma un numero entero por parametro y devuelve el numero de digitos del |
     | número, sea positivo o negativo.                                        |
     | Parámetros:                                                             |
     | numero: Numero pasado por parámetro                                     |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoCalculoDigitos (int numero)
    {
        //VARIABLES LOCALES//
        int digitos = 0;
        int multiplicador = 1;
        final int BASE = 10;
        //CUERPO DEL METODO//
        if(numero < 0)
            numero *= -1;
        do
        {
            multiplicador *= BASE;
            digitos++;
        }while(multiplicador <= numero);
        return digitos;
    }
}