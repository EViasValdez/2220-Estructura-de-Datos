/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.util.Arrays;
import java.util.Scanner;
import static proyectobd.MergeSort.mergeSort;
import static proyectobd.MetodoBurbuja.MetodBurbu;
import static proyectobd.QuickSort.qs;

/**
 *
 * @author EViasValdez
 */
public class ProyectoBDMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Proyecto de Estructura de base de datos");
        boolean menu = false;

        do {
            System.out.println("Eliga una opcion de metodo");

            int op;

            Scanner teclado = new Scanner (System.in);

            System.out.println("1. Metodo Burbuja");
            System.out.println("2. Ordenamiento por inserción");
            System.out.println("3. Ordenamiento por selección");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            op = teclado.nextInt();

            switch (op){
            case 1:
                System.out.println("Metodo burbuja");
                int arreglo [] = {4, 6, 8, 2, 5, 8, 4, 8, 7, 1, 9, 1, 7, 10};
                int orden [] = MetodBurbu (arreglo);

                for (int a = 0; a < orden.length;a++){
                    System.out.println(orden [a]);
                }
                System.out.println("======================================");
            break;

            case 2:
                System.out.println("Ordenamiento por insercion");
                int [] listaorden = new int [100];
                int a, b;
                int auxiliar;

                for (a = 1; a < 100; a++){
                    auxiliar = listaorden [a];
                    b = a - 1;

                    while ((b >= 0) && listaorden [b] > auxiliar){
                        listaorden [b + 1] = listaorden [b--];
                        listaorden [b + 1] = auxiliar;
                        System.out.println(auxiliar);
                        System.out.println("======================================");
                    }
                }
            break;

            case 3:
                System.out.println("Ordenamiento por seleccion");
                OrdenamientoPorSeleccion SO = new OrdenamientoPorSeleccion();

                int [] lista = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};

                SO.imprimirArreglo (lista);
                SO.OrdenSeleccion (lista);
                SO.imprimirArreglo (lista);
                System.out.println("======================================");
            break;

            case 4:
                System.out.println("Merge sort");
                int [] actual = {5, 1, 6, 2, 3 ,4};

                mergeSort (actual, actual.length);

                for (int i = 0; i < actual.length; i++){
                    System.out.println(actual [i]);
                }
                System.out.println("======================================");
            break;

            case 5:
                System.out.println("Quick sort");
                int [] ar = {4, 5, 1, 2, 3, 3};
                
                qs (ar, 0, ar.length - 1);

                System.out.println(Arrays.toString (ar));
                System.out.println("======================================");
            break;

        }
        }
        while (!menu);
    }
}