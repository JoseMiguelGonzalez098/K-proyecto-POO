/******************************************************************
biblioteca.java
Autores: Jose Gonzalez, Carol Arevalo
Última modificación: 19/08/20

Biblioteca de palabras de español a cacchiquel para proyecto POO
******************************************************************/

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

        //el numero, ay no se como explicarlo es para usar array
        int num = numero;

        String respuesta = null;

        if(num < 20){
            //Voc de saludos
            espanol[0] = "Buenos días";
            espanol[1] = "Gracias";
            espanol[2] = "Buenas noches";
            espanol[3] = "¿Cómo estas?";
            espanol[4] = "Bien gracias";

            //Voc de familia
            espanol[5] = "Familia";
            espanol[6] = "Madre";
            espanol[7] = "Padre";
            espanol[8] = "Hijos";
            espanol[9] = "Nieto";

            //Voc de diario
            espanol[10] = "¿Cuál es tu nombre?";
            espanol[11] = "Dormitorio";
            espanol[12] = "Sala";
            espanol[13] = "Baño";
            espanol[14] = "Cocina";

            espanol[15] = "Cabeza";
            espanol[16] = "Oreja";
            espanol[17] = "Nariz";
            espanol[18] = "Ojos";
            espanol[19] = "Boca";

            kaq[0] = "Saqer";
            kaq[1] = "Matyox";
            kaq[2] = "Xo’qa";
            kaq[3] = "La ütz awäch?”, ";
            kaq[4] = "Ütz matyox";

            kaq[5] = "Ach´alal";
            kaq[6] = "Te´ej";
            kaq[7] = "Tata´aj";
            kaq[8] = "Alk´walaxela";
            kaq[9]= "mam";

            kaq[10] = "Achike ab’i’ rat?";
            kaq[11] = "warab’äl";
            kaq[12] = "nimajay";
            kaq[13] = "ruxikin jay";
            kaq[14] = "ruchi’ q’aq’";

            kaq[15] = "jolomaj";
            kaq[16] = "xikinaj";
            kaq[17] = "tzamaj";
            kaq[18] = "runaq’ wachaj";
            kaq[19] = "chi’aj";


            respuesta = espanol[num] + "," + kaq[num];

            return respuesta;

        } else{

            return respuesta;

        }

    }
    
}
