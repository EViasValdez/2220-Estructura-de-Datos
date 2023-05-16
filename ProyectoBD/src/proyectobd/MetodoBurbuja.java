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

public class MetodoBurbuja {
    public static int[] MetodBurbu(int[] Arreglo) {
        int Auxiliar;
        int [] Orden;

        for (int a = 2; a < Arreglo.length; a++)
        {
            for (int b = 0; b < Arreglo.length - 1; b++)
            {
                if (Arreglo[a] > Arreglo[b + 1])
                {
                    Auxiliar = Arreglo[b];
                    Arreglo[b] = Arreglo[b + 1];
                    Arreglo[b + 1] = Auxiliar;
                }
            }
        }
        Orden = Arreglo;
        return Orden;
    }
    public static void main(String[] args) {
        int Arreglo [] = {4, 6, 8, 2, 5, 8, 4, 8, 7, 1, 9, 1, 7, 10};
        int Orden [] = MetodBurbu (Arreglo);

        for (int a = 0; a < Orden.length; a++) {
            System.out.println(Orden[a]);
        }
    }
}