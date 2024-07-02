/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.util.Arrays;

/**
 *
 * @author EViasValdez
 */

public class QuickSort {
    public static void main(String[] args) {
        int [] Ar = {4, 5, 1, 2, 3, 3};
        Qs(Ar, 0, Ar.length - 1);

        System.out.println(Arrays.toString(Ar));
    }
    public static void Qs (int[] Ar, int Inicio, int Fin) {
        int Particion = Particion(Ar, Inicio, Fin);
    
        if (Particion - 1 > Inicio) {
            Qs(Ar, Inicio, Particion - 1);
        }
        if (Particion + 1 < Fin) {
            Qs(Ar, Fin, Particion - 1);
        }
    }
    public static int Particion(int[] Ar, int Inicio, int Fin) {
        int Pivot = Ar[Fin];
    
        for (int a = Inicio; a < Fin; a++) {
            if (Ar[a] < Pivot) {
                int Temp = Ar[Inicio];
                
                Ar[Inicio] = Ar[a];
                Ar[a] = Temp;
                Inicio++;
            }
        }
        int Temp = Ar[Inicio];
    
        Ar[Inicio] = Pivot;
        Ar[Fin] = Temp;
    
        return Inicio;
    }
}