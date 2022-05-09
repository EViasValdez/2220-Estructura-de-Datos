/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuesto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yayis
 */
public class Impuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // La lase Input se utiliza para leer datos.
        InputStreamReader isr = new InputStreamReader (System.in);
        // La clase BuferredReader se utiliza para convertir los
        // datos que se lean ya que por default solo lee cadenas de caractres.
        BufferedReader br = new BufferedReader (isr);
        // Los identificadores "precio" (tipo float, que es una variable) asi como "impuesto" son definidos solo que
        // esta es una constante ya tiene deifnido un valor 0.05f, a la f se le agrega para especificar que es de tipo
        // flotante y total (variable) que esta inicializada en cero debido a que no se conoce el valor de la variable
        // por ser el resultado de una operacion es decir todas las variables que sean el resultado de una operacion
        // se inicializan con 0 pues no se sabe su valor, no se va a leer y ademas para limpiar la variable es decir
        // que no traiga basura como valor inicial.
        float precio, impuesto = .05f, total = 0;
        // Es enviado un mensaje en pantalla el cual mostrara "Escribe el precio".
        System.out.println("Escribe el precio");
        // Se lee la variable "precio" la linea que se lee con el objeto "br" y el metodo readline se conviertido a un
        // dato de tipo float con el metodo parse float que pertenece a la clase de los Float y se le asigna a la 
        // variable "precio".
        precio = Float.parseFloat(br.readLine());
        // La operacion del porcentaje se realiza.
        total = precio + (precio * impuesto);
        // Se envia un mensaje para imprimir el total de la variable a la que se le asigno el valor del total.
        System.out.println("Total a pagar con impuesto: " + total);
    }
}