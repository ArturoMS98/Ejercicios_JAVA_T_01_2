
package t_01_2_ej07;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 19, 2019 8:34:41 PM                            *
 * fecha de finalizacion: Apr 19, 2019 11:31:35 PM                             *
 * nombre del proyecto: T_01_2_Ej07.java                                       *
 ******************************************************************************/

public class T_01_2_Ej07 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 7. Escribe un programa que encuentre los tres primeros números perfectos.*
    * Un número perfecto es un entero positivo igual a la suma de todos los    *
    * enteros positivos (excluido el mismo) que son divisores del número. El   *
    * primer número perfecto es el 6 = 1 + 2 + 3.                              *
    *                                                                          *
    ***************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int numero = 2;
        int divisor;
        int suma = 0;
        int multiplicacion = 1;
        int contadorNumeros = 0;
        int contador = 0;
        //BACKEND
        while(contadorNumeros < 4)
        {
            divisor = numero;
            do
            {
                divisor = metodoDivisores(numero, divisor);
                suma += divisor;
                multiplicacion *= divisor;
                contador++;
            }while(divisor != 1);
            if(suma == numero)
            {
                System.out.println("ENCONTRADO NUMERO PERFECTO: " + numero);
                contadorNumeros++;
            }
            suma = 0;
            multiplicacion = 1;
            contador = 0;
            numero++;
        }
    }
    
    //Metodos suplementarios de la clase principal//
    /*_________________________________________________________________________
     | Función del metodo: metodoDivisores                                     |
     | Calcular el siguiente divisor del número pasado por parámetro           |
     | Parámetros:                                                             |
     | numero: Número pasado a calcular el primer divisor                      |
     | divisor: Ultimo divisor calculado                                       |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoDivisores (int numero, int divisor)
    {
        //Calculo del divisor//
        do
        {
            divisor--;
        }while((numero % divisor) != 0);
        return(divisor);
    }
    
    
    /*_________________________________________________________________________
     | Función del metodo: metodoFactorizacion                                 |
     | Calcular el primer divisor del número pasado por parámetro              |
     | Parámetros:                                                             |
     | numero: Número pasado a calcular el primer divisor                      |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoFactorizacion (int numero)
    {
        //VARIABLES LOCALES//
        int centinela = 1;
        int raiz = 1;
        //CUERPO DEL METODO//
            //Calculo de la raiz de numero//
            while((raiz*raiz) < numero)
            {
                raiz++;
            }
            //Calculo del factor//
            do
            {
                if(centinela > raiz)
                    return numero;
                centinela++;
            }while((numero % centinela) != 0);
        return(centinela);
    }
}
