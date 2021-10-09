package Ejercicios_Estructuras_Repetitivas;

import java.util.Scanner;

public class EJERCICIO12 {
    public static void main(String[] args) {
        EJERCICIO12 ejercicio12= new EJERCICIO12();
        ejercicio12.ejercicio_12();
    }
    public void ejercicio_12(){
        Scanner sc= new Scanner(System.in);
        System.out.println("EJERCICIO 12: \n"+"Este programa determinará cuánto gana una persona en un año dados unos ingresos mensuales");
        //Realizar un algoritmo para determinar cuánto ahorrará una persona en un año, si al final de
        //cada mes deposita cantidades variables de dinero; además, se quiere saber cuánto lleva
        //ahorrado cada mes.
        System.out.println("----AHORROS---");
        int suma=0;
        int mes=1;
        while (mes<=12) {
            System.out.println("INGRESA AHORRO DEL MES     "+mes);
            int ahorro= sc.nextInt();
            suma=suma+ahorro;
            System.out.println("Llevas ahorrado   "+suma+"$");
            mes++;
        }
        System.out.println("\nEn total llevas ahorrado   "+suma+"$");
    }

}
