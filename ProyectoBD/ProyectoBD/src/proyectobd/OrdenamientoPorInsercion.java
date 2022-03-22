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
public class OrdenamientoPorInsercion {
    public static void main(String[] args) {
        int [] listaorden = new int [100];
        int a, b;
        int auxiliar;
    
    for (a = 1; a < 100; a++){
        auxiliar = listaorden [a];
        b = a - 1;

        while ((b >= 0) && listaorden [b] > auxiliar){}
            listaorden [b + 1] = listaorden [b--];
            System.out.println(auxiliar);
        }
    }
    }
}
