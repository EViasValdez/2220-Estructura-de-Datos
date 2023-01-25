/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas2;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author EViasValdez
 */
public class Pilas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Clase stack para el manejo de pilas
        Stack <String> Pila = new Stack<String>();
        // Se recorre con un ciclo pop al objeto "pila" para ingresar datos en la pila con el metodo push.
        for (int x = 1; x <= 10; x++) {
            Pila.push (Integer.toString(x));
            // Con la clase Iterator se recorreran los elementos de la pila y a mostrarla.
            Iterator iterator = Pila.iterator();
            
            System.out.println("Elementos de la pila: ");
            while (iterator.hasNext()) { // Mientras los elementos de la pila se van recorriendo con hasNext
                System.out.print(iterator.next() + " "); // se van imprimiendo cada uno de los elementos de la lista.
            }
        }
        System.out.println("\n Elemento en la cima de la pila " + Pila.peek());
        System.out.println("\n Vamos a vaciar la pila");

        // Mientras la pila no esta vacia se eliminara cada elemento de la cima con el metodo pop.
        while (!Pila.empty())
        System.out.println(Pila.pop());
        // Se muestran los elementos de la pila despues de haberla vaciado.
        System.out.println("Elementos de la pila: " + Pila);
    }
}