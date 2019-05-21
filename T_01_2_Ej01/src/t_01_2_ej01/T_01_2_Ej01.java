
package t_01_2_ej01;

import java.util.Scanner;

/**
 *
 * @author baha
 * fecha de inicializacion: Apr 16, 2019 8:29:57 PM
 * fecha de finalizacion: --
 * nombre del proyecto: T_1_2_Ej1.java
 * Esta clase es el esqueleto del programa, y su funcion es: 1. Escribe un
 * algoritmo que, introducidos por teclado tres valores, los represente en
 * pantalla ordenados de mayor a menor.
 */
public class T_01_2_Ej01 {

    /**
     * En el futuro utilizaremos esta parte del codigo para dar informacion
     * con comentario Javadoc
     */
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        Scanner in = new Scanner(System.in);
        int num1,num2,num3;
        //FRONTEND//
            //PETICION DE DATOS//
        System.out.println("Introduce el primer numero de la serie: ");
        num1 = in.nextInt();
        System.out.println("Introduce el segundo numero de la serie: ");
        num2 = in.nextInt();
        System.out.println("Introduce el tercer numero de la serie: ");
        num3 = in.nextInt();
        
        //BACKEND//
            //CALCULO DE ORDEN//
        if(num1 > num2)
        {
            metodoComparacion(num1, num2, num3);
        }
        else
        {
            metodoComparacion(num2, num1, num3);
        }
    }
    
    //Metodos suplementarios de la clase principal//
    //static void... en desarrollo
    static void metodoComparacion(int num1, int num2, int num3)
    {
        final String mensajeMayor = "El mayor numero de la serie es: ";
        final String mensajeMedio = "El segundo mayor numero de la serie es: ";
        final String mensajeMenor = "El menor numero de la serie es: ";
        if(num2 > num3)
        {
            System.out.println(mensajeMayor + num1);
            System.out.println(mensajeMedio + num2);
            System.out.println(mensajeMenor + num3);
        }
        else
        {
            if(num1 > num3)
            {
                System.out.println(mensajeMayor + num1);
                System.out.println(mensajeMedio + num3);
                System.out.println(mensajeMenor + num2);
            }
            else
            {
                System.out.println(mensajeMayor + num3);
                System.out.println(mensajeMedio + num1);
                System.out.println(mensajeMenor + num2);
            }
        }
    }
}
