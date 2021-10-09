package Ejercicios_Estructuras_Repetitivas;

import java.util.Scanner;

public class EJERCICIO11 {
    public static void main(String[] args) {
        EJERCICIO11 ejercicio11 = new EJERCICIO11();
        ejercicio11.ejercicio_11();
    }

    public void ejercicio_11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("EJERCICIO 11\n" + "\tDame un número, este programa te dirá si es primo o no:");
        boolean esprimo = true;
        int numero = sc.nextInt(), m = 2;
        while ((esprimo) && (m < numero)) {
            if (numero % m == 0) {
                esprimo = false;
            } else m = m + 1;
        }
        if (esprimo) {
            System.out.println("Es primo");
        } else System.out.println("No es primo");

    }
}

