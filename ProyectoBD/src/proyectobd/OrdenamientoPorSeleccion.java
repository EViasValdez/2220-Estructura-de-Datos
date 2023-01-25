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
public class OrdenamientoPorSeleccion {
    public void OrdenSeleccion (int[] Lista){
        for (int a = Lista.length - 1; a > 0; a--) {
            int ValorMaximo = 0;

            for (int b = 0; b < a; b++) {
                if (Lista [b + 1] > Lista [ValorMaximo]) {
                    ValorMaximo = b + 1;
                }
            }
        }
    }
    public void imprimirArreglo(int[] Lista){
        for (int a = 0; a < Lista.length; a++) {
            System.out.printf("%d \t", Lista [a]);
        }
        System.out.println();
    }
    public void swap(int[] Lista, int a, int b) {
        int Valor = Lista [b];
        Lista [b] = Lista [a];
        Lista [a] = Valor;
    }
    public static void main(String[] args) {
        OrdenamientoPorSeleccion SO = new OrdenamientoPorSeleccion();
        int [] Lista = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};

        SO.imprimirArreglo(Lista);
        SO.OrdenSeleccion(Lista);
        SO.imprimirArreglo(Lista);
    }
}