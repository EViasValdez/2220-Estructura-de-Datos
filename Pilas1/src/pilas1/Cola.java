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
public class Cola extends ArrayList {
    // Es agregado un elemento a la cola, que se añade al final de esta.
    public void encolar(Object Dato) {
        if (Dato != null) {
            this.add (Dato);
        }else{
            System.out.println("Introduzca un dato no nulo");
        }
    }
    // Se elimina el elemento frontal de la cola, refiriendose al primer elemento que entró.
    public void desencolar() {
        if (this.size() > 0) {
            this.remove (0);
        }
    }
    // Es devuelto el elemento frontal de la cola, que es el primer elemento que entró.
    public Object frente() {
        Object DatoAuxiliar = null;
        if (this.size() > 0) {
            DatoAuxiliar = this.get (0);
        }
        return DatoAuxiliar;
    }
    // Devuelve "cierto" si la pila está vacía o falso en caso contrario (empty).
    public boolean vacia() {
        return this.isEmpty();
    }
}