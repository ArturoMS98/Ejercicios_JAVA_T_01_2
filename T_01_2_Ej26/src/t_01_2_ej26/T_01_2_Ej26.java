package t_01_2_ej26;
import java.util.Scanner;
/*******************************************************************************
 * @Author: Baha                                                               *
 * Fecha de inicializacion: 14-may-2019, 13:15:35            	               *
 * Fecha de finalizacion: 14-may-2019, 13:34:35              		       *
 * Notable incremento de velocidad y de calidad respecto al ejercicio que hice *
 * y ahora esta por ahi perdido! good job buddy!                               *
 *                                                                             *
 * nota: mas sencillo (y dependiendo de codigo, mucho mas rápìdo!)             *
 *       de realizar utilizando métodos!                                       *
 *******************************************************************************
 * Enunciado de la práctica: T_01_2_Ej26.java 				       *
 *					                                       *
 * Funcion de la clase:                                                        *
 * 26. Escribe un programa que pida la altura de un triángulo y lo dibuje de   *
 *     la siguiente manera:                                                    *
 * Altura del triangulo: 5                                                     *
 *          *                                                                  *
 *         ***                                                                 *
 *        *****                                                                *
 *       *******                                                               *
 *      *********                                                              *
 *                                                                             *
 ******************************************************************************/
 
public class T_01_2_Ej26 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Pedir la altura del triángulo a crear y llamar al método encargado de    *
    * construir el mismo.                                                      *
    *                                                                          *
    ***************************************************************************/
    public static void main(String[] args) 
    {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        Scanner in = new Scanner(System.in);
        int altura;
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.println("Introduzca la altura del triángulo: ");
            altura = in.nextInt();
        //BACKEND//
        mostrarTrianguloEquilatero(altura);
    }
    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | Función del metodo:                                                     |
     | Para cada nivel de la pirámide, llama al método introductor de          |
     | espacios y al encargado de introducir los asteriscos.                   |
     | Parámetros:                                                             |
     | altura: parámetro recibido que aporta la altura de la pirámide a crear  |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void mostrarTrianguloEquilatero(int altura)
    {
        int espacios = altura - 1;
        int asteriscosNivel = 1;
        int contadorAsteriscos = 0;

        for(altura = altura; altura > 0; altura--)
        {
            escritorEspacios(espacios);
            escritorAsteriscos(asteriscosNivel);
            escritorEspacios(espacios);
            System.out.println("");
            asteriscosNivel += 2;
            espacios--;
        }
    }
    /*_________________________________________________________________________
     | Función del metodo:                                                     |
     | Este es el método introductor de espacios.                              |
     | Su función es introducir por pantalla tantos espacios como se pida.     |
     | Parámetros:                                                             |
     | espacios: Parámetro recibido que aporta los espacios del nivel actual.  |
     | Método dirigido a: FrontEnd                                             |
     |________________________________________________________________________*/
    static void escritorEspacios(int espacios)
    {
        for(int contadorEspacios = 0; contadorEspacios < espacios; contadorEspacios++)
        {
            System.out.print(" ");
        }
    }
    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | Este es el método introductor de asteriscos.                            |
     | Su función es introducir por pantalla tantos asteriscos como se pida.   |
     | ~~~~Parámetros:~~~~                                                     |
     | asteriscos: Parámetro recibido que aporta los asteriscos del nivel      |
     | actual.                                                                 |
     | ~~~~Método dirigido a: FrontEnd~~~~                                     |
     |________________________________________________________________________*/
    static void escritorAsteriscos(int asteriscos)
    {
        for(int contadorEspacios = 0; contadorEspacios < asteriscos; contadorEspacios++)
        {
            System.out.print("*");
        }
    }
}