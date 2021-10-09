package Ejercicios_Estructuras_Repetitivas;

import java.util.Scanner;

public class EJERCICIO18 {
    public static void main(String[] args) {
        EJERCICIO18 ejercicio18=new EJERCICIO18();
        ejercicio18.ejercicio_18();
    }
    public void ejercicio_18(){
        Scanner sc= new Scanner(System.in);
        System.out.println("EJERCICIO 18:\n"+
                "Esto es un cronómetro");
        //Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
        int segundos=0;
        int minutos=0;
        int horas=0;

        while ((horas<24)){
            segundos++;
            if (segundos==60){
                segundos=0;
                minutos++;
                if (minutos == 60){
                    minutos=0;
                    horas++;
                }
            }
            System.out.println(horas+":"+minutos+":"+segundos);
        }

    }
}
