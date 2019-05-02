
package t_01_2_ej20;

import java.util.Scanner;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 26, 2019 12:13:00 AM                           *
 * fecha de finalizacion: Apr 26, 2019 12:13:00 AM                             *
 * nombre del proyecto: T_01_2_Ej20.java                                       *
 ******************************************************************************/

public class T_01_2_Ej20 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 20. Escribe un programa que pregunte cuántos números vas a introducir,   *
    * pida esos números, y escriba el mayor, el menor y la media. Usa un bucle *
    * for.                                                                     *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        //BACKEND//
        metodoPeticionYAnalisisNumeros();
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoPeticionYAnalisisNumeros() :                          |
     | 
     | Parámetros:                                                             |
     | Método dirigido a: FrontEnd y BackEnd                                   |
     |________________________________________________________________________*/
    static void metodoPeticionYAnalisisNumeros()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        int numeroIntroducir;
        int sumaNumeros = 0;
        int numerosTotales;
        int numeroMinimo;
        int numeroMaximo;
        //CUERPO DEL METODO//
        System.out.print("Introduzca el número de números que se introducirán: ");
        numerosTotales = in.nextInt();
        System.out.print("Introduzca un numero: ");
        numeroIntroducir = in.nextInt();
        numeroMinimo = numeroIntroducir;
        numeroMaximo = numeroIntroducir;
        sumaNumeros += numeroIntroducir;
        for(int contadorNumeros = numerosTotales - 1; contadorNumeros > 0; contadorNumeros--)
        {
            System.out.print("Introduzca un numero: ");
            numeroIntroducir = in.nextInt();
            
            if((numeroMinimo > numeroIntroducir))
                numeroMinimo = numeroIntroducir;
            if((numeroMaximo < numeroIntroducir))
                numeroMaximo = numeroIntroducir;
            sumaNumeros += numeroIntroducir;
        }
        System.out.println("Numero maximo: " + numeroMaximo);
        System.out.println("Numero minimo: " + numeroMinimo);
        float aux = sumaNumeros/numerosTotales;
        System.out.println("Media: " + aux);
    }
}
//error de la media con decimales.//