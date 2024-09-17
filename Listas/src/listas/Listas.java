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
 * @author EViasValdez
 */

public class Listas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // El tipo de dato de la lista va en mayusculas (String, float, Double, Int).
        List <String> EjemploLista = new ArrayList<String>();

        String Nombre;

        EjemploLista.add("Juan");
        EjemploLista.add("Pedro");
        EjemploLista.add("José");
        EjemploLista.add("María");
        EjemploLista.add("Sofía");

        // Imprimir elementos de la lista.
        System.out.println("Elementos de la lista");

        for (int i = 0; i <= EjemploLista.size() - 1; i++) {
            System.out.println(EjemploLista.get(i));
        }

        System.out.println("");
        System.out.println("Tamaño de la lista: " + EjemploLista.size());
        System.out.println("Primer elemento de la lista: " + EjemploLista.get(0));

        // Agregar otro elemento a la lista.
        EjemploLista.add("Alicia");

        System.out.println("");
        System.out.println("Elementos de la lista con el que se agrego");
        for (int i = 0; i <= EjemploLista.size() - 1; i++) {
            System.out.println(EjemploLista.get(i));
        }

        EjemploLista.remove("Juan");

        System.out.println("");
        System.out.println("Elementos de la lista despues de eliminar a Juan");
        System.out.println(EjemploLista);

        // Elimina al elemento de la posicion 1 de la lista.
        EjemploLista.remove (1);

        System.out.println("");
        System.out.println("Elementos de la lista despues de eliminar al elemeno de la posicion 1 de la lista");
        System.out.println(EjemploLista);

        System.out.println("");
        System.out.println("Escribe un nombre");
        Nombre = br.readLine();

        // Agregar el elemento que se agrego a la lista.
        EjemploLista.add(Nombre);

        // Otra manera de imprimir la Lista con la clase Iterator.
        Iterator i = EjemploLista.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }

        // Si la lista contiene a un elmento.
        System.out.println(EjemploLista.contains("José"));

        // Si la lista esta vacia.
        System.out.println(EjemploLista.isEmpty());

        // Cambiar el elemento del subindice 1 de la lista por "Felix".
        EjemploLista.set (1, "Félix");
        System.out.println(EjemploLista);
        // Obtener datos entre un subindice y otro.
        System.out.println(EjemploLista.subList(0, 2));
        // El metodo ordena la lista de manera ascendente (en este caso de la A a la Z).
        EjemploLista.sort(null);
        System.out.println(EjemploLista);
        // Ahora con este metodo los ordena de manera descendete (Z a la A).
        Collections.sort (EjemploLista, Collections.reverseOrder());
        System.out.println(EjemploLista);

        // Vaciar la lista.
        EjemploLista.clear();
        System.out.println(EjemploLista);
    }
}