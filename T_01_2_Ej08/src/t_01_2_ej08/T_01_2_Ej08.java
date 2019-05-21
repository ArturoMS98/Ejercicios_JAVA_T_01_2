package t_01_2_ej08;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 20, 2019 2:03:00 PM                            *
 * fecha de finalizacion: Apr 20, 2019 2:40:00 PM                              *
 * nombre del proyecto: T_01_2_Ej08.java                                       *
 ******************************************************************************/

public class T_01_2_Ej08 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 8. Escribe un algoritmo que lea 100 números introducidos por teclado de  *
    * forma aleatoria y consecutiva. Para cada 10 números introducidos se      *
    * procederá a mostrar la decena actual y a la obtención del mayor de los   *
    * números leídos de la decena. Por último, se deberá obtener el mayor      *
    * valor introducido y en qué decena apareció.                              *
    * @version: 1.1; tiempo de cambio: ?? (otra vez se me olvido cronometrar)  *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        Scanner in = new Scanner(System.in);
        int contadorDecenas = 0;
        int contadorUnidades = 0;
        int numeroRecibido;
        int numeroMayorDecena = 0;
        int maximo = 0;
        
        //CUERPO DEL METODO//
        while(contadorDecenas < 10)
        {
            while(contadorUnidades < 10)
            {
                //PETICION DE DATOS//
                System.out.print("Introduzca un nuevo numero a la decena " + (contadorDecenas + 1) + ":  ");
                numeroRecibido = in.nextInt();
                
                //COMPARACION CON NUMERO MAYOR ACTUAL//
                if(numeroRecibido > numeroMayorDecena)
                    numeroMayorDecena = numeroRecibido;
                
                contadorUnidades++;
            }
            //COMPARACION CON RECORD ACTUAL//
            if(numeroMayorDecena > maximo)
                maximo = numeroMayorDecena;
            
            //Muestra por pantalla récord de la decena actual//
            System.out.println("El numero mayor de la decena " + (contadorDecenas + 1) + " es: " + numeroMayorDecena);
            
            //Reinicialización de contadores//
            numeroMayorDecena = 0;
            contadorUnidades = 0;
            contadorDecenas++;
        }
        //Muestra por pantalla el récord de todas las decenas//
        System.out.println("El mayor numero introducido fue el: " + maximo);
    }
}