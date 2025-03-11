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

public class OrdenamientoPorInsercion {
    public static void main(String[] args) {
        int [] ListaOrden = new int[100];
        int a, b;
        int Auxiliar;

        for (a = 1; a < 100; a++)
        {
            Auxiliar = ListaOrden[a];
            b = a - 1;

            while ((b >= 0) && ListaOrden[b] > Auxiliar)
            {
                ListaOrden[b + 1] = ListaOrden[b--];
                System.out.println(Auxiliar);
            }
        }
    }
}