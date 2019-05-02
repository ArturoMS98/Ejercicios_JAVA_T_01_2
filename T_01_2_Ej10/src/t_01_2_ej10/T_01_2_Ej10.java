
package t_01_2_ej10;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 20, 2019 3:40:06 PM                            *
 * fecha de finalizacion: Apr 20, 2019 3:57:00 PM                              *
 * nombre del proyecto: T_01_2_Ej10.java                                       *
 ******************************************************************************/

public class T_01_2_Ej10 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 10. Implementa un programa en Java que sume los múltiplos de 3 entre el  *
    * 1 y el 1000. Usa el bucle for.                                           *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int suma;
        final int INICIO = 1; //indica el numero de inicio del bucle//
        final int FINAL = 1000; //indica el ultimo numero a sumar en el bucle//
        
        //BACKEND//
        
        suma = metodoSumaMultiplos3(INICIO, FINAL);
        
        //FRONTEND//
        System.out.println("Suma de los multiplos entre " + INICIO + " y " + FINAL + ": " + suma);
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoSumaMultiplos3:                                       |
     | Coge los multiplos de 3 entre los dos numeros pasados y los suma        |
     | Parámetros:                                                             |
     | start: Numero inicial desde el que empezamos a buscar el multiplo de 3  |
     | end: Numero final, donde dejamos de buscar más números multiplos de 3   |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoSumaMultiplos3 (int start, int end)
    {
        //VARIABLES LOCALES//
        int suma = 0;
        //CUERPO DEL METODO//
        //Calculo del primer multiplo de 3//
        while(start%3 != 0)
            start++;
        
        //suma de los multiplos siguientes//
        for(int i = start; i <= end; i=i+3)
        {
            suma += i;
        }
        return suma;
    }
}
