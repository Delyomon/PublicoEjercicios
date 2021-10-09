package Ejercicios_Estructuras_Repetitivas;

import java.util.Scanner;

public class EJERCICIO16 {
    public static void main(String[] args) {
        EJERCICIO16 ejercicio16 = new EJERCICIO16();
        ejercicio16.ejercicio_16();
    }

    public void ejercicio_16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("EJERCICIO 16:\n" +
                "Este programa calcula el sueldo de los empleados semanalmente y por toda la plantilla");
        //Una empresa les paga a sus empleados con base en las horas trabajadas en la semana.
        //Realice un algoritmo para determinar el sueldo semanal de N trabajadores y, además, calcule
        //cuánto pagó la empresa por los N empleados

        System.out.println("-----HORAS Y SUELDO-----");
        System.out.println("NÚMERO DE EMPLEADOS:   ");
        int n= sc.nextInt();
        System.out.println("SUELDO POR HORA BASE");
        int sueldo= sc.nextInt();

        int semana=1;
        int suma=0;

        while (semana<=4){
            System.out.println("INGRESA HORAS TRABAJADAS EN LA SEMANA    "+semana);
            int horas= sc.nextInt();

            sueldo=n*horas;
            suma= suma+sueldo;

            semana++;
        }
        System.out.println("ESTE MES SE PAGA SEMANALMENTE "+suma/4+" euros Y "+suma+" euros POR TODOS LOS EMPLEADOS");

    }
}

