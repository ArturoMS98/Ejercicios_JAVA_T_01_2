package t_01_2_ej12;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 20, 2019 4:16:27 PM                            *
 * fecha de finalizacion: Apr 20, 2019 4:34:27 PM                              *
 * nombre del proyecto: T_01_2_Ej12.java                                       *
 * @version 1.1; tiempo de version: 6 minutos                                  *
 ******************************************************************************/

public class T_01_2_Ej12 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 12. Escribe un programa en Java que sume los enteros impares entre 0 y   *
    * 100. El programa debe implementarse de tres formas distintas:            *
    *   (a) Con un bucle while.
    *   (b) Con un bucle do­while.
    *   (c) Con un bucle for
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final int INICIO = 5; //numero por el que comenzamos a sumar los impares
        final int FINAL = 1; //numero por el que dejamos de sumar impares
        
        //BACKEND//
        
        //FRONTEND//
        System.out.println("Suma con el bucle while: " + metodoSumaImparesWhile(INICIO, FINAL));
        System.out.println("Suma con el bucle do-while: " + metodoSumaImparesDoWhile(INICIO, FINAL));
        System.out.println("Suma con el bucle for: " + metodoSumaImparesFor(INICIO, FINAL));
    }

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoSumaImparesWhile:                                     |
     | Con un bucle while, suma los numeros impares entre los parametros dados |
     | Parámetros:                                                             |
     | int start: inicio de la suma de impares                                 |
     | int end: final de la suma de impares                                    |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoSumaImparesWhile (int start, int end)
    {
        //VARIABLES LOCALES//
        int suma = 0;
        int contador = start;
        //CUERPO DEL METODO//
        while(contador <= end)
        {
            if(contador%2 != 0)
            {
                suma += contador;
            }
            contador++;
        }
        return suma;
    }
    
    /*_________________________________________________________________________
     | Función del metodoSumaImparesDoWhile:                                   |
     | Con un bucle do-while, suma los numeros impares entre los parametros    |
     | dados.                                                                  |
     | Parámetros:                                                             |
     | int start: inicio de la suma de impares                                 |
     | int end: final de la suma de impares                                    |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoSumaImparesDoWhile (int start, int end)
    {
        //VARIABLES LOCALES//
        int suma = 0;
        int contador = start;
        //CUERPO DEL METODO//
        if(start <= end)
        {
            do
            {
                if(contador%2 != 0)
                {
                    suma += contador;
                }
                contador++;
            }while(contador <= end);
            return suma;
        }
        else
            return 0;
    }
    
    /*_________________________________________________________________________
     | Función del metodoSumaImparesFor:                                       |
     | Con un bucle for, suma los numeros impares entre los parametros dados   |
     | Parámetros:                                                             |
     | int start: inicio de la suma de impares                                 |
     | int end: final de la suma de impares                                    |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoSumaImparesFor (int start, int end)
    {
        //VARIABLES LOCALES//
        int suma = 0;
        //CUERPO DEL METODO//
        for(int i = start; i <= end; i++)
        {
            if(i%2 != 0)
            {
                suma += i;
            }
        }
        return suma;
    }   
}