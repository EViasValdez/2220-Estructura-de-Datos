/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestoarreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yayis (Correcciones por EViasValdez)
 */

public class ImpuestoArreglos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // La clase Input se usa para leer datos
        InputStreamReader isr = new InputStreamReader(System.in);
        // La clase BuferredReader se utiliza para convertir los datos que
        // se lean ya que de forma predeterminada solo lee cadenas de caracteres.
        BufferedReader br = new BufferedReader(isr);
        // Se declararon los identificadores llamados "Precio" de tipo float (cuyo tamaño es de 4) asi como "impuesto"
        // solo que esta constante ya tiene definido un valor 0.05f, la f se le agrega para especificar que es de tipo
        // flotante y total, su valor es de 0 debido a que no se conoce el valor de la variable por ser el resultado de
        // una operación, todas las variables que sean el resultado de una operación se inicializan con 0 pues si su
        // valor es desconocido la operación no se leerá y ademas para limpiar la variable con el propósito de que no
        // traiga basura como valor inicial.
        float Precio [] = new float[4], Impuesto = .05f, Total = 0; // Todas las variables con globales.
        
        for (int i = 0; i < 4; i++) {
            // Se recorre con el ciclo for el arreglo "int i = 0;" que es el valor inicial del arreglo, es decir
            // la primer posición del mismo "i < 4" es la condición de fin de ciclo, es decir lo va a repetir 4 veces
            // i++ equivale a escribir i = i + 1 es decir es el contador que realiza el numero de veces del ciclo
            System.out.println("Escribe el Precio: ");
            // Es leída la variable "Precio [i]" ya que por tener corchetes es un arreglo, lee datos y los asigna a las posiciones
            // del arreglo la linea que se lee con el objeto "br" y el método readline se convierte a un dato de tipo float
            // con el método parse float que pertenece a la clase de los Float y se le asigna a la variable "Precio".
            Precio[i] = Float.parseFloat(br.readLine());
            // Se realiza la operación del porcentaje, cada dato en cada posición del arreglo "Precio [i]".
            Total = Precio[i] + (Precio[i] * Impuesto);
            // Es enviado un mensaje para imprimir el total de la variable a la que se le asigno el valor del total.
            System.out.println("Total a pagar con impuesto: " + Total);
        }
    }
}