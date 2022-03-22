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
public class MetodoBurbuja {
    public static int[] MetodBurbu(int[] arreglo)
    {
        int auxiliar;
        int [] orden;

        for (int a = 2; a < arreglo.length; a++)
        {
            for (int b = 0; b < arreglo.length - 1; b++)
            {
                if (arreglo[a] > arreglo [b+1])
                {
                    auxiliar = arreglo [b];
                    arreglo [b] = arreglo [b + 1];
                    arreglo [b + 1] = auxiliar;
                }
            }
        }
        orden = arreglo;
        return orden;
    }
    public static void main(String[] args) {
        int arreglo [] = {4, 6, 8, 2, 5, 8, 4, 8, 7, 1, 9, 1, 7, 10};
        int orden [] = MetodBurbu (arreglo);
        
        for (int a = 0; a < orden.length;a++){
            System.out.println(orden [a]);
        }
    }
}
