package Ejercicios_Estructuras_Repetitivas;

import java.util.Scanner;

public class EJERCICIO20 {
    public static void main(String[] args) {
        EJERCICIO20 ejercicio20 = new EJERCICIO20();
        ejercicio20.ejercicio_20();
    }

    public void ejercicio_20() {
        Scanner sc = new Scanner(System.in);
        System.out.println("EJERCICIO 20: \n" +
                "Este programa te muestro los primeros N números primos que quieras ver");
        //Mostrar en pantalla los N primero número primos. Se pide por teclado la cantidad de
        //números primos que queremos mostrar.
        System.out.println("Escribe la cantidad de números primos quieras ver");
        int cantidad = sc.nextInt();
        int numero = 1;
        int x;
        int divisores;

        while (cantidad > 0) {
            numero++;
            x=1;
            divisores=0;
            while (x<=numero){
                if (numero%x==0){
                    divisores++;
                }
                x++;
            }
            if (divisores==2){
                System.out.println(numero);
                cantidad--;
            }
        }
    }}
