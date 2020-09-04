import java.util.ArrayList;
import java.util.List;

class diccionario{

    //el numero max de palabras que puede haber por diccionario, lo hago variable para alterarlo al agregar o quitar una palabra
    public static int numespanol = 20;
    public static int numkaq = 20;

    //espanol, para las palabras en espanol.
    //kaq, para las palabras en kaqchikel.
    public static String[] espanol = new String[numespanol];
    public static String[] kaq = new String[numkaq];

    public static void quitar (String palespanol){

        for(int i=0; i < numespanol; i++){

            if(espanol[i].equals(palespanol)){

                espanol[i] = null;

            }

        }

    }

    public static void agregar (String palespanol, String palkaq){

        //le sumo para hacer dos cosas de una, uno cambiar el valor max de objetos en espanol y kaq y dos para la posicion del objeto
        numespanol++;
        numkaq++;

        //agrego las palabras a espanol y a kaq
        espanol[numespanol] = palespanol;
        kaq[numkaq] = palkaq;

    }

    public String biblioteca (int numero){

        //el numero, ay no jodan es para usar array
        int num = numero;

        String respuesta = null;

        if(num < 20){

            espanol[0] = "A";
            espanol[1] = "I";
            espanol[2] = "U";
            espanol[3] = "E";
            espanol[4] = "O";

            espanol[5] = "KA";
            espanol[6] = "KI";
            espanol[7] = "KU";
            espanol[8] = "KE";
            espanol[9] = "KO";

            espanol[10] = "SA";
            espanol[11] = "SHI";
            espanol[12] = "SU";
            espanol[13] = "SE";
            espanol[14] = "SO";

            espanol[15] = "TA";
            espanol[16] = "CHI";
            espanol[17] = "TSU";
            espanol[18] = "TE";
            espanol[19] = "TO";

            kaq[0] = "あ";
            kaq[1] = "い";
            kaq[2] = "う";
            kaq[3] = "え";
            kaq[4] = "お";

            kaq[5] = "か";
            kaq[6] = "き";
            kaq[7] = "く";
            kaq[8] = "け";
            kaq[9]= "こ";

            kaq[10] = "さ";
            kaq[11] = "し";
            kaq[12] = "す";
            kaq[13] = "せ";
            kaq[14] = "そ";

            kaq[15] = "た";
            kaq[16] = "ち";
            kaq[17] = "つ";
            kaq[18] = "て";
            kaq[19] = "と";


            respuesta = espanol[num] + "," + kaq[num];

            return respuesta;

        } else{

            return respuesta;

        }

    }
    
}