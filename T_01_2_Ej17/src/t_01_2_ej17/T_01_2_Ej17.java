package t_01_2_ej17;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 24, 2019 10:24:50 PM                           *
 * fecha de finalizacion: Apr 24, 2019 10:36:50 PM                             *
 * nombre del proyecto: T_01_2_Ej17.java                                       *
 ******************************************************************************/

public class T_01_2_Ej17 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 17. Escribe un programa que pregunte cuantos números vas a introducir,   *
    * pida esos números y calcule su suma. Usa un bucle for.                   *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int repeticiones;
        int numeroActual;
        int resultado = 0;
        Scanner in = new Scanner(System.in);
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print(MENSAJENUMEROSUMAS);
            repeticiones = in.nextInt();
            //INICIO BUCLE//
            for(int i = 0; i < repeticiones; i++)
            {
                System.out.print(MENSAJEPETICION);
                numeroActual = in.nextInt();
                resultado += numeroActual;
            }
            if(repeticiones > 0)
            {
                System.out.println("La suma de los " + repeticiones + " numeros anteriores es: " + resultado);
            }
            System.out.println(MENSAJEDESPEDIDA);
    }
    private static final String MENSAJEPETICION = "Introduzca un número a sumar: ";
    private static final String MENSAJENUMEROSUMAS = "Indique cuántos números se van a introducir: ";
    private static final String MENSAJEDESPEDIDA = "FIN DEL PROGRAMA";
}
