/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ALUMNOS
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        // El tipo de dato de la lista va en mayusculas String, float, Double, Int.
        List <String> ejemploLista = new ArrayList<String>();

        String nombre;

        ejemploLista.add("Juan");
        ejemploLista.add("Pedro");
        ejemploLista.add("José");
        ejemploLista.add("María");
        ejemploLista.add("Sofía");

        // Imprimir elementos de la lista.
        System.out.println("Elementos de la lista ");

        for (int i = 0; i <= ejemploLista.size() - 1; i++) {
            System.out.println(ejemploLista.get(i));
        }

        System.out.println("Tamaño de la lista: " + ejemploLista.size());
        System.out.println("Primer elemento de la lista :" + ejemploLista.get(0));
     
        // Agregar otro elemento a la lista.
        ejemploLista.add("Alicia");
     
        System.out.println("Elementos de la lista con el que se agrego");
        for (int i = 0; i <= ejemploLista.size() - 1; i++) {
            System.out.println(ejemploLista.get(i));
        }

        ejemploLista.remove("Juan");

        System.out.println("Elementos de la lista despues de eliminar a Juan");
        System.out.println(ejemploLista);

        // Elimina al elemento de la posicion 1 de al Lista.
        ejemploLista.remove (1);

        System.out.println("Elementos de la lista despues de eliminar al elemeno de la posicion 1 de la lista");
        System.out.println(ejemploLista);  

        System.out.println("Escribe un nombre ");
        nombre = br.readLine();

        // Agregar el elemento que se leyo a la Lista.
        ejemploLista.add (nombre);

        // Otra manera de imprimir la Lista con la clase Iterator.
        Iterator i = ejemploLista.iterator();
        
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        // Si la lista contiene a un elmento.
        System.out.println(ejemploLista.contains("José"));

        // Si la lista esta vacia.
        System.out.println(ejemploLista.isEmpty());

        // Cambiar el elemento del subindice 1 de la lista por Felix.
        ejemploLista.set(1, "Félix");
        System.out.println(ejemploLista);
        // Obtener datos entre un subindice y otro.
        System.out.println(ejemploLista.subList(0, 2));
        // Metodo dosr ordena la lista de manera ascendente (en este caso de la A a la Z).
        ejemploLista.sort (null);
        System.out.println(ejemploLista);
        // Ordenar una Lista de manera descendete de la Z a la A.
        Collections.sort (ejemploLista,Collections.reverseOrder() );
        System.out.println(ejemploLista);
        
        // Vaciar la lista.
        ejemploLista.clear();
        System.out.println(ejemploLista);
    }
}