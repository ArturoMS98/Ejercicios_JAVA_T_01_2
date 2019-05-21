package t_01_2_ej29;
import java.util.Scanner;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 10, 2019 00:24:31 PM                             *
 * fecha de finalizacion: May 10, 2019 01:13:00 PM                               *
 * nombre del proyecto: T_01_2_Ej29.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 29. Escribir un programa que, pida la fecha de nacimiento de una persona e  *
 *     imprima por pantalla su signo zodiacal.                                 *
 *                                                                             *
 ******************************************************************************/

public class T_01_2_Ej29 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Pide fecha de nacimiento y abre switch que define el signo zodiacal      *
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // VARIABLES LOCALES //
        int dia;
        int mes;
        int anio;
        String signo = "Sin definir";
        Scanner in = new Scanner(System.in);
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.print(año_nac);
            anio = in.nextInt();
            System.out.print(mes_nac);
            mes = in.nextInt();
            System.out.print(dia_nac);
            dia = in.nextInt();
        // Esqueleto de la aplicacion: //
        //BACKEND//
        switch(mes)
        {
            case 1:
            {
                if(dia <= 19 && dia > 0)
                    signo = CAPRICORNIO;
                else if(dia > 19 && dia <= 31)
                    signo = ACUARIO;
            }
            break;
            case 2:
            {
                if(dia <= 19 && dia > 0)
                    signo = ACUARIO;
                else if(dia > 19 && dia <= 29)
                    signo = PISCIS;
            }
            break;
            case 3:
            {
                if(dia <= 20 && dia > 0)
                    signo = PISCIS;
                else if(dia > 20 && dia <= 31)
                    signo = ARIES;
            }
            break;
            case 4:
            {
                if(dia <= 20 && dia > 0)
                    signo = ARIES;
                else if(dia > 20 && dia <= 30)
                    signo = TAURO;
            }
            break;
            case 5:
            {
                if(dia <= 20 && dia > 0)
                    signo = TAURO;
                else if(dia > 20 && dia <= 31)
                    signo = GEMINIS;
            }
            break;
            case 6:
            {
                if(dia <= 21 && dia > 0)
                    signo = GEMINIS;
                else if(dia > 21 && dia <= 30)
                    signo = CANCER;
            }
            break;
            case 7:
            {
                if(dia <= 22 && dia > 0)
                    signo = CANCER;
                else if(dia > 22 && dia <= 31)
                    signo = LEO;
            }
            break;
            case 8:
            {
                if(dia <= 23 && dia > 0)
                    signo = LEO;
                else if(dia > 23 && dia <= 31)
                    signo = VIRGO;
            }
            break;
            case 9:
            {
                if(dia <= 23 && dia > 0)
                    signo = VIRGO;
                else if(dia > 23 && dia <= 30)
                    signo = LIBRA;
            }
            break;
            case 10:
            {
                if(dia <= 22 && dia > 0)
                    signo = LIBRA;
                else if(dia > 22 && dia <= 31)
                    signo = ESCORPIO;
            }
            break;
            case 11:
            {
                if(dia <= 22 && dia > 0)
                    signo = ESCORPIO;
                else if(dia > 22 && dia <= 29)
                    signo = SAGITARIO;
            }
            break;
            case 12:
            {
                if(dia <= 21 && dia > 0)
                    signo = SAGITARIO;
                else if(dia > 21 && dia <= 29)
                    signo = CAPRICORNIO;
            }
            break;
            default: System.out.println(INTRODUZCA_UNA_OPCIÓN_VÁLIDA);
        }
        System.out.println(SU_SIGNO_ES_ + signo);
    }
    // VARIABLES LOCALES //
    private static final String dia_nac = "Introduzca ahora su dia de nacimiento: ";
    private static final String mes_nac = "Introduzca su mes de nacimiento: ";
    private static final String año_nac = "Introduzca su año de nacimiento: ";
    private static final String ACUARIO = "acuario";
    private static final String PISCIS = "Piscis";
    private static final String ARIES = "Aries";
    private static final String TAURO = "Tauro";
    private static final String GEMINIS = "Geminis";
    private static final String CANCER = "Cancer";
    private static final String LEO = "Leo";
    private static final String VIRGO = "Virgo";
    private static final String LIBRA = "Libra";
    private static final String ESCORPIO = "Escorpio";
    private static final String SAGITARIO = "Sagitario";
    private static final String CAPRICORNIO = "Capricornio";
    private static final String SU_SIGNO_ES_ = "Su signo es ";
    private static final String INTRODUZCA_UNA_OPCIÓN_VÁLIDA = "Por favor, introduzca una opción válida.";
}