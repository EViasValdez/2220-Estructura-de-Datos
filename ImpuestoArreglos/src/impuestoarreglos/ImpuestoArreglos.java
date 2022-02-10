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
 * @author yayis
 */
public class ImpuestoArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // Clase Input la cual se utiliza para leer datos
        InputStreamReader isr = new InputStreamReader(System.in);
        // Clase BuferredReader la cual se utiliza para convertir los datos que
        // se lean ya que predeterminadamente solo lee cadenas de caractres.
        BufferedReader br = new BufferedReader(isr);
        // Se declararon los identificadores llamados "precio" de tipo float (cuyo tamaño es de 4) asi como "impuesto"
        // solo que esta es una constante ya tiene deifnido un valor 0.05f la f se le agrega para especificar
        // que es de tipo flotante y total, su valor es de 0 debido a que no se conoce el valor de la variable por
        // ser el resultado de una operacion, todas las variables que sean el resultado de una operacion 
        // se inicializan con 0 pues su valor es desconocido
        // ,no se leera y ademas para limpiar la variable con el proposito 
        // de que no traiga basura como valor inicial.
        float precio[] = new float [4], impuesto = .05f, total = 0; // Todas las variables con globales.
        
        for (int i = 0; i < 4; i++){
            // Se recorre con el ciclo for el arreglo
            // int i = 0; es el valor inicial del arreglo, es decir la primer posicion del mismo
            // i < 4 es la condicion de fi de ciclo, es decir lo va a repetir 4 veces
            // i++ equivale a escribir i=i+1 es decir es el contador que realiza el numero de veces del ciclo
            System.out.println("Escribe el Precio :");
            // Es leida la variable "precio[i]" ya que por tener corchetes es un arreglo,
            // lee datos y los asigna a las posiciones del arreglo la linea que se lee con el objeto
            // br y el metodo readline se convierte a un dato de tipo float con el metodo parse float
            // que pertenece a la clase de los Float y se le asigna a la variable "precio".
            precio[i] = Float.parseFloat(br.readLine());
            // Se realiza la operacion del porcentaje, cada dato en cada posicion del arreglo "precio[i]".
            total = precio[i] + (precio[i] * impuesto);
            // Es enviado un mensaje para imprimir el total de la variable a la que se le asigno el valor del total.
            System.out.println("Total a pagar con impuesto " + total);
        }
    }
}