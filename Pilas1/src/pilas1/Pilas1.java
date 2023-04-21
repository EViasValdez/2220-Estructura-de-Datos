/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas1;

import java.util.Iterator;

/**
 *
 * @author EViasValdez
 */

public class Pilas1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------Pila------");
        Pila Pila = new Pila(); // Es creado el objeto lalmado pila y se instancia a la clase "Pila".
        
        Pila.Apilar("A"); // Se manda llamar al metodo "Apilar" con el objeto "pila" y se le agrega la letra "A" a la pila.
        Pila.Apilar("B");
        Pila.Apilar("C");
        Pila.Apilar("D");

        //Con la clase Iterator se recorre el objeto "pila" pues se creo el objeto "iterator" de la clase "Iterator"
        Iterator iterator = Pila.iterator();

        System.out.println("Elementos de la pila: ");
        while (iterator.hasNext()) { // Mientras los elementos de la pila se van recorriendo
            System.out.print(iterator.next() + " ");  // con hasNext cada uno de los elemntos de la lista se van imprimiendo.
        }

        System.out.println("¿Esta vacia la pila? " + Pila.vacia()); // Revisa si la pila esta vacia manda llamar al metodo vacia de al clase "Pila".
        System.out.println("Tamaño de la pila: " + Pila.size()); // Muestra el tamaño de la pila.

        System.out.println(Pila.Cima()); // Manda llamar al metodo "Cima" de la clase "Pila" y regresa el elemento de la cima de la pila
        Pila.Desapilar(); // Una vez estando en la Cima en el primer elemento de la pila manda llamar al metodo Desapilar de la 
        System.out.println(Pila.Cima()); // clase "Pila" en el metodo desapilar elimina el elemento de la pila con el metodo "remove".
        Pila.Desapilar();
        System.out.println(Pila.Cima());
        Pila.Desapilar();
        System.out.println("Elementos en la pila " + Pila); // Imprime los elementos de la pila.

        System.out.println("¿Esta vacia la pila? " + Pila.Vacia()); // Manda llamar al metodo "Vacia" de la Clase "Pila".
        // Verifica si la pila esta vacia con el metodo "Empty".

        System.out.println("------Cola------");
        Cola Cola = new Cola();
        Cola.encolar("A");
        Cola.encolar("B");
        Cola.encolar("C");
        Cola.encolar("D");

        System.out.println("¿Esta vacia la cola?" + Cola.Vacia());
        System.out.println("Tamaño de la cola: " + Cola.size());
        System.out.println(Cola.frente());
        Cola.desencolar();
        System.out.println(Cola.frente());
        Cola.desencolar();
        System.out.println(Cola.frente());
        Cola.desencolar();

        System.out.println("Elementos en la cola: " + Cola);
        System.out.println("¿Esta vacia la cola? " + Cola.Vacia());
      }
}