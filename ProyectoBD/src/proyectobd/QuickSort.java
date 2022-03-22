/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.util.Arrays;

/**
 *
 * @author Eduardo
 */
public class QuickSort {
    public static void main(String[] args) {
        int [] ar = {4, 5, 1, 2, 3, 3};
        qs (ar, 0, ar.length - 1);

        System.out.println(Arrays.toString (ar));
    }
    public static void qs (int[] ar, int inicio, int fin){
        int particion = particion(ar, inicio, fin);
    
        if (particion - 1 > inicio){
            qs (ar, inicio, particion - 1);
        }
        if (particion + 1 < fin){
            qs (ar, fin, particion - 1);
        }
    }
    public static int particion(int[] ar, int inicio, int fin){
        int pivot = ar [fin];
    
        for (int a = inicio; a < fin; a++){
                if (ar [a] < pivot){
                    int temp = ar [inicio];
                    ar [inicio] = ar [a];
                    ar [a] = temp;
                    inicio++;
                }
        }
        int temp = ar [inicio];
    
        ar [inicio] = pivot;
        ar [fin] = temp;
    
        return inicio;
    }
}