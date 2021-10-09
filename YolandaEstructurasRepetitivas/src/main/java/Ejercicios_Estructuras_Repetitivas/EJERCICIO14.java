package Ejercicios_Estructuras_Repetitivas;

import java.util.Scanner;

public class EJERCICIO14 {
    public static void main(String[] args) {
        EJERCICIO14 ejercicio14= new EJERCICIO14();
        ejercicio14.ejercicio_14();
    }
    public void ejercicio_14(){
        Scanner sc= new Scanner(System.in);
        System.out.println("EJERCICIO 14: \n"+
                "Este programa determina el punto de encuentro entre dos coches");
        //Una persona se encuentra en el kilómetro 70 de una carretera, otra se encuentra en el km
        //150, los coches tienen sentido opuesto y tienen la misma velocidad. Realizar un programa
        //para determinar en qué kilómetro de esa carretera se encontrarán. No hace falta fisica
        int km1=150;
        int km2=70;
        int distancia=0;

        while (distancia <=0){
            km1--;
            km2++;
            distancia=(km1-km2)/2;
        }
        System.out.println("Los coches se encontrarán en el kilometro "+distancia);




    }
}
