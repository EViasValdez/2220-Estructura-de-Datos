/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

/**
 *
 * @author EViasValdez
 */

public class MergeSort {
    public static void MergeSort(int[] a, int b) {
        if (b < 2)
        {
            return;
        }

        int Med = b / 2;
        int [] Iz = new int[Med];
        int [] De = new int[b - Med];
    
        for (int c = 0; c < Med; c++)
        {
            Iz[c] = a[c];
        }
        for (int c = Med; c < b; c++)
        {
            De[c - Med] = a[c];
        }
        
        MergeSort(Iz, Med);
        MergeSort(De, b - Med);
        Merge(a, Iz, De, Med, b - Med);
    }
    public static void Merge(int[] Ar, int Iz[], int De[], int Izqu, int Dere) {
        int i = 0, j = 0, k = 0;

        while (i < Izqu && j < Dere)
        {
            if (Iz[i] <= De[j])
            {
                Ar[k++] = Iz[i++];
            }
        else {
            Ar[k++] = De[j++];
        }
        }
        while (i < Izqu)
        {
            Ar[k++] = Iz[i++];
        }
        while (j < Dere)
        {
            Ar[k++] = De[j++];
        }
    }
    public static void main(String[] args) {
        int [] Actual = {5, 1, 6, 2, 3 ,4};

        MergeSort (Actual, Actual.length);

        for (int i = 0; i < Actual.length; i++) {
            System.out.println(Actual[i]);
        }
    }
}