package t_01_2_ej32;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 20, 2019 1:26:36 PM                            *
 * fecha de finalizacion: May 20, 2019 1:36:20 PM                              *
 * nombre del proyecto: T_01_2_Ej32.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 32. Uno de los usos más habituales para los bucles condicionales es la      *
 *     validación de entradas. Escribir un programa que pida una contraseña y  *
 *     permita tres intentos. Si el usuario da la contraseña correcta          *
 *     responde "Enhorabuena!" y queda inactivo, con este mensaje. En caso     *
 *     contrario el programa escribe "Lo siento, contraseña equivocada" y se   *
 *     cierra de inmediato.                                                    *
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej32 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * 
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final String contra = "contra";
        String intento;
        int intentosRestantes = 3;
        Scanner in = new Scanner(System.in);
        while(intentosRestantes > 0)
        {
            //FRONTEND//
                //PETICION DE DATOS//
                System.out.println(PETICION_CONTRASENIA);
                intento = in.nextLine();
            //BACKEND//
            intentosRestantes--;
            if(intento.equals(contra))
                System.out.println(CONTRASENIA_CORRECTA);
            else
                System.out.println(CONTRASENIA_INCORRECTA);
        }        
    }
    private static final String CONTRASENIA_INCORRECTA = "Contraseña incorrecta";
    private static final String CONTRASENIA_CORRECTA = "Enhorabuena!";
    private static final String PETICION_CONTRASENIA = "Introduzca la contraseña: ";
}
