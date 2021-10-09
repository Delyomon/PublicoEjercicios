package Ejercicios_Estructuras_Repetitivas;

import java.util.Scanner;

public class Menu_Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----MENU EJERCICIOS----\n" +
                "\tEJERCICIO 11....Nº1\n" +
                "\tEJERCICIO 12....Nº2\n" +
                "\tEJERCICIO 13....Nº3\n" +
                "\tEJERCICIO 14....Nº4\n" +
                "\tEJERCICIO 15....Nº5\n" +
                "\tEJERCICIO 16....Nº6\n" +
                "\tEJERCICIO 17....Nº7\n" +
                "\tEJERCICIO 18....Nº8\n" +
                "\tEJERCICIO 20....Nº9\n\n" +
                "INGRESA EL Nº DEL EJERCICIO QUE QUIERAS VER O PULSA 0 PARA SALIR");
                int opcion = sc.nextInt();
        while (opcion > 0) {
            switch (opcion) {
                case 1:
                    EJERCICIO11 ejercicio11 = new EJERCICIO11();
                    ejercicio11.ejercicio_11();
                    break;
                case 2:
                    EJERCICIO12 ejercicio12 = new EJERCICIO12();
                    ejercicio12.ejercicio_12();
                    break;
                case 3:
                    EJERCICIO13 ejercicio13 = new EJERCICIO13();
                    ejercicio13.ejercicio_13();
                    break;
                case 4:
                    EJERCICIO14 ejercicio14 = new EJERCICIO14();
                    ejercicio14.ejercicio_14();
                    break;
                case 5:
                    EJERCICIO15 ejercicio15 = new EJERCICIO15();
                    ejercicio15.ejercicio_15();
                    break;
                case 6:
                    EJERCICIO16 ejercicio16 = new EJERCICIO16();
                    ejercicio16.ejercicio_16();
                    break;
                case 7:
                    EJERCICIO17 ejercicio17 = new EJERCICIO17();
                    ejercicio17.ejercicio_17();
                    break;
                case 8:
                    EJERCICIO18 ejercicio18 = new EJERCICIO18();
                    ejercicio18.ejercicio_18();
                    break;
                case 9:
                    EJERCICIO20 ejercicio20 = new EJERCICIO20();
                    ejercicio20.ejercicio_20();
                    break;
                default:
                    System.out.println("POR FAVOR INGRESE UN NÚMERO DE EJERCICIO VÁLIDO O PULSE 0 PARA SALIR");
                    break;
            }
            System.out.println("INGRESA OTRO NÚMERO DE EJERCICIO, O PULSA 0 PARA SALIR");
            opcion = sc.nextInt();
        }

    }
}
