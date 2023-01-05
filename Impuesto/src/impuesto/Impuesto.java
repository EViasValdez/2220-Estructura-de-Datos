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
 * @author yayis (Correcciones por EViasValdez)
 */
public class Impuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // La clase Input se utiliza para leer datos.
        InputStreamReader isr = new InputStreamReader (System.in);
        // La clase BufferedReader se utiliza para convertir los
        // datos que se lean ya que indeterminadamente solo lee cadenas de caracteres.
        BufferedReader br = new BufferedReader (isr);
        // Los identificadores "Precio" (tipo float, que es una variable) asi como "Impuesto" son definidos solo que
        // esta es una constante ya tiene definido un valor 0.05f, a la f se le agrega para especificar que es de tipo
        // flotante y total (variable) que esta inicializada en cero debido a que no se conoce el valor de la variable
        // por ser el resultado de una operación es decir todas las variables que sean el resultado de una operación
        // se inicializan con 0 pues no se sabe su valor, no se va a leer y ademas para limpiar la variable es decir
        // que no traiga basura como valor inicial.
        float Precio, Impuesto = .05f, Total = 0;
        // Es enviado un mensaje en pantalla el cual mostrara "Escribe el Precio".
        System.out.println("Escribe el precio");
        // Se lee la variable "Precio" la linea que se lee con el objeto "br" y el método readline se ha convertido a un
        // dato de tipo float con el método parse float que pertenece a la clase de los Float y se le asigna a la 
        // variable "Precio".
        Precio = Float.parseFloat(br.readLine());
        // La operación del porcentaje se realiza.
        Total = Precio + (Precio * Impuesto);
        // Se envía un mensaje para imprimir el total de la variable a la que se le asigno el valor del total.
        System.out.println("Total a pagar con impuesto: " + Total);
    }
}