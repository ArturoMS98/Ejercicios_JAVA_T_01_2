package t_01_2_ej11;
import java.text.DecimalFormat;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 20, 2019 3:57:00 PM                            *
 * fecha de finalizacion: Apr 20, 2019 4:16:20 PM                              *
 * nombre del proyecto: T_01_2_Ej11.java                                       *
 ******************************************************************************/

public class T_01_2_Ej11 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 11. Implementa un programa en Java que calcule el promedio de 3 notas    *
    * introducidas por teclado y muestre por pantalla el resultado. Cuida      *
    * tanto el formato de entrada como el de salida.                           *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        Scanner in = new Scanner(System.in);
        int nota1, nota2, nota3;
        float promedio;
        DecimalFormat formato1 = new DecimalFormat("#.00"); //Declaramos variable de tipo formato con dos decimales//
        
        //FRONTEND//
            //PETICION DE DATOS//No verifica que sean correctas//
            System.out.print("Introduzca la primera nota de la que calcular la media: ");
            nota1 = in.nextInt();
            System.out.print("Introduzca la segunda nota de la que calcular la media: ");
            nota2 = in.nextInt();
            System.out.print("Introduzca la tercera nota de la que calcular la media: ");
            nota3 = in.nextInt();
            
        //BACKEND//
            //Calculo del promedio//
            promedio = metodoPromedio(nota1, nota2, nota3);
        
        //FRONTEND//
            //mostrar nota media
            System.out.println("La nota media es: " + formato1.format(promedio));
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodoPromedio:                                             |
     | Coge 3 numeros enteros y devuelve la media entre ellos.                 |
     | Parámetros:                                                             |
     | nota1, nota2, nota3 son los 3 numeros enteros a hacer el promedio.      |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static float metodoPromedio (int nota1, int nota2, int nota3)
    {
        //VARIABLES LOCALES//
        float promedio;
        //CUERPO DEL METODO//
        promedio = nota1 + nota2 + nota3;
        promedio /= 3;
        return promedio;
    }
}