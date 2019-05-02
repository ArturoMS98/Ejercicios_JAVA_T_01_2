
package t_01_2_ej06;

import java.util.Scanner;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: Apr 19, 2019 7:17:07 PM                            *
 * fecha de finalizacion: Apr 19, 2019 7:55:07 PM                              *
 * nombre del proyecto: T_01_2_Ej06.java                                       *
 *                                                                             *
 ******************************************************************************/
public class T_01_2_Ej06 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion de la clase:                                                     *
    * 6. Escribe un método que lea por teclado un número entero N y otro K,    *
    * para después mostrar por pantalla el valor del K_ésimo dígito del número *
    * N empezando por la derecha.                                              *
    *                                                                          *
    ***************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        Scanner in = new Scanner(System.in);
        int N;
        int K;
        //FRONTEND//
            //PETICION DE DATOS//
        System.out.print("Introduzca el número: ");
        N = in.nextInt();
        System.out.print("Introduzca la posición a leer: ");
        K = in.nextInt();
        //BACKEND
        System.out.println(metodoPosicion(N, K));
    }
    
    //Metodos suplementarios de la clase principal//
    /*_________________________________________________________________________
     | Función del metodo: metodoPosicion                                      |
     | Recoge un número en base 10 y muestra la posición indicada              |
     | Parámetros:                                                             |
     | numero: El número del que leer la posición.                             |
     | posicion: La posición empezando por la derecha que se lee del número.   |
     | Método dirigido a: BackEnd                                              |
     |________________________________________________________________________*/
    static int metodoPosicion (int numero, int posicion)
    {
        //VARIABLES LOCALES//
        final int BASE = 10;
        int cifra = 0;
        int multiplicador = 1;
        //CUERPO DEL METODO//
        for(posicion = posicion; posicion > 0; posicion--)
        {
            multiplicador = multiplicador*BASE;
        }
        //cases: numero = 10 posicion = 1, case numero = 10000, posicion = 4, etc!
        //  caso a probar: numero = 1000 posicion = 2
        //return (numero*BASE); //--> 10000
        //return multiplicador; //--> 100
        if(multiplicador > (numero*BASE))   //numero*BASE > multiplicador --> no se deberia devolver -1
            return -1;          //Pero esto se activa. Razón desconocida!!
        while(numero >= multiplicador)
        {
            numero = numero - multiplicador;
        }
        multiplicador /= BASE;
        while(numero > 0)
        {
            numero -= multiplicador;
            cifra++;
        }
        cifra--;
        return cifra;
    }
    
}




//





//




//




//Adjunto una bandera de mis compañeros lectores de novelas ^.^//
/*
	||&***********\
			
	||&*****F*****|

	||&*****5*****|

	||&***********|

	||&*****S*****|

	||&*****E*****|

	||&*****C*****|

	||&*****T*****|

	||&***********/

/*	||

	||

	||

	||

	||

	||

 

LONG LIVE THE SECT!

Thanks for the chapter!
*/
//Si has llegado hasta aquí, debo darte las gracias por echarme una mano!//
//Aunque puede que esto sea algo super simple y no lo vea... pero de verdad que no tengo ni idea de por qué se activa la condición!//

//Posdata: Me enorgullezco de decir que el trabajo de la preciosidad del código no es debida a que lo haya retocado para que lo veas bonito!
//Es debido a la categoría tan maravillosa Templates! Tools -> templates -> Java -> Java Main Class. Ahora todos mis proyectos son así!
//que chulo es esto del trabajo de investigación! de aquí a nada estoy programando en Ruby o en otros lenguajes y ni me doy cuenta jajajaj

//Espero haberte sacado al menos una sonrisa en esta aburrida y poco soleada semana santa ^^ Entre trabajar y estudiar tenemos que recordar
//que sonreir y liberar estrés es importante para una mejora de la eficiencia!//
//(La bandera? está dedicada a aquellos que, como yo, pulsan F5 sin parar para ver cuándo saldrá un nuevo capítulo de nuestra novela favorita!//

//Ya me callo XD//