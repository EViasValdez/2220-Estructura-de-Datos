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
public class OrdenamientoPorSeleccion {
    public void OrdenSeleccion (int[] lista){
        for (int a = lista.length - 1; a > 0; a--){
            int valorMaximo = 0;

            for (int b = 0; b < a; b++){
                if (lista [b + 1] > lista [valorMaximo]){
                    valorMaximo = b + 1;
                }
            }
        }
    }
    public void imprimirArreglo(int[] lista){
        for (int a = 0; a < lista.length; a++){
            System.out.printf("%d \t", lista [a]);
        }
        System.out.println();
    }
    public void swap(int[] lista, int a, int b){
        int valor = lista [b];
        lista [b] = lista [a];
        lista [a] = valor;
    }
    public static void main(String[] args) {
        OrdenamientoPorSeleccion SO = new OrdenamientoPorSeleccion();

        int [] lista = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};

        SO.imprimirArreglo (lista);
        SO.OrdenSeleccion (lista);
        SO.imprimirArreglo (lista);
    }
}