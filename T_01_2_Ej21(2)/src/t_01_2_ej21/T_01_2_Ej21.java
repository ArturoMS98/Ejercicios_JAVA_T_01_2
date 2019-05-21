
package t_01_2_ej21;

/* 
 * Enunciado de la práctica: T_01_2_Ej21.java
 * 21. Realiza un programa en Java que muestre por pantalla las tablas de
 *     multiplicar del 1 al 10.
 *
 * Autor: Baha
 *
 * Fecha de creación de la practica: 26-abr-2019, 14:15:32
 * Fecha de finalización de la práctica: Por determinar.
 */
public class T_01_2_Ej21 {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("TABLA DEL " + i);
            for(int j = 0; j < 11; j++)
            {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println("");
        }
    }

    
}
