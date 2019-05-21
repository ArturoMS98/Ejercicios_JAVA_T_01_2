
package t_01_2_ej20;

import java.util.Scanner;

/* 
 * Enunciado de la práctica: T_01_2_Ej20.java
 * 20. Escribe un programa que pregunte cuántos números vas a introducir, pida 
   esos números, y escriba el mayor, el menor y la media. Usa un bucle for.
 *
 * Autor: Baha
 *
 * Fecha de creación de la practica: 26-abr-2019, 13:50:48
 * Fecha de finalización de la práctica: 26-abr-2019, 14:12:00
 */
public class T_01_2_Ej20 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numerosIntroducir;
        int numeroEntrada;
        int minimo = 0;
        int maximo = 0;
        int suma = 0;
        float media;
        System.out.println("Introduzca cuántos números se introducirán: ");
        numerosIntroducir = in.nextInt();
        
        for(int contadorNumeros = 0; contadorNumeros < numerosIntroducir; contadorNumeros++)
        {
            System.out.println("Introduzca un numero: ");
            numeroEntrada = in.nextInt();
            if (contadorNumeros != 0)
                {
                    if(numeroEntrada < minimo)
                        minimo = numeroEntrada;
                    else if(numeroEntrada > maximo)
                        maximo = numeroEntrada;
                }
            else
            {
                minimo = numeroEntrada;
                maximo = numeroEntrada;
            }
            suma += numeroEntrada;
        }
        media = (float)suma/numerosIntroducir;
        System.out.println("El maximo fue: " + maximo);
        System.out.println("El minimo fue: " + minimo);
        System.out.println("La media fue: " + media);
    }

    
}
