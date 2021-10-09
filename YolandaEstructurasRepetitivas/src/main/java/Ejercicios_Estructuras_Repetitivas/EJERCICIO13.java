package Ejercicios_Estructuras_Repetitivas;

import java.util.Scanner;

public class EJERCICIO13 {
    public static void main(String[] args) {
        EJERCICIO13 ejercicio13 = new EJERCICIO13();
        ejercicio13.ejercicio_13();
    }

    public void ejercicio_13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("EJERCICIO 13: \n" +
                "Este programa va a determinar el total de horas de trabajo y sueldo de un empleado");
        //Una empresa tiene el registro de las horas que trabaja diariamente un empleado durante la
        //semana (seis días) y requiere determinar el total de éstas, así como el sueldo que recibirá
        //por las horas trabajadas.
        System.out.println("-----HORAS Y SUELDO-----");
        int dia = 1;
        int suma = 0;
        System.out.println("¿Cuánto cobra el empleado por cada hora trabajada?");
        int sueldo = sc.nextInt();
        while (dia <= 6) {
            System.out.println("Ingresa las horas del día " + dia);
            int horas = sc.nextInt();
            suma = suma + horas;
            System.out.println("\tLLeva un total de " + suma + " HORAS trabajadas hasta \n");
            dia++;
        }
        sueldo = sueldo * suma;
        System.out.println("Lleva un total de " + suma + " horas trabajadas y cobrará " + sueldo + " euros.");


    }
}
