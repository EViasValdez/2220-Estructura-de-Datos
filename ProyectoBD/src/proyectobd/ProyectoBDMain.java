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
import static proyectobd.QuickSort.Qs;

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
        boolean Menu = false;

        do {
            System.out.println("Eliga una opcion de metodo");

            int Op;

            Scanner teclado = new Scanner (System.in);

            System.out.println("1. Metodo Burbuja");
            System.out.println("2. Ordenamiento por insercion");
            System.out.println("3. Ordenamiento por seleccion");
            System.out.println("4. Merge Sort");
            System.out.println("5. Quick Sort");
            Op = teclado.nextInt();

            switch (Op) {
            case 1:
                System.out.println("Metodo burbuja");
                int Arreglo [] = {4, 6, 8, 2, 5, 8, 4, 8, 7, 1, 9, 1, 7, 10};
                int Orden [] = MetodBurbu (Arreglo);

                for (int a = 0; a < Orden.length;a++){
                    System.out.println(Orden [a]);
                }
                System.out.println("======================================");
            break;

            case 2:
                System.out.println("Ordenamiento por insercion");
                int [] ListaOrden = new int [100];
                int a, b;
                int Auxiliar;

                for (a = 1; a < 100; a++) {
                    Auxiliar = ListaOrden [a];
                    b = a - 1;

                    while ((b >= 0) && ListaOrden [b] > Auxiliar){
                        ListaOrden [b + 1] = ListaOrden [b--];
                        ListaOrden [b + 1] = Auxiliar;
                        System.out.println(Auxiliar);
                        System.out.println("======================================");
                    }
                }
            break;

            case 3:
                System.out.println("Ordenamiento por seleccion");
                OrdenamientoPorSeleccion SO = new OrdenamientoPorSeleccion();

                int [] Lista = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};

                SO.imprimirArreglo(Lista);
                SO.OrdenSeleccion(Lista);
                SO.imprimirArreglo(Lista);
                System.out.println("======================================");
            break;

            case 4:
                System.out.println("Merge sort");
                int [] Actual = {5, 1, 6, 2, 3 ,4};

                mergeSort (Actual, Actual.length);

                for (int i = 0; i < Actual.length; i++) {
                    System.out.println(Actual [i]);
                }
                System.out.println("======================================");
            break;

            case 5:
                System.out.println("Quick sort");
                int [] ar = {4, 5, 1, 2, 3, 3};
                
                Qs (ar, 0, ar.length - 1);

                System.out.println(Arrays.toString (ar));
                System.out.println("======================================");
            break;

        }
        }
        while (!Menu);
    }
}