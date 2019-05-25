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
        Scanner in = new Scanner(System.in);
        int numerosTotales;
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print("Introduzca el número de números que se introducirán: ");
            numerosTotales = in.nextInt();
            
        //BACKEND//
            metodoPeticionYAnalisisNumeros(numerosTotales);
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoPeticionYAnalisisNumeros() :                          |
     | 
     | Parámetros:                                                             |
     | Método dirigido a: FrontEnd y BackEnd                                   |
     |________________________________________________________________________*/
    static void metodoPeticionYAnalisisNumeros(int numerosTotales)
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        int introduccion;
        int suma = -1;
        int minimo = -1;
        int maximo = -1;
        int contadorNumeros = 0;
        //CUERPO DEL METODO//
        do
        {
            //PETICION DE DATOS//
            System.out.print("Introduzca un numero: ");
            introduccion = in.nextInt();
            //Si es la primera introducción, inicializa las variables de estadística//
            if(contadorNumeros == 0)
            {
                minimo = introduccion;
                maximo = introduccion;
                suma = introduccion;
            }
            else
            {//Si no es la primera introducción, compara las variables con la última variable introducida//
                if((minimo > introduccion))
                    minimo = introduccion;
                if((maximo < introduccion))
                    maximo = introduccion;
                suma += introduccion;
            }
            contadorNumeros++;
        }while(contadorNumeros < numerosTotales);
        //MOSTRAR RESULTADOS//
        System.out.println("Numero maximo: " + maximo);
        System.out.println("Numero minimo: " + minimo);
        float aux = (float)suma/numerosTotales;
        System.out.println("Media: " + aux);
    }
}