/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas1;

import java.util.ArrayList;

/**
 *
 * @author EViasValdez
 */

public class Pila extends ArrayList {
    // Se añade un elemento a la pila (push).
    public void apilar(Object Dato) {
        if (Dato != null) {
            this.add (Dato);
        } else {
            System.out.println("Introduzca un dato no nulo");
        }
    }
    // Se elimina el elemento frontal de la pila (pop).
    public void desapilar() {
        if (size() > 0){
            this.remove (this.size() - 1);
        }
    }
    // Regresa el elemento que esta en la cima de la pila (top o peek).
    public Object cima() {
        Object DatoAuxiliar = null;
        if (this.size() > 0) {
            DatoAuxiliar = this.get (this.size() - 1);
        }
    return DatoAuxiliar;
    }
    // Devuelve "cierto" si la pila está vacía o falso en caso contrario (empty).
    public boolean vacia() {
        return this.isEmpty();
    }
}