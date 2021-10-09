package Ejercicios_Estructuras_Repetitivas;

import java.util.Scanner;

public class EJERCICIO15 {
    public static void main(String[] args) {
        EJERCICIO15 ejercicio15=new EJERCICIO15();
        ejercicio15.ejercicio_15();
    }

    public void ejercicio_15() {
        Scanner sc= new Scanner(System.in);
        System.out.println("EJERCICIO 15: \n"+
                "Este programa sirve para llevar cuenta de un sistema de pagos mensuales");
        //Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el
        //segundo 20 €, el tercero 40 € y así sucesivamente. Realizar un algoritmo para determinar
        //cuánto debe pagar mensualmente y el total de
        //lo que pagó después de los 20 meses.
        int mes=1;
        int pago=10;

        while (mes<=20){
            System.out.println("Este mes "+mes+" pagas   "+pago+"\n");
            pago=pago*2;
            mes++;
        }
        System.out.println("El pago total es "+pago+" euros");


    }
}
