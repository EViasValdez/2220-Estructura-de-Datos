/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

/**
 *
 * @author Eduardo
 */
public class MergeSort {
    public static void mergeSort(int[] a, int b){
        if (b < 2){
            return;
        }

        int med = b / 2;
        int [] iz = new int [med];
        int [] de = new int [b - med];
    
        for (int c = 0; c < med; c++){
            iz [c] = a [c];
        }
        for (int c = med; c < b; c++){
            de [c - med] = a [c];
        }

        mergeSort (iz, med);
        mergeSort (de, b - med);
        merge (a, iz, de, med, b - med);
    }
    public static void merge(int[] ar, int iz[], int de[], int izqu, int dere){
        int i = 0, j = 0, k = 0;

        while (i < izqu && j < dere){
            if (iz [i] <= de [j]){
                ar [k++] = iz [i++];
            }
        else {
            ar [k++] = de [j++];
        }
        }
        while (i < izqu){
            ar [k++] = iz [i++];
        }
        while (j < dere){
            ar [k++] = de [j++];
        }
    }
    public static void main(String[] args) {
        int [] actual = {5, 1, 6, 2, 3 ,4};
        mergeSort (actual, actual.length);

        for (int i = 0; i < actual.length; i++)
            System.out.println(actual [i]);
        }
}